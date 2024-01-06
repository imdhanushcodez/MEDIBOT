package com.example.medbot;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class regpage extends AppCompatActivity {

    EditText name,email,pass;
    AppCompatButton regbtn;
    FirebaseAuth auth;
    DatabaseReference db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regpage);

        auth = FirebaseAuth.getInstance();

        name = findViewById(R.id.regname);
        email = findViewById(R.id.regemail);
        pass = findViewById(R.id.regpass);
        regbtn = findViewById(R.id.regbtn);
        regbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name1 =name.getText().toString();
                String email1 = email.getText().toString();
                String pass1 = pass.getText().toString();

                if(name1.length() == 0) name.setError("Give a valid username ");
                if(email1.length()==0) email.setError("Enter valid email");
                if(!email1.contains(".") && !email1.contains("@") && email1.length()!=0) email.setError("Give a invalid email ");
                if(pass1.length() < 6) pass.setError("Password must be 6 or greater than 6");
                else{
                    auth.createUserWithEmailAndPassword(email1,pass1).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(regpage.this,"SUCCESSFULLY REGISTRATION PAGE",Toast.LENGTH_LONG).show();
                            }
                            else{
                                Toast.makeText(regpage.this,"FAILED TO LOGIN ",Toast.LENGTH_LONG).show();
                            }

                        }
                    });
                }
            }
        });



    }
}