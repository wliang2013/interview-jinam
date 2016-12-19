package com.example.interview.interview.network;

import com.example.interview.interview.model.Photos;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by jinseoknam on 12/19/16.
 */
public class Service {
    private final NetworkService networkService;

    public Service(NetworkService networkService) {
        this.networkService = networkService;
    }

    public Subscription getPhotos(final GetPhotosCallback callback) {

        // These query params can be customized.
        String feature = "fresh_today";
        String page = "1";
        String limit = "10";
        String imageSize = "4";

        return networkService.getPhotos(feature, page, limit, imageSize)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .onErrorResumeNext(new Func1<Throwable, Observable<? extends Photos>>() {
                    @Override
                    public Observable<? extends Photos> call(Throwable throwable) {
                        return Observable.error(throwable);
                    }
                })
                .subscribe(new Subscriber<Photos>() {
                    @Override
                    public void onCompleted() {
                    }

                    @Override
                    public void onError(Throwable e) {
                        callback.onError(new NetworkError(e));

                    }

                    @Override
                    public void onNext(Photos photos) {
                        callback.onSuccess(photos);

                    }
                });
    }

    public interface GetPhotosCallback{
        void onSuccess(Photos photos);

        void onError(NetworkError networkError);
    }
}
