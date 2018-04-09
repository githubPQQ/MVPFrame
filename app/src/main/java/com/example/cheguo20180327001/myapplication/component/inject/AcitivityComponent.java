package com.example.cheguo20180327001.myapplication.component.inject;

import com.example.cheguo20180327001.myapplication.component.module.ApiModule;
import com.example.cheguo20180327001.myapplication.component.scope.PerActivity;
import com.example.cheguo20180327001.myapplication.ui.activity.MainActivity;

import dagger.Component;

/**
 * Created by CheGuo20180327001 on 2018/4/9.
 */
@PerActivity
@Component(dependencies = {AppComponent.class}, modules = {ApiModule.class})
public interface AcitivityComponent {

    void inject(MainActivity mainActivity);

}
