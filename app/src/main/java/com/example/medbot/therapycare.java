package com.example.medbot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;

public class therapycare extends AppCompatActivity {

    RecyclerView rc;
    ArrayList<therapydata> list;
    therapyadapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_therapycare);
        rc = findViewById(R.id.rc1);
        rc.setHasFixedSize(true);
        rc.setLayoutManager(new LinearLayoutManager(therapycare.this));
        list = new ArrayList<>();

        list.add(new therapydata(R.drawable.t1,"ANNAMALAI THERAPY","CHENNAI - 001"));
        list.add(new therapydata(R.drawable.t2,"ASHWIN THERAPY AND CARE ","TAMBARAM - 008"));

        list.add(new therapydata(R.drawable.t3,"KARTHICK REHEAB CENTRE","TRICHY - 002"));

        list.add(new therapydata(R.drawable.t4,"VAIBHAV STREE RELIEF CENTRE","KRISHNAGIRI - 012"));
        list.add(new therapydata(R.drawable.t5,"RAGUL PHYSIO THERAPY","RAMAPURAM - 009"));
        list.add(new therapydata(R.drawable.t6,"KAUSHIK THERAPY AND CARE","TRICHY - 021"));
        list.add(new therapydata(R.drawable.t7,"DHONI MENTAL RELIEF CENTRE","CHENNAI - 001"));
        list.add(new therapydata(R.drawable.t8,"KC SOCIAL CENTRE","KANNAYAKUMARI - 031"));





        adapter = new therapyadapter(therapycare.this,list);
        rc.setAdapter(adapter);

    }
}