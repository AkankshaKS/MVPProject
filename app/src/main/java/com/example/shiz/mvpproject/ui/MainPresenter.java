package com.example.shiz.mvpproject.ui;

import android.util.Log;

import com.example.shiz.mvpproject.model.Result;
import com.example.shiz.mvpproject.network.NetworkClient;
import com.example.shiz.mvpproject.network.NetworkInterface;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.observers.DisposableObserver;
import io.reactivex.schedulers.Schedulers;


public class MainPresenter implements MainPresenterInterface{

    MainViewInterface mvi;
    private String TAG = "MainPresenter";

    public MainPresenter(MainViewInterface mvi) {
        this.mvi = mvi;
    }

    @Override
    public void getArticle(){
        getObservable().subscribeWith(getObserver());
    }

    public Observable<Result> getObservable() {
        return NetworkClient.getRetrofit().create(NetworkInterface.class)
               // .getMovies("004cbaf19212094e32aa9ef6f6577f22")
                .getArticle()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread());
    }

    public DisposableObserver<Result> getObserver(){
        return new DisposableObserver<Result>() {

            @Override
            public void onNext(@NonNull Result result) {
                Log.d(TAG,"OnNext"+ result.getContent());
                mvi.displayArticle(result);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                Log.d(TAG,"Error"+e);
                e.printStackTrace();
                mvi.displayError("Error fetching Data");
            }

            @Override
            public void onComplete() {
                Log.d(TAG,"Completed");
            }
        };
    }


}
