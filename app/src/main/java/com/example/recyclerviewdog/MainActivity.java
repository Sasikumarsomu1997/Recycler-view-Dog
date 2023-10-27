package com.example.recyclerviewdog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewdog.MyCustomAdapter.MyCustomAdapter;
import com.example.recyclerviewdog.model.DogModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DogModel>dogModelList;
    RecyclerView recyclerView;

    MyCustomAdapter myCustomAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);

        dogModelList = new ArrayList<>();

        DogModel d1 = new DogModel("Dog 1",R.drawable.dog, 5000);
        DogModel d2 = new DogModel("Dog 2",R.drawable.dog, 10000);
        DogModel d3 = new DogModel("Dog 3",R.drawable.dog, 15000);
        DogModel d4 = new DogModel("Dog 4",R.drawable.dog, 25000);
        DogModel d5 = new DogModel("Dog 5",R.drawable.dog, 20000);

        dogModelList.add(d1);
        dogModelList.add(d2);
        dogModelList.add(d3);
        dogModelList.add(d4);
        dogModelList.add(d5);


        myCustomAdapter = new MyCustomAdapter(dogModelList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myCustomAdapter);





    }
}