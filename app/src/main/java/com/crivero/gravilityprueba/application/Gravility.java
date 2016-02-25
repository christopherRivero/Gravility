package com.crivero.gravilityprueba.application;

import android.app.Application;

import com.crivero.gravilityprueba.objects.Entry;

/**
 * Created by crivero on 24/02/2016.
 *
 * Clase que extiende aplicación, metemos variables para tener acceso a ellas desde cualquier pantalla.
 */
public class Gravility extends Application {

    public Entry entry = new Entry();
    public String category = "";
}
