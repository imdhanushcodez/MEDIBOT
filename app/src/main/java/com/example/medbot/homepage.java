package com.example.medbot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class homepage extends AppCompatActivity {

    AppCompatImageButton sosbtn;
    ImageView iv;
    ConstraintLayout testing,doc,maps;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        sosbtn = findViewById(R.id.sosbtn);
        doc = findViewById(R.id.doctors);
        doc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(homepage.this, doctorspage.class);
                startActivity(i);
            }
        });

        maps = findViewById(R.id.maps);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(homepage.this, MapsActivity.class);
                startActivity(i);
            }
        });


        testing = findViewById(R.id.therapy);
        testing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent i = new Intent(homepage.this,therapycare.class);
               startActivity(i);
            }
        });


        iv = findViewById(R.id.shutdown);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Dialog dialog = new Dialog(homepage.this,R.style.dialog1);
                dialog.setContentView(R.layout.dialogue1);
                dialog.show();
            }
        });

        // sos - btn - change number here for sos
        sosbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + "9047305692"));
                    startActivity(intent);
                }
                catch (Exception e){
                    Toast.makeText(homepage.this,"Give permission access for call",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}