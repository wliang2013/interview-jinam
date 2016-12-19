package com.example.interview.interview;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.interview.interview.adapters.PhotoAdapter;
import com.example.interview.interview.model.Photos;
import com.example.interview.interview.network.NetworkModule;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//https://api.500px.com/v1/photos?feature=fresh_today&sort=created_at&image_size=4&include_store=store_download&include_states=voted&consumer_key=mSDECDmxoEEEw32OgaNxZxhUFuwiZetUaK9xTyTW

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private static final String TAG = "MainActivityFragment";
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mAdapter = new PhotoAdapter();
        mRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
        new Thread(new Runnable() {
            @Override
            public void run() {
                task2();
            }
        }).run();
    }

    private void task2() {
        // Task 2: parse data and print out.
        NetworkModule networkModule = new NetworkModule();
        Call<Photos> response = networkModule.provideNetworkService().getPhotos();
        response.enqueue(new Callback<Photos>() {
            @Override
            public void onResponse(Call<Photos> call, Response<Photos> response) {
                Log.d(TAG, "retrofit success: " +
                        (response.body().getPhotos().size() > 0 ? response.body().getPhotos().get(0).getUrl(): "no photos"));
            }

            @Override
            public void onFailure(Call<Photos> call, Throwable t) {
                Log.e(TAG, "retrofit success: " + t.getLocalizedMessage());
            }
        });
    }
}