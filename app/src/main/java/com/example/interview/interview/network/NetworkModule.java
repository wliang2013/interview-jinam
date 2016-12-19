package com.example.interview.interview.network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by jinseoknam on 12/19/16.
 */
public class NetworkModule {

    private static final String BASE_URL = "https://api.500px.com";

    public NetworkModule() {
    }

    public Retrofit provideNetworkClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addNetworkInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public NetworkService provideNetworkService() {
        NetworkService service = provideNetworkClient().create(NetworkService.class);
        return service;
    }
}
