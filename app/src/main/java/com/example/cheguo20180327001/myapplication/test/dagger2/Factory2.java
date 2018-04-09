package com.example.cheguo20180327001.myapplication.test.dagger2;

import javax.inject.Inject;

/**
 * Created by CheGuo20180327001 on 2018/4/9.
 */

public class Factory2 {

    private String name;

    public Factory2() {
        name = "Factory2";
    }

    public Factory2(String name) {
        this.name = name;
    }
}
