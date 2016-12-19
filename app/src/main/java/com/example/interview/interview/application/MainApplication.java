package com.example.interview.interview.application;

import android.app.Application;

import com.example.interview.interview.dependency.DaggerNetworkComponent;
import com.example.interview.interview.dependency.NetworkComponent;
import com.example.interview.interview.network.NetworkModule;

/**
 * Created by jinseoknam on 12/19/16.
 *
 * Uses Dagger (Dependency Injection), Retrofit (Networking), RXAndroid (RXJava), Glide (Image)
 */
public class MainApplication extends Application {

    private NetworkComponent networkComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        networkComponent = DaggerNetworkComponent.builder()
                // list of modules that are part of this component need to be created here too
                .networkModule(new NetworkModule())
                .build();
    }

    public NetworkComponent getNetworkComponent() {
        return networkComponent;
    }

}

