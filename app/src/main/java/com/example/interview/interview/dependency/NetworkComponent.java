package com.example.interview.interview.dependency;

import com.example.interview.interview.MainActivityFragment;
import com.example.interview.interview.network.NetworkModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by jinseoknam on 12/19/16.
 */

@Singleton
@Component(modules = {NetworkModule.class,})
public interface NetworkComponent {
    void inject(MainActivityFragment mainFragment);
}
