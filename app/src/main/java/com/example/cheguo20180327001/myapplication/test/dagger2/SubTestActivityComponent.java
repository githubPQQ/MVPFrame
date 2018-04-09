package com.example.cheguo20180327001.myapplication.test.dagger2;

import com.example.cheguo20180327001.myapplication.test.SubActivity;
import com.example.cheguo20180327001.myapplication.test.TestActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by CheGuo20180327001 on 2018/4/9.
 */
@Component(dependencies = {TestActivityComponent.class})
public interface SubTestActivityComponent {
    void inject(SubActivity subActivity);
}
