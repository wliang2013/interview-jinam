package com.example.interview.interview.presenter;

import com.example.interview.interview.interactor.PhotoInteractor;
import com.example.interview.interview.model.Photos;
import com.example.interview.interview.network.NetworkError;
import com.example.interview.interview.network.Service;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by jinseoknam on 12/19/16.
 */
public class PhotoPresenter {
    private final Service service;
    private final PhotoInteractor view;
    private CompositeSubscription subscriptions;

    public PhotoPresenter(Service service, PhotoInteractor view) {
        this.service = service;
        this.view = view;
        this.subscriptions = new CompositeSubscription();
    }

    public void getPhotos() {
        view.showWait();

        Subscription subscription = service.getPhotos(new Service.GetPhotosCallback() {
            @Override
            public void onSuccess(Photos photos) {
                view.removeWait();
                view.getPhotosSuccess(photos);
            }

            @Override
            public void onError(NetworkError networkError) {
                view.removeWait();
                view.onFailure(networkError.getMessage());
            }
        });
        subscriptions.add(subscription);
    }

    public void onStop() {
        subscriptions.unsubscribe();
    }
}
