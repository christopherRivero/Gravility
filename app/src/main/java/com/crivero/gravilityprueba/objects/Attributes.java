package com.crivero.gravilityprueba.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by crivero on 23/02/2016.
 */
public class Attributes {
    @SerializedName("href")
    @Expose
    private String href;
    @SerializedName("rel")
    @Expose
    private String rel;

    /**
     *
     * @return
     * The href
     */
    public String getHref() {
        return href;
    }

    /**
     *
     * @param href
     * The href
     */
    public void setHref(String href) {
        this.href = href;
    }

    /**
     *
     * @return
     * The rel
     */
    public String getRel() {
        return rel;
    }

    /**
     *
     * @param rel
     * The rel
     */
    public void setRel(String rel) {
        this.rel = rel;
    }
}
