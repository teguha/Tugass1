package com.example.recycleviewwisata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rycyclerView;
    RecyclerView.Adapter recylerViewAdapter;
    RecyclerView.LayoutManager recyleViewLayaoutManager;
    ArrayList<WisataModel>data;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rycyclerView =findViewById(R.id.rv_wisataa);
        rycyclerView.setHasFixedSize(true);
        recyleViewLayaoutManager = new LinearLayoutManager(this);
        rycyclerView.setLayoutManager(recyleViewLayaoutManager);
        rycyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        data = new ArrayList<>();
                for(int i=0; i < WisataData.WisataName.length; i++){
                    data.add(new WisataModel(
                            WisataData.WisataName[i],
                            WisataData.WisataDetail[i],
                            WisataData.WisataPhoto[i]));

                }

                recylerViewAdapter = new ListWisataAdapter(data);
                rycyclerView.setAdapter(recylerViewAdapter);
    }



}