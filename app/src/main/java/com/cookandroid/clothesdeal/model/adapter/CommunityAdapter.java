package com.cookandroid.clothesdeal.model.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.cookandroid.clothesdeal.R;
import com.cookandroid.clothesdeal.model.data.CommunityDataClass;

import java.util.ArrayList;


public class CommunityAdapter extends RecyclerView.Adapter<CommunityAdapter.CommunityViewHolder> {

    public CommunityAdapter(ArrayList<CommunityDataClass> datas) {
        this.datas = datas;
    }

    @NonNull
    @Override
    public CommunityViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CommunityViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.list_community, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CommunityAdapter.CommunityViewHolder holder, int position) {
        CommunityAdapter data = datas.get(position);

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
