package com.example.desk.a1_6_proyecto_recyclerview_cardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProductAdapter adapter;
    List<DataProvider> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        productList = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList.add(
                new DataProvider("Folk", "Helvetios",R.drawable.img1)
        );
        productList.add(
                new DataProvider("Psycho", "Skin",R.drawable.img2)
        );
        productList.add(
                new DataProvider("Indie", "AM",R.drawable.img3)
        );
        productList.add(
                new DataProvider("Hip-Hop", "Circus in the Sky",R.drawable.img4)
        );
        productList.add(
                new DataProvider("Hard Rock", "Back In Black",R.drawable.img5)
        );
        productList.add(
                new DataProvider("Heavy Metal", "The Trooper",R.drawable.img6)
        );
        adapter = new ProductAdapter(this,productList);
        recyclerView.setAdapter(adapter);

    }
}
