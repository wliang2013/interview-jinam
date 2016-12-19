package com.example.interview.interview.network;

import com.example.interview.interview.model.Photos;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by jinseoknam on 12/19/16.
 */
public interface NetworkService {
    // TODO: refactor to pass in param queries.
    @GET("v1/photos?feature=fresh_today&sort=created_at&page=1&limit=10&image_size=4&include_store=store_download&include_states=voted&consumer_key=mSDECDmxoEEEw32OgaNxZxhUFuwiZetUaK9xTyTW")
    Observable<Photos> getPhotos();
}
