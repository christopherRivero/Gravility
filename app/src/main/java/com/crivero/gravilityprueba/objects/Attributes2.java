package com.crivero.gravilityprueba.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by crivero on 23/02/2016.
 */
public class Attributes2 {
    @SerializedName("im:bundleId")
    @Expose
    private String imBundleId;
    @SerializedName("im:id")
    @Expose
    private String imId;

    /**
     * @return The imBundleId
     */
    public String getImBundleId() {
        return imBundleId;
    }

    /**
     * @param imBundleId The im:bundleId
     */
    public void setImBundleId(String imBundleId) {
        this.imBundleId = imBundleId;
    }

    /**
     * @return The imId
     */
    public String getImId() {
        return imId;
    }

    /**
     * @param imId The im:id
     */
    public void setImId(String imId) {
        this.imId = imId;
    }
}
