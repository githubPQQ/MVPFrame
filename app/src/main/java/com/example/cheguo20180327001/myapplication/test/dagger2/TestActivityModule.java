package com.example.cheguo20180327001.myapplication.test.dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by CheGuo20180327001 on 2018/4/9.
 */
@Module
public class TestActivityModule {
    private String factory2Name;

    public TestActivityModule(String name) {
        this.factory2Name = name;
    }

    @Provides
    Factory2 provideFactory2() {
        return new Factory2(factory2Name);
    }

    @Provides
    Boss provideBoss(Factory2 factory2) {
        return new Boss(factory2);
    }


}
