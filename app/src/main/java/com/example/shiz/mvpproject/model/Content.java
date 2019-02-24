package com.example.shiz.mvpproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Content {

   /* @SerializedName("index")
    @Expose
    private ArrayList<Index> index;

    public ArrayList<Index> getIndex() {
        return index;
    }

    public void setIndex(ArrayList<Index> index) {
        this.index = index;
    }
*/

    @SerializedName("article")
    @Expose
    private Article article;


    @SerializedName("categories")
    @Expose
    private ArrayList<Categories> categories;

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public ArrayList<Categories> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Categories> categories) {
        this.categories = categories;
    }

    public Content(Article article, ArrayList<Categories> categories) {
        this.article = article;
        this.categories = categories;
    }
}

