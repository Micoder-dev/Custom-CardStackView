package com.example.cardstackview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class LaysStackAdapter extends RecyclerView.Adapter<LaysViewHolder> {

    private Context mContext;
    private List<String> mLaysNames;
    private List<Integer> mLaysImage;
    private LayoutInflater mLayoutInflater;

    public LaysStackAdapter(Context context, List<String> laysNames, List<Integer> laysImage) {
        mContext = context;
        mLaysNames = laysNames;
        mLaysImage = laysImage;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public LaysViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = mLayoutInflater.inflate(R.layout.lays_view_item, parent, false);

        return new LaysViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull LaysViewHolder holder, int position) {

        holder.getTxtLays().setText(mLaysNames.get(position));

        holder.getImgLays().setImageResource(mLaysImage.get(position));

    }

    @Override
    public int getItemCount() {
        return mLaysNames.size();
    }
}
