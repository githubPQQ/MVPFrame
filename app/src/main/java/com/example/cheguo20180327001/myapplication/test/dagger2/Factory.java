package com.example.cheguo20180327001.myapplication.test.dagger2;

import javax.inject.Inject;

/**
 * Created by CheGuo20180327001 on 2018/4/9.
 */

public class Factory {
    private String name;

    Product product;

    @Inject
    public Factory(Product product) {
        this.product = product;
        this.name = "Factory";
    }

    public Product getFactory() {
        return product;
    }
}
