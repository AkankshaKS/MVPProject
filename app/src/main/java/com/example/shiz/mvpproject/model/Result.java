package com.example.shiz.mvpproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Result {

    @SerializedName("code")
    @Expose
    private Integer code;

    @SerializedName("content")
    @Expose
    private ArrayList<Content> content;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public ArrayList<Content> getContent() {
        return content;
    }

    public void setContent(ArrayList<Content> content) {
        this.content = content;
    }

    public Result() {
    }

    public Result(Integer code, ArrayList<Content> content) {
        this.code = code;
        this.content = content;

    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", content=" + content +
                '}';
    }
}

