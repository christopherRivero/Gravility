package com.crivero.gravilityprueba.presentation.main.detailfragment;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by jmercadal on 25/02/2016.
 */
public class DetailFragmentPresenter implements IDetailFragmentPresenter {
    AppCompatActivity activity;
    IDetailFragmentView detailView;

    public DetailFragmentPresenter(AppCompatActivity activity, IDetailFragmentView detailView) {
        this.activity = activity;
        this.detailView = detailView;
    }


    @Override
    public void cargarLista() {
        detailView.cargarLista();
    }
}
