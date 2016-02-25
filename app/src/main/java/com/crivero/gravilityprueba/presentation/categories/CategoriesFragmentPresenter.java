package com.crivero.gravilityprueba.presentation.categories;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by crivero on 24/02/2016.
 */
public class CategoriesFragmentPresenter implements ICategoriesPresenter{
    AppCompatActivity activity;
    ICategoriesView categoriesView;

    public CategoriesFragmentPresenter(AppCompatActivity activity, ICategoriesView categoriesView) {
        this.activity = activity;
        this.categoriesView = categoriesView;
    }


    @Override
    public void cargarLista() {
        categoriesView.cargarLista();
    }

    @Override
    public void goToApps() {
        categoriesView.goToApps();
    }
}
