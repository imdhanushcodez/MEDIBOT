package com.example.medbot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class decidepage extends AppCompatActivity {
    AppCompatButton signup,loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decidepage);

        //set contents to btns;
        signup = findViewById(R.id.mainbtn3);
        loginbtn = findViewById(R.id.mainbtn2);


        //after clicking loginbtn
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(decidepage.this,loginpage.class);
                startActivity(i);
            }
        });



        //after clicking signup btn
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(decidepage.this,regpage.class);
                startActivity(i);
            }
        });
    }
}