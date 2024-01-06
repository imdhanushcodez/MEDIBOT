package com.example.medbot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class loginpage extends AppCompatActivity {
    EditText email,pass;
    AppCompatButton regbtn;
    FirebaseAuth auth;
    DatabaseReference db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        auth = FirebaseAuth.getInstance();

        email = findViewById(R.id.loginemail);
        pass = findViewById(R.id.loginpass);
        regbtn = findViewById(R.id.loginbtn);
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email1 = email.getText().toString();
                String pass1 = pass.getText().toString();

                if(email1.length()==0) email.setError("Enter valid email");
                if(!email1.contains(".") && !email1.contains("@") && email1.length()!=0) email.setError("Give a invalid email ");
                if(pass1.length() < 6) pass.setError("Password must be 6 or greater than 6");
                else{
                    auth.signInWithEmailAndPassword(email1,pass1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(loginpage.this,"SUCCESSFULLY LOGINED PAGE",Toast.LENGTH_LONG).show();
                                Intent i = new Intent(loginpage.this, homepage.class);
                                startActivity(i);
                            }
                            else{
                                Toast.makeText(loginpage.this,"FAILED TO LOGIN ",Toast.LENGTH_LONG).show();

                            }

                        }
                    });
                }
            }
        });



    }
}