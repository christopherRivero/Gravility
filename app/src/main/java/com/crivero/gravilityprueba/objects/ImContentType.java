package com.crivero.gravilityprueba.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by crivero on 23/02/2016.
 */
public class ImContentType {
    @SerializedName("attributes")
    @Expose
    private Attributes8 attributes;

    /**
     *
     * @return
     * The attributes
     */
    public Attributes8 getAttributes() {
        return attributes;
    }

    /**
     *
     * @param attributes
     * The attributes
     */
    public void setAttributes(Attributes8 attributes) {
        this.attributes = attributes;
    }
}
