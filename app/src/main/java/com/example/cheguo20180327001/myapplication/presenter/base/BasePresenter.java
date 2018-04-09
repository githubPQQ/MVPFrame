package com.example.cheguo20180327001.myapplication.presenter.base;

import android.app.Activity;

import com.example.cheguo20180327001.myapplication.bean.HttpResult;
import com.example.cheguo20180327001.myapplication.http.CallBack;
import com.example.cheguo20180327001.myapplication.view.base.IView;
import com.trello.rxlifecycle2.LifecycleProvider;

import java.lang.ref.SoftReference;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by CheGuo20180327001 on 2018/4/9.
 */

public abstract class BasePresenter<T extends IView> {
    protected SoftReference<T> mView;

    public void setView(T view) {
        this.mView = new SoftReference<T>(view);
    }

    protected void request(Observable<HttpResult> observable, final CallBack callBack) {

        //activity 生命周期结束，observable自动取消请求
        if (mView.get() instanceof LifecycleProvider) {
            observable = observable
                    .compose(((LifecycleProvider) mView.get()).bindToLifecycle());

        }
        //发起请求
        observable.subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<HttpResult>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(HttpResult httpResult) {
                        if (mView.get() instanceof Activity) {
                            if (((Activity) mView.get()).isFinishing())
                                return;
                        }
                        callBack.onSuccess(httpResult);
                    }

                    @Override
                    public void onError(Throwable e) {
                        if (mView.get() instanceof Activity) {
                            if (((Activity) mView.get()).isFinishing())
                                return;
                        }
                        callBack.onFail(e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        if (mView.get() instanceof Activity) {
                            if (((Activity) mView.get()).isFinishing())
                                return;
                        }
                        callBack.onComplete();
                    }
                });
    }

}
