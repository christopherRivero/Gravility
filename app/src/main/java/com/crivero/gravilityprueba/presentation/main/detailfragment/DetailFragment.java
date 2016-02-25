package com.crivero.gravilityprueba.presentation.main.detailfragment;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.crivero.gravilityprueba.R;
import com.crivero.gravilityprueba.application.Gravility;
import com.crivero.gravilityprueba.common.ImageLoader;
import com.crivero.gravilityprueba.objects.Entry;


public class DetailFragment extends Fragment implements IDetailFragmentView{



    public DetailFragment() {
        // Required empty public constructor
    }

    Gravility appState;
    IDetailFragmentPresenter presenter;
    ImageView imgLogo;
    TextView tvTitle;
    TextView tvSubTitle;
    TextView tvDescription;
    TextView tvPrice;
    Button btnDownload;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter = new DetailFragmentPresenter((AppCompatActivity) getActivity(), this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        appState = (Gravility) getActivity().getApplication();
        imgLogo = (ImageView) view.findViewById(R.id.img_logo);
        tvTitle = (TextView) view.findViewById(R.id.tv_title);
        tvSubTitle = (TextView) view.findViewById(R.id.tv_sub_title);
        tvDescription = (TextView) view.findViewById(R.id.tv_description);
        tvPrice = (TextView) view.findViewById(R.id.tv_price);
        btnDownload = (Button) view.findViewById(R.id.btn_download);

        presenter.cargarLista();

        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browse = new Intent( Intent.ACTION_VIEW , Uri.parse(appState.entry.getId().getLabel()) );

                startActivity( browse );

            }
        });
        return view;
    }

    @Override
    public void cargarLista() {
        Entry entry = appState.entry;

        ImageLoader imgLoader = new ImageLoader(getActivity().getApplicationContext());
        imgLoader.DisplayImage(entry.getImImage().get(2).getLabel(), R.drawable.ic_launcher, imgLogo);
        tvTitle.setText(entry.getImName().getLabel());
        tvSubTitle.setText(entry.getTitle().getLabel());
        tvDescription.setText(entry.getSummary().getLabel());
        String amount = entry.getImPrice().getAttributes().getAmount();
        if(amount.equals("0.00000")){
            amount = "Free ";
        }
        tvPrice.setText(amount);
    }

}

