package com.example.medbot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class doctorspage extends AppCompatActivity {

    RecyclerView rc;
    ArrayList<therapydata> list;
    therapyadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctorspage);


        rc = findViewById(R.id.rc1);
        rc.setHasFixedSize(true);
        rc.setLayoutManager(new LinearLayoutManager(doctorspage.this));
        list = new ArrayList<>();

        list.add(new therapydata(R.drawable. h1,"ANNAMALAI MULTI-SPECAILITY","CHENNAI - 001"));
        list.add(new therapydata(R.drawable.h2,"TAMBARAM HEALTH AND CARE ","TAMBARAM - 008"));

        list.add(new therapydata(R.drawable.h3,"KARTHICK REHEAB CENTRE","TRICHY - 002"));

        list.add(new therapydata(R.drawable.h4,"VAIBHAV STREE RELIEF CENTRE","KRISHNAGIRI - 012"));
        list.add(new therapydata(R.drawable.h5,"APOLLO HEALTH CENTRE","RAMAPURAM - 009"));
        list.add(new therapydata(R.drawable.h6,"KAUSHIK CLINIC","TRICHY - 021"));
        list.add(new therapydata(R.drawable.h7,"DHONI HEART SPEICALIST","CHENNAI - 001"));
        list.add(new therapydata(R.drawable.h8,"KC SOCIAL CENTRE","KANNAYAKUMARI - 031"));





        adapter = new therapyadapter(doctorspage.this,list);
        rc.setAdapter(adapter);

    }
}