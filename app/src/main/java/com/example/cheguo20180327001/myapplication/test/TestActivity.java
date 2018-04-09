package com.example.cheguo20180327001.myapplication.test;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.cheguo20180327001.myapplication.test.dagger2.Boss;
import com.example.cheguo20180327001.myapplication.test.dagger2.DaggerTestActivityComponent;
import com.example.cheguo20180327001.myapplication.test.dagger2.Factory;
import com.example.cheguo20180327001.myapplication.test.dagger2.Factory1;
import com.example.cheguo20180327001.myapplication.test.dagger2.Factory2;
import com.example.cheguo20180327001.myapplication.test.dagger2.TestActivityModule;

import javax.inject.Inject;

/**
 * Created by CheGuo20180327001 on 2018/4/9.
 */

public class TestActivity extends AppCompatActivity {

    @Inject
    Factory mFactory;
    @Inject
    Factory1 mFactory1;
    @Inject
    Factory2 mFactory2;
    @Inject
    Boss boss;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        DaggerTestActivityComponent.builder()
                .testActivityModule(new TestActivityModule("自定义名字"))
                .build()
                .inject(this);
    }
}
