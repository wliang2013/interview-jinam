package com.example.interview.interview.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.interview.interview.R;
import com.example.interview.interview.model.Photo;

import java.util.List;

public class PhotoAdapter extends RecyclerView.Adapter<PhotoAdapter.ViewHolder> {

    private List<Photo> data;
    private Context context;

    public PhotoAdapter(Context context, List<Photo> data) {
        this.data = data;
        this.context = context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {// create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_photo, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String images = data.get(position).getImageUrl();
        Glide.with(context)
                .load(images)
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .skipMemoryCache(true)
                .into(holder.mImage);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public void setData(List<Photo> data) {
        this.data = data;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public View mView;
        public ImageView mImage;

        public ViewHolder(View v) {
            super(v);
            mView = v;
            mImage = (ImageView) mView.findViewById(R.id.childImage);
        }
    }
}
