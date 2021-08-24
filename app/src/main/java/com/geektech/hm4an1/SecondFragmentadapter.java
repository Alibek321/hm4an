package com.geektech.hm4an1;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondFragmentadapter extends RecyclerView.Adapter<SecondFragmentadapter.ViewHolder> {

    ArrayList<MusicModel> list = new ArrayList<>();
    Listiner listiner;

    public void setListiner(Listiner listiner) {
        this.listiner = listiner;
    }

    public void addList(ArrayList<MusicModel> list){
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view_second, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SecondFragmentadapter.ViewHolder holder, int position) {
          holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView number;
        private TextView name;
        private TextView singer;
        private TextView timeTv;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            number = itemView.findViewById(R.id.number_tv_item);
            name = itemView.findViewById(R.id.name_tv_item);
            singer = itemView.findViewById(R.id.singer_tv_item);
            timeTv = itemView.findViewById(R.id.time);
        }
        public void onBind(MusicModel musicModel){
            number.setText(musicModel.getNumber());
            name.setText(musicModel.getName());
            singer.setText(musicModel.getSinger());
            timeTv.setText(musicModel.getTime());

            itemView.setOnClickListener(v->{
                listiner.onClick(musicModel);
            });
        }

    }

     interface Listiner {
        void onClick(MusicModel model);

    }
}
