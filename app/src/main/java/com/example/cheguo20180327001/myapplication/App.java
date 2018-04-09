package com.example.cheguo20180327001.myapplication;

import android.app.Application;

import com.example.cheguo20180327001.myapplication.component.inject.AcitivityComponent;
import com.example.cheguo20180327001.myapplication.component.inject.AppComponent;
import com.example.cheguo20180327001.myapplication.component.inject.DaggerAcitivityComponent;
import com.example.cheguo20180327001.myapplication.component.inject.DaggerAppComponent;
import com.example.cheguo20180327001.myapplication.component.module.ApiModule;
import com.example.cheguo20180327001.myapplication.component.module.AppModule;
import com.example.cheguo20180327001.myapplication.component.module.HttpModule;

/**
 * Created by CheGuo20180327001 on 2018/4/9.
 */

public class App extends Application {
    AppComponent mAppComponent;

    private static App instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        if (mAppComponent == null)
            mAppComponent = DaggerAppComponent.builder()
                    .appModule(new AppModule(this))
                    .httpModule(new HttpModule())
                    .build();
    }

    public static App getInstance() {
        return instance;
    }


    public AcitivityComponent getAcitivityComponent() {
        AcitivityComponent acitivityComponent = DaggerAcitivityComponent
                .builder()
                .appComponent(mAppComponent)
                .apiModule(new ApiModule())
                .build();
        return acitivityComponent;
    }

}
