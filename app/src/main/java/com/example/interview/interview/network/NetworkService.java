package com.example.interview.interview.network;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jinseoknam on 12/19/16.
 */
public interface NetworkService {
    @GET("v1/photos?feature=fresh_today&sort=created_at&page=1&limit=10&image_size=4&include_store=store_download&include_states=voted&consumer_key=mSDECDmxoEEEw32OgaNxZxhUFuwiZetUaK9xTyTW")
    Call<String> getPhotos();
}
