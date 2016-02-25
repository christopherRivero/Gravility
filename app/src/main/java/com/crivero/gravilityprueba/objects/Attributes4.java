package com.crivero.gravilityprueba.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by crivero on 23/02/2016.
 */
public class Attributes4 {
    @SerializedName("scheme")
    @Expose
    private String scheme;
    @SerializedName("term")
    @Expose
    private String term;
    @SerializedName("label")
    @Expose
    private String label;
    @SerializedName("im:id")
    @Expose
    private String imId;

    @Override
    public String toString() {
        return this.label;
    }

    /**
     *
     * @return
     * The scheme
     */
    public String getScheme() {
        return scheme;
    }

    /**
     *
     * @param scheme
     * The scheme
     */
    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     *
     * @return
     * The term
     */
    public String getTerm() {
        return term;
    }

    /**
     *
     * @param term
     * The term
     */
    public void setTerm(String term) {
        this.term = term;
    }

    /**
     *
     * @return
     * The label
     */
    public String getLabel() {
        return label;
    }

    /**
     *
     * @param label
     * The label
     */
    public void setLabel(String label) {
        this.label = label;
    }

    /**
     *
     * @return
     * The imId
     */
    public String getImId() {
        return imId;
    }

    /**
     *
     * @param imId
     * The im:id
     */
    public void setImId(String imId) {
        this.imId = imId;
    }
}
