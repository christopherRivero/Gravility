package com.crivero.gravilityprueba.presentation.main.mainFragment;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by crivero on 22/02/2016.
 */
public class MainFragmentPresenter implements IMainFragmentPresenter{
    private IMainFragmentView mainView;
    private AppCompatActivity activity;

    /**
     * Instantiates a new Main presenter impl.
     *
     * @param activity the activity
     * @param mainView main view
     */
    public MainFragmentPresenter(AppCompatActivity activity, IMainFragmentView mainView ) {
        this.mainView = mainView;
        this.activity=activity;
    }


    @Override
    public void goToDetailElement() {
        mainView.goToDetailElement();
    }

    @Override
    public void inicialzaListado() {
        mainView.inicialzaListado();
    }

    @Override
    public void cargarLista() {
        mainView.cargarLista();
    }
}
