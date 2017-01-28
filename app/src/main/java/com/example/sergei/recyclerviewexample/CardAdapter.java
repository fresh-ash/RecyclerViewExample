package com.example.sergei.recyclerviewexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sergei on 28.01.2017.
 */

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {
    private Context context;
    private List<ItemMenuCards> listCards = new ArrayList<>();

    CardAdapter(Context context){
        this.context = context;
    }

    public void addCards(ItemMenuCards item){
        this.listCards.add(item);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.custom_view, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.viewCards.setImageResource(listCards.get(position).getImageView());
        holder.titleCards.setText(listCards.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return listCards.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        //LinearLayout layoutCards;
        ImageView viewCards;
        TextView titleCards;

        public ViewHolder(View itemView) {
            super(itemView);
            //layoutCards = (LinearLayout) itemView.findViewById(R.id.layout);
            viewCards = (ImageView) itemView.findViewById(R.id.card_img);
            titleCards = (TextView) itemView.findViewById(R.id.card_title);
        }
    }
}
