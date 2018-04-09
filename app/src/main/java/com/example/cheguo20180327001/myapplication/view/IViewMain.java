package com.example.cheguo20180327001.myapplication.view;

import com.example.cheguo20180327001.myapplication.bean.HttpResult;
import com.example.cheguo20180327001.myapplication.view.base.IView;

/**
 * Created by CheGuo20180327001 on 2018/4/9.
 */

public interface IViewMain extends IView {
    void onLoadSuccess(String result);

    void onLoadFail(String msg);
}
