package com.crivero.gravilityprueba.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by crivero on 23/02/2016.
 */
public class Link_ {
    @SerializedName("attributes")
    @Expose
    private Attributes7 attributes;

    /**
     *
     * @return
     * The attributes
     */
    public Attributes7 getAttributes() {
        return attributes;
    }

    /**
     *
     * @param attributes
     * The attributes
     */
    public void setAttributes(Attributes7 attributes) {
        this.attributes = attributes;
    }
}
