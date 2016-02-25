package com.crivero.gravilityprueba.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by crivero on 23/02/2016.
 */
public class Category {
    @SerializedName("attributes")
    @Expose
    private Attributes4 attributes;

    /**
     *
     * @return
     * The attributes
     */
    public Attributes4 getAttributes() {
        return attributes;
    }

    /**
     *
     * @param attributes
     * The attributes
     */
    public void setAttributes(Attributes4 attributes) {
        this.attributes = attributes;
    }
}
