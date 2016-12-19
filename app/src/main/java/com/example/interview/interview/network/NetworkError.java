package com.example.interview.interview.network;

/**
 * Created by jinseoknam on 12/19/16.
 */
public class NetworkError extends Throwable {
    private final Throwable error;

    public NetworkError(Throwable e) {
        super(e);
        this.error = e;
    }

    public String getMessage() {
        return error.getMessage();
    }
}
