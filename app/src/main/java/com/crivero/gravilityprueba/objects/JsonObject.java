package com.crivero.gravilityprueba.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by crivero on 23/02/2016.
 */
public class JsonObject {
    @SerializedName("feed")
    @Expose
    private Feed feed;

    /**
     *
     * @return
     * The feed
     */
    public Feed getFeed() {
        return feed;
    }

    /**
     *
     * @param feed
     * The feed
     */
    public void setFeed(Feed feed) {
        this.feed = feed;
    }
}
