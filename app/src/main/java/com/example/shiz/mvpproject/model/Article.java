package com.example.shiz.mvpproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Article {

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("text")
    @Expose
    private String text;

    @SerializedName("image_url")
    @Expose
    private String image_url;

    @SerializedName("likes_count")
    @Expose
    private Integer likes_count;

    @SerializedName("comments_count")
    @Expose
    private Integer comments_count;

    @SerializedName("share_count")
    @Expose
    private Integer share_count;

    @SerializedName("url")
    @Expose
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public Integer getLikes_count() {
        return likes_count;
    }

    public void setLikes_count(Integer likes_count) {
        this.likes_count = likes_count;
    }

    public Integer getComments_count() {
        return comments_count;
    }

    public void setComments_count(Integer comments_count) {
        this.comments_count = comments_count;
    }

    public Integer getShare_count() {
        return share_count;
    }

    public void setShare_count(Integer share_count) {
        this.share_count = share_count;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Article(String id, String title, String text, String image_url, Integer likes_count, Integer comments_count, Integer share_count, String url) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.image_url = image_url;
        this.likes_count = likes_count;
        this.comments_count = comments_count;
        this.share_count = share_count;
        this.url = url;
    }
}
