package com.example.cheguo20180327001.myapplication.presenter;

import android.app.Activity;

import com.example.cheguo20180327001.myapplication.bean.HttpResult;
import com.example.cheguo20180327001.myapplication.http.CallBack;
import com.example.cheguo20180327001.myapplication.http.service.MainService;
import com.example.cheguo20180327001.myapplication.presenter.IPresenter.IMainPresenter;
import com.example.cheguo20180327001.myapplication.presenter.base.BasePresenter;
import com.example.cheguo20180327001.myapplication.view.IViewMain;

import javax.inject.Inject;


/**
 * Created by CheGuo20180327001 on 2018/4/9.
 */

public class MainPresenter extends BasePresenter<IViewMain> implements IMainPresenter {
    private MainService mainService;

    @Inject
    public MainPresenter(MainService mainService) {
        this.mainService = mainService;
    }

    @Override
    public void getNetData() {
        request(mainService.gethotcars(), new CallBack() {
            @Override
            public void onSuccess(HttpResult httpResult) {
                if (httpResult.getCode() == 200) {
                    mView.get().onLoadSuccess(httpResult.getData().toString());
                }
                if (httpResult.getCode() == 400) {
                    mView.get().onLoadFail(httpResult.getMsg());
                }

            }

            @Override
            public void onFail(String msg) {
                mView.get().onLoadFail(msg);
            }

            @Override
            public void onComplete() {

            }
        });
    }

    @Override
    public void getLocalData() {

    }
}
