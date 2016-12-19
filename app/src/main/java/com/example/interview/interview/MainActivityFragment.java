package com.example.interview.interview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.interview.interview.adapters.PhotoAdapter;
import com.example.interview.interview.application.MainApplication;
import com.example.interview.interview.interactor.PhotoInteractor;
import com.example.interview.interview.model.Photos;
import com.example.interview.interview.network.Service;
import com.example.interview.interview.presenter.PhotoPresenter;

import java.util.Collections;

import javax.inject.Inject;

//https://api.500px.com/v1/photos?feature=fresh_today&sort=created_at&image_size=4&include_store=store_download&include_states=voted&consumer_key=mSDECDmxoEEEw32OgaNxZxhUFuwiZetUaK9xTyTW

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements PhotoInteractor {

    private static final String TAG = "MainActivityFragment";

    @Inject
    public Service service;

    private PhotoPresenter presenter;

    private RecyclerView mRecyclerView;
    private PhotoAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ProgressBar progressBar;
    private SwipeRefreshLayout swipeRefreshLayout;

    public MainActivityFragment() {

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MainApplication) getActivity().getApplication()).getNetworkComponent().inject(this);
        presenter = new PhotoPresenter(service, this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.my_recycler_view);
        progressBar = (ProgressBar) view.findViewById(R.id.progress);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        // fetch data when necessary.
        if (mAdapter == null) {
            presenter.getPhotos();
            mAdapter = new PhotoAdapter(getContext(), Collections.EMPTY_LIST);
        }
        //mAdapter.setContext(getContext());
        mRecyclerView.setAdapter(mAdapter);

        swipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipeToRefresh);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                presenter.getPhotos();
                swipeRefreshLayout.setRefreshing(false);
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onDestroy() {
        // Release the subscription to prevent memory leak
        presenter.onStop();
        super.onDestroy();
    }

    @Override
    public void showWait() {
        progressBar.setVisibility(View.VISIBLE);
    }

    @Override
    public void removeWait() {
        progressBar.setVisibility(View.GONE);
    }

    @Override
    public void onFailure(String appErrorMessage) {
        Toast.makeText(getContext(), appErrorMessage, Toast.LENGTH_LONG).show();
    }

    @Override
    public void getPhotosSuccess(Photos photos) {
        mAdapter.setData(photos.getPhotos());
        mAdapter.notifyDataSetChanged();
    }
}