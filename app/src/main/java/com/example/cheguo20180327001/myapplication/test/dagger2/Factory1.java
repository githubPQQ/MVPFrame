package com.example.cheguo20180327001.myapplication.test.dagger2;

import javax.inject.Inject;

/**
 * Created by CheGuo20180327001 on 2018/4/9.
 */

public class Factory1 {
    private String name;

    @Inject
    public Factory1() {
        name = "Factory1";
    }

}
