package com.example.cheguo20180327001.myapplication.component.module;

import com.example.cheguo20180327001.myapplication.component.scope.PerActivity;
import com.example.cheguo20180327001.myapplication.http.service.MainService;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

/**
 * Created by CheGuo20180327001 on 2018/4/9.
 */
@Module
public class ApiModule {
    @PerActivity
    @Provides
    MainService provideMainService(Retrofit retrofit) {
        return retrofit.create(MainService.class);
    }
}
