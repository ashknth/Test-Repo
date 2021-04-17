package com.easytipstutorial.easy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Flow;

public class RecyclerViewActivity extends AppCompatActivity {
    private RecyclerView rvFlowerList;
    private FlowerAdapter flowerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
         rvFlowerList=findViewById(R.id.rv_flower_list);
         setupRecyclerViewAndAdapter();
    }

    private void setupRecyclerViewAndAdapter()
    {
        flowerAdapter=new FlowerAdapter(this,new ArrayList<Flower>());
        rvFlowerList.setLayoutManager((new LinearLayoutManager(this)));
        rvFlowerList.setAdapter(flowerAdapter);
        setFlowerListData();

    }

    private void setFlowerListData() {
        List<Flower>flowerList=new ArrayList<>();
        Flower flower1= new Flower("2020-12-23","Rose");
        flowerList.add(flower1);
        flowerList.add( new Flower("2020-12-25","Rose"));
        flowerAdapter.setData(flowerList);



    }


}