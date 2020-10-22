package com.king.myacceleratorrecyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements  CustomAdapter.OnItemClickListener{

    RecyclerView mRecyclerPeople;
    ArrayList<Item> data;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = new ArrayList();
        mRecyclerPeople = findViewById(R.id.my_phone_list);
        mRecyclerPeople.setHasFixedSize(true);
        mRecyclerPeople.setLayoutManager(new LinearLayoutManager(this));

        Item p1 = new Item("King","07456345346",R.drawable.img_one);
        Item p2 = new Item("Anna","073562364",R.drawable.my_icon);
        Item p3 = new Item("Albert","07456345346",R.drawable.my_icon_two);
        Item p4 = new Item("Abubakar","07456345346",R.drawable.img_one);
        Item p5 = new Item("Allen","07456345346",R.drawable.my_icon);
        Item p6 = new Item("Assynath","07456345346",R.drawable.my_icon_two);
        Item p7 = new Item("Boniphace","07456345346",R.drawable.img_one);
        Item p8 = new Item("Chichi","07456345346",R.drawable.my_icon);
        Item p9 = new Item("Meshack","07456345346",R.drawable.my_icon_two);
        Item p10 = new Item("Dativa","07456345346",R.drawable.img_one);
        Item p11 = new Item("Edson","07456345346",R.drawable.my_icon);
        Item p12 = new Item("Deogratius","07456345346",R.drawable.my_icon_two);
        Item p13 = new Item("Faustina","07456345346",R.drawable.img_one);
        Item p14 = new Item("Grace","07456345346",R.drawable.my_icon);
        Item p15 = new Item("Holylight","07456345346",R.drawable.my_icon_two);

        data.add(p1);
        data.add(p2);
        data.add(p3);
        data.add(p4);
        data.add(p5);
        data.add(p6);
        data.add(p7);
        data.add(p8);
        data.add(p9);
        data.add(p10);
        data.add(p11);
        data.add(p12);
        data.add(p13);
        data.add(p14);
        data.add(p15);

        adapter = new CustomAdapter(this,data);
        mRecyclerPeople.setAdapter(adapter);


    }


    @Override
    public void onItemClick(int position) {

        String name = data.get(position).getName();
        Toast.makeText(this, name+" clicked", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onVerifyClick(int position) {
        String name = data.get(position).getName();
        Toast.makeText(this, name+" verified", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDeleteClick(int position) {
        String name = data.get(position).getName();
        Toast.makeText(this, name+" deleted", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        Toast.makeText(this, "It worked", Toast.LENGTH_SHORT).show();
    }
}