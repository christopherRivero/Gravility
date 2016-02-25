package com.crivero.gravilityprueba.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by crivero on 23/02/2016.
 */
public class Author {
    @SerializedName("uri")
    @Expose
    private Uri uri;
    @SerializedName("name")
    @Expose
    private Name name;

    /**
     *
     * @return
     * The uri
     */
    public Uri getUri() {
        return uri;
    }

    /**
     *
     * @param uri
     * The uri
     */
    public void setUri(Uri uri) {
        this.uri = uri;
    }

    /**
     *
     * @return
     * The name
     */
    public Name getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(Name name) {
        this.name = name;
    }
}
