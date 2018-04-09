package com.example.cheguo20180327001.myapplication.http.service;



import com.example.cheguo20180327001.myapplication.bean.HttpResult;

import io.reactivex.Observable;
import retrofit2.http.POST;

/**
 * Created by CheGuo20180327001 on 2018/4/9.
 */

public interface MainService {

    @POST("/mobile/gethotcars.json")
    Observable<HttpResult> gethotcars();

}
