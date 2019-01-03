package com.seven.androidworld.Unstagram.WebService;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ${M.ROSTAMI} on 03/01/2019.
 */
public class ApiClient {

    private static Retrofit retrofit = null;

    public Retrofit getClient() {
       if(retrofit == null){
           String baseURL = "http://demo.mojm.ir//OnlineClass/Api/";
           retrofit = new Retrofit.Builder().baseUrl(baseURL).addConverterFactory(GsonConverterFactory.create()).build();
       }
       return retrofit;
    }
}
