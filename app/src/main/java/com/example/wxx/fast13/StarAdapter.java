package com.example.wxx.fast13;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StarAdapter extends RecyclerView.Adapter<StarAdapter.ViewHolder> {
    private List<Star>mStarList;

    static class ViewHolder extends RecyclerView.ViewHolder{
        View starView;
        ImageView starImage;
        TextView starName;

        public ViewHolder(View view) {
            super(view);
            starView=view;
            starImage = view.findViewById(R.id.star_image);
            starName = view.findViewById(R.id.star_name);
        }
    }
    public StarAdapter(List<Star> starList){
        mStarList=starList;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.star_item,parent,false);
        final ViewHolder viewHolder=new ViewHolder(view);
        if(listener != null){
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClickListener(v);
                }
            });

            view.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    listener.onItemLongClickListener(v);
                    return true;
                }
            });
        }
        return viewHolder;
    }
    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        Star star=mStarList.get(position);
        holder.starImage.setImageResource(star.getImageId());
        holder.starName.setText(star.getName());
    }
    @Override
    public int getItemCount(){
        return mStarList.size();
    }
    private OnRecyclerViewClickListener listener;
    public void setItemClickListener(OnRecyclerViewClickListener itemClickListener) {
        listener = itemClickListener;
    }
}
