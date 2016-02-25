package com.crivero.gravilityprueba.objects;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by crivero on 23/02/2016.
 */
public class Entry {
    @SerializedName("im:artist")
    @Expose
    private ImArtist imArtist;
    @SerializedName("id")
    @Expose
    private Id1 id;
    @SerializedName("im:price")
    @Expose
    private ImPrice imPrice;
    @SerializedName("summary")
    @Expose
    private Summary summary;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("title")
    @Expose
    private Title1 title;
    @SerializedName("im:releaseDate")
    @Expose
    private ImReleaseDate imReleaseDate;
    @SerializedName("im:image")
    @Expose
    private List<ImImage> imImage = new ArrayList<ImImage>();
    @SerializedName("link")
    @Expose
    private Link_ link;
    @SerializedName("rights")
    @Expose
    private Rights rights;
    @SerializedName("im:contentType")
    @Expose
    private ImContentType imContentType;
    @SerializedName("im:name")
    @Expose
    private ImName imName;


    /**
     *
     * @return
     * The imArtist
     */
    public ImArtist getImArtist() {
        return imArtist;
    }

    /**
     *
     * @param imArtist
     * The im:artist
     */
    public void setImArtist(ImArtist imArtist) {
        this.imArtist = imArtist;
    }

    /**
     *
     * @return
     * The id
     */
    public Id1 getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Id1 id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The imPrice
     */
    public ImPrice getImPrice() {
        return imPrice;
    }

    /**
     *
     * @param imPrice
     * The im:price
     */
    public void setImPrice(ImPrice imPrice) {
        this.imPrice = imPrice;
    }

    /**
     *
     * @return
     * The summary
     */
    public Summary getSummary() {
        return summary;
    }

    /**
     *
     * @param summary
     * The summary
     */
    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    /**
     *
     * @return
     * The category
     */
    public Category getCategory() {
        return category;
    }

    /**
     *
     * @param category
     * The category
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     *
     * @return
     * The title
     */
    public Title1 getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(Title1 title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The imReleaseDate
     */
    public ImReleaseDate getImReleaseDate() {
        return imReleaseDate;
    }

    /**
     *
     * @param imReleaseDate
     * The im:releaseDate
     */
    public void setImReleaseDate(ImReleaseDate imReleaseDate) {
        this.imReleaseDate = imReleaseDate;
    }

    /**
     *
     * @return
     * The imImage
     */
    public List<ImImage> getImImage() {
        return imImage;
    }

    /**
     *
     * @param imImage
     * The im:image
     */
    public void setImImage(List<ImImage> imImage) {
        this.imImage = imImage;
    }

    /**
     *
     * @return
     * The link
     */
    public Link_ getLink() {
        return link;
    }

    /**
     *
     * @param link
     * The link
     */
    public void setLink(Link_ link) {
        this.link = link;
    }

    /**
     *
     * @return
     * The rights
     */
    public Rights getRights() {
        return rights;
    }

    /**
     *
     * @param rights
     * The rights
     */
    public void setRights(Rights rights) {
        this.rights = rights;
    }

    /**
     *
     * @return
     * The imContentType
     */
    public ImContentType getImContentType() {
        return imContentType;
    }

    /**
     *
     * @param imContentType
     * The im:contentType
     */
    public void setImContentType(ImContentType imContentType) {
        this.imContentType = imContentType;
    }

    /**
     *
     * @return
     * The imName
     */
    public ImName getImName() {
        return imName;
    }

    /**
     *
     * @param imName
     * The im:name
     */
    public void setImName(ImName imName) {
        this.imName = imName;
    }



}
