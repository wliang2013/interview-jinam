package com.example.interview.interview.network;

import com.example.interview.interview.model.Photos;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by jinseoknam on 12/19/16.
 */
public interface NetworkService {
    String FEATURE = "feature";
    String PAGE = "page";
    String LIMIT = "limit";
    String IMAGE_SIZE = "image_size";

    @GET("v1/photos?sort=created_at&include_store=store_download&include_states=voted&consumer_key=mSDECDmxoEEEw32OgaNxZxhUFuwiZetUaK9xTyTW")
    //@GET("v1/photos?feature=&sort=created_at&page=1&limit=10&image_size=4&include_store=store_download&include_states=voted&consumer_key=mSDECDmxoEEEw32OgaNxZxhUFuwiZetUaK9xTyTW")
    Observable<Photos> getPhotos(@Query(FEATURE) String feature,
                                 @Query(PAGE) String page,
                                 @Query(LIMIT) String limit,
                                 @Query(IMAGE_SIZE) String imageSize);
}
