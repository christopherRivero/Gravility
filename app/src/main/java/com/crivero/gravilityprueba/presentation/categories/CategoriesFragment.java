package com.crivero.gravilityprueba.presentation.categories;

import android.app.ProgressDialog;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.crivero.gravilityprueba.R;
import com.crivero.gravilityprueba.application.Gravility;
import com.crivero.gravilityprueba.presentation.main.mainFragment.MainFragment;

import java.util.List;

public class CategoriesFragment extends Fragment implements ICategoriesView{


    public CategoriesFragment() {
        // Required empty public constructor
    }

    String URL = "https://itunes.apple.com/us/rss/topfreeapplications/limit=20/json";
    Gravility appState;
    ListView lstCategories;
    ICategoriesPresenter presenter;
    String[] values = new String[]{"Games",
            "Entertainment",
            "Social Networking",
            "Navigation",
            "Shopping",
            "Music",
            "Education",
            "Photo & Video"
    };
    TextView tvCategoriesTitle;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new CategoriesFragmentPresenter((AppCompatActivity) getActivity(), this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_categories, container, false);
        appState = (Gravility) getActivity().getApplication();
        lstCategories = (ListView) view.findViewById(R.id.lst_categories);
        tvCategoriesTitle = (TextView) view.findViewById(R.id.tv_categories_title);

        AsynkTasckListado asynkTasckListado = new AsynkTasckListado();
        asynkTasckListado.execute();

        lstCategories.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s = lstCategories.getItemAtPosition(position).toString();
                appState.category = lstCategories.getItemAtPosition(position).toString();
                presenter.goToApps();
            }
        });

        return view;
    }


    @Override
    public void cargarLista() {
        tvCategoriesTitle.setText(R.string.title_categories_fragment);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, values);
        lstCategories.setAdapter(adapter);

    }

    @Override
    public void goToApps() {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(R.anim.slide_in_right,0,0, R.anim.slide_out_left);

        Fragment fragment = new MainFragment();
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
            progDailog.setMessage("Cargando categorias...");
            progDailog.setIndeterminate(false);
            progDailog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            progDailog.setCancelable(false);
            progDailog.show();
        }

        @Override
        protected View doInBackground(Void... params) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
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
