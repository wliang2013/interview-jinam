package com.example.interview.interview.interactor;

import com.example.interview.interview.model.Photos;

/**
 * Created by jinseoknam on 12/19/16.
 */
public interface PhotoInteractor {
    void showWait();
    void removeWait();
    void onFailure(String appErrorMessage);
    void getPhotosSuccess(Photos photos);
}
