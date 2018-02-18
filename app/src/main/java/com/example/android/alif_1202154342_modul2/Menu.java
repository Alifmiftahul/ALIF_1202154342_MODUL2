package com.example.android.alif_1202154342_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class Menu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        dummiesData();
        // Get a handle to the RecyclerView.
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("Bacon Bits Fries");
            foods.add("Banana Honey Waffle");
            foods.add("Brick Toast");
            foods.add("Caesar Salad");
            foods.add("Kitty Sliders");
            foods.add("Kitty Zilla");
            foods.add("Pinkwich");


            // mamanggil harga

            priceses.add(48000);
            priceses.add(78000);
            priceses.add(88000);
            priceses.add(55000);
            priceses.add(85000);
            priceses.add(98000);
            priceses.add(78000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.bacon_bits_fries);
            photos.add(R.drawable.banana_honey_waffle);
            photos.add(R.drawable.brick_toast);
            photos.add(R.drawable.caesar_salad);
            photos.add(R.drawable.kitty_sliders);
            photos.add(R.drawable.kitty_zilla);
            photos.add(R.drawable.pinkwich);

        }
    }
}
