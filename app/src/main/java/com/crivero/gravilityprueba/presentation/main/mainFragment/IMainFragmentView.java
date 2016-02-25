package com.crivero.gravilityprueba.presentation.main.mainFragment;

/**
 * Created by crivero on 22/02/2016.
 */
public interface IMainFragmentView {
    /**
     *Hace la llamada al webService e infla objeto.
     */
    void inicialzaListado();

    /**
     * Inflamos la lista.
     */
    void cargarLista();

    /**
     * Item Click
     */
    void goToDetailElement();
}
