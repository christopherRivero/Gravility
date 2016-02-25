package com.crivero.gravilityprueba.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crivero on 23/02/2016.
 */
public class Feed {
    @SerializedName("id")
    @Expose
    private Id id;
    @SerializedName("icon")
    @Expose
    private Icon icon;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("title")
    @Expose
    private Title title;
    @SerializedName("updated")
    @Expose
    private Updated updated;
    @SerializedName("link")
    @Expose
    private List<Link> link = new ArrayList<Link>();
    @SerializedName("entry")
    @Expose
    private List<Entry> entry = new ArrayList<Entry>();

    /**
     *
     * @return
     * The id
     */
    public Id getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Id id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     *
     * @param icon
     * The icon
     */
    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    /**
     *
     * @return
     * The author
     */
    public Author getAuthor() {
        return author;
    }

    /**
     *
     * @param author
     * The author
     */
    public void setAuthor(Author author) {
        this.author = author;
    }

    /**
     *
     * @return
     * The title
     */
    public Title getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(Title title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The updated
     */
    public Updated getUpdated() {
        return updated;
    }

    /**
     *
     * @param updated
     * The updated
     */
    public void setUpdated(Updated updated) {
        this.updated = updated;
    }

    /**
     *
     * @return
     * The link
     */
    public List<Link> getLink() {
        return link;
    }

    /**
     *
     * @param link
     * The link
     */
    public void setLink(List<Link> link) {
        this.link = link;
    }

    /**
     *
     * @return
     * The entry
     */
    public List<Entry> getEntry() {
        return entry;
    }

    /**
     *
     * @param entry
     * The entry
     */
    public void setEntry(List<Entry> entry) {
        this.entry = entry;
    }
}
