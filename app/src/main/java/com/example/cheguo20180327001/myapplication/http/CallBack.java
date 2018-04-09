package com.example.cheguo20180327001.myapplication.http;

import com.example.cheguo20180327001.myapplication.bean.HttpResult;

/**
 * Created by CheGuo20180327001 on 2018/4/9.
 */

public interface CallBack {

    void onSuccess(HttpResult httpResult);

    void onFail(String msg);

    void onComplete();

}
