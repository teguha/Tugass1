package com.example.recycleviewwisata;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;


public class ListWisataAdapter extends RecyclerView.Adapter<ListWisataAdapter.ViewHolder> {
    private ArrayList<WisataModel> listWisata;

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textHead;
        TextView textSubhead;
        ImageView imageIcon;
        public ViewHolder(@NonNull View itemView){
            super(itemView);
            textHead=itemView.findViewById(R.id.tv_item_name);
            textSubhead=itemView.findViewById(R.id.tv_item_detail);
            imageIcon=itemView.findViewById(R.id.img_item_wisata);

        }
    }

    ListWisataAdapter(ArrayList<WisataModel> listWisata){
        this.listWisata = listWisata;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_wisata,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        TextView textHead =holder.textHead;
        TextView  textSubhead = holder.textSubhead;
        ImageView imageIcon =holder.imageIcon;

        textHead.setText((listWisata.get(position).getName()));
        textSubhead.setText((listWisata.get(position).getDetail()));
        imageIcon.setImageResource(listWisata.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return listWisata.size();
    }


}
