package com.crivero.gravilityprueba.presentation.main.mainFragment;

/**
 * Created by crivero on 22/02/2016.
 */
public interface IMainFragmentPresenter {
    /**
     *  Función que es llamada para entrar en el detalle de un elemento de la lista.
     */
    void goToDetailElement();

    /**
     *Hace la llamada al webService e infla objeto.
     */
    void inicialzaListado();

    /**
     * Inflamos la lista.
     */
    void cargarLista();

}
