package com.example.shiz.mvpproject.network;

import com.example.shiz.mvpproject.model.Result;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface NetworkInterface {

    @GET("/api/content-feed/")
    Observable<Result> getArticle();
}
