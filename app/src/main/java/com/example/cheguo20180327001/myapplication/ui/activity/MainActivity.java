package com.example.cheguo20180327001.myapplication.ui.activity;

import com.example.cheguo20180327001.myapplication.App;
import com.example.cheguo20180327001.myapplication.R;
import com.example.cheguo20180327001.myapplication.bean.HttpResult;
import com.example.cheguo20180327001.myapplication.presenter.MainPresenter;
import com.example.cheguo20180327001.myapplication.ui.base.BaseActivity;
import com.example.cheguo20180327001.myapplication.view.IViewMain;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends BaseActivity<MainPresenter> implements IViewMain {

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void inject() {
        App.getInstance()
                .getAcitivityComponent().inject(this);
    }

    @Override
    protected void initData() {
        mPresenter.getNetData();
//
//           .subscribeOn(Schedulers.io())
//                .observeOn(AndroidSchedulers.mainThread())
    }


    @Override
    public void onLoadSuccess(String result) {

    }

    @Override
    public void onLoadFail(String msg) {

    }
}
