package com.crivero.gravilityprueba.presentation.main.mainFragment;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.crivero.gravilityprueba.R;
import com.crivero.gravilityprueba.application.Gravility;
import com.crivero.gravilityprueba.connections.Connections;
import com.crivero.gravilityprueba.objects.Entry;
import com.crivero.gravilityprueba.objects.JsonObject;
import com.crivero.gravilityprueba.presentation.main.detailfragment.DetailFragment;
import com.crivero.gravilityprueba.presentation.main.adapter.MainEntryAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainFragment extends Fragment implements IMainFragmentView {

    public MainFragment() {
    }

    String URL = "https://itunes.apple.com/us/rss/topfreeapplications/limit=20/json";
    IMainFragmentPresenter presenter;
    ListView lstObjetos;
    JsonObject jsonObject;
    List<Entry> lista;
    Gravility appState;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new MainFragmentPresenter((AppCompatActivity) getActivity(), this);
        appState = ((Gravility) getActivity().getApplication());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        lstObjetos = (ListView) view.findViewById(R.id.lst_main);

        AsynkTasckListado asynkTasckListado = new AsynkTasckListado();
        asynkTasckListado.execute();

        lstObjetos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appState.entry = (Entry) lstObjetos.getItemAtPosition(position);
                presenter.goToDetailElement();
            }
        });

        return view;
    }

    @Override
    public void inicialzaListado(){
        //Inicializamos objeto
        jsonObject = new JsonObject();
        //inflamos objeto
        jsonObject = Connections.baseConnection(URL);
        List<Entry> entry = jsonObject.getFeed().getEntry();
        ArrayList<Entry> filtredList = new ArrayList<>();
        int size = entry.size();
        for(int i = 0; i < size ;i++ ){
            if(appState.category.equals(entry.get(i).getCategory().getAttributes().getLabel())){
                filtredList.add(entry.get(i));
            }
        }
        lista = filtredList;

    }

    @Override
    public void cargarLista() {

        MainEntryAdapter adapter = new MainEntryAdapter((AppCompatActivity)getActivity(), R.layout.main_row, lista);
        lstObjetos.setAdapter(adapter);

    }

    @Override
    public void goToDetailElement() {

        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.slide_in_right,0,0, R.anim.slide_out_left);

        Fragment fragment = new DetailFragment();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();

    }


    public class AsynkTasckListado extends AsyncTask<Void, Integer, View> {
        ProgressDialog progDailog;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progDailog = new ProgressDialog(getActivity());
            progDailog.setMessage("Cargando datos...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(false);
            progDailog.show();
        }

        @Override
        protected View doInBackground(Void... params) {

            presenter.inicialzaListado();

            return null;
        }

        @Override
        protected void onPostExecute(View view) {
            super.onPostExecute(view);
            progDailog.dismiss();
            presenter.cargarLista();

        }
    }


}
