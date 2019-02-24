package com.example.shiz.mvpproject.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.shiz.mvpproject.adapter.ArticleAdapter;
import com.example.shiz.mvpproject.model.Article;
import com.example.shiz.mvpproject.model.Content;
import com.example.shiz.mvpproject.model.Result;
import com.example.shiz.mvpproject.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements  MainViewInterface{

    RecyclerView rvArticle;
    ArrayList<Content> contents;

    private String TAG = "MainActivity";
    RecyclerView.Adapter adapter;
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvArticle = findViewById(R.id.rvArticle);
        setupMVP();
        setupViews();
        getArticleList();
    }

    private void getArticleList() {
        mainPresenter.getArticle();
    }

    private void setupMVP() {
        mainPresenter = new MainPresenter(this);
    }

    private void setupViews() {
        rvArticle.setLayoutManager(new LinearLayoutManager(this));
    }


    @Override
    public void showToast(String str) {
        Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
    }

    @Override
    public void showProgressBar() {

    }

    @Override
    public void hideProgressBar() {

    }

    @Override
    public void displayArticle(Result result) {

        if(result != null){
           contents = result.getContent();
            adapter = new ArticleAdapter(contents, MainActivity.this);
            rvArticle.setAdapter(adapter);
        }else{
            Toast.makeText(this, "Content response is null", Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void displayError(String s) {
        showToast(s);
    }

    @Override
    public void onBackPressed() {
    super.onBackPressed();;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
