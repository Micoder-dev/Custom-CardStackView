package com.example.cardstackview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class LaysViewHolder extends RecyclerView.ViewHolder {

    private TextView txtLays;
    private ImageView imgLays;

    public LaysViewHolder(@NonNull View itemView) {
        super(itemView);

        txtLays = itemView.findViewById(R.id.txtLays);
        imgLays = itemView.findViewById(R.id.imgLays);

    }

    public TextView getTxtLays() {
        return txtLays;
    }

    public ImageView getImgLays() {
        return imgLays;
    }
}
