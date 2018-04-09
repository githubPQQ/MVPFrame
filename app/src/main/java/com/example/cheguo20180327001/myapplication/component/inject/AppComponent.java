package com.example.cheguo20180327001.myapplication.component.inject;

import com.example.cheguo20180327001.myapplication.component.module.AppModule;
import com.example.cheguo20180327001.myapplication.component.module.HttpModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by CheGuo20180327001 on 2018/4/9.
 */

@Component(modules = {AppModule.class, HttpModule.class})
@Singleton
public interface AppComponent {
    Retrofit provideRetrofit();
}
