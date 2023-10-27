package com.example.recyclerviewdog.MyCustomAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdog.R;
import com.example.recyclerviewdog.model.DogModel;

import java.util.List;

public class MyCustomAdapter extends RecyclerView.Adapter<MyCustomAdapter.DogViewHolder> {

    List<DogModel> dogModelList;

    public MyCustomAdapter(List<DogModel> dogModelList) {
        this.dogModelList = dogModelList;
    }

    @NonNull
    @Override
    public MyCustomAdapter.DogViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        
        return new DogViewHolder(view);
        
    }

    @Override
    public void onBindViewHolder(@NonNull MyCustomAdapter.DogViewHolder holder, int position) {
        DogModel dogModel = dogModelList.get(position);

        holder.dogName.setText(dogModel.getDogName());
        holder.dogPrice.setText(dogModel.getPrice());
        holder.dogImage.setImageResource(dogModel.getDogImage());

    }

    @Override
    public int getItemCount() {
        return dogModelList.size();
    }


    public static class DogViewHolder extends RecyclerView.ViewHolder {

        TextView dogName , dogPrice;
        ImageView dogImage;
        public DogViewHolder(@NonNull View itemView) {
            super(itemView);

            dogName = itemView.findViewById(R.id.dogName);
            dogPrice = itemView.findViewById(R.id.dogPrice);
            dogImage = itemView.findViewById(R.id.dogImage);
        }
    }
}
