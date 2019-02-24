package com.example.shiz.mvpproject.ui;

import com.example.shiz.mvpproject.model.Result;

public interface MainViewInterface {

    void showToast(String s);
    void showProgressBar();
    void hideProgressBar();
    void displayArticle(Result result);
    void displayError(String s);
}
