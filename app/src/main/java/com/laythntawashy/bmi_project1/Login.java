package com.laythntawashy.bmi_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    TextView txt_signup;
    EditText username_txt;
    EditText password_txt;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt_signup = findViewById(R.id.txt_signup);
        username_txt = findViewById(R.id.et_username);
        password_txt = findViewById(R.id.et_password);
        login = findViewById(R.id.b_login);

        txt_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this,registration.class);
                startActivity(i);
            }
        });

    }

    public void login(View view) {
        String username = username_txt.getText().toString();
        if(username.length() <= 0){
            Toast.makeText(this, "please Enter your username or password first", Toast.LENGTH_SHORT).show();
        }else{
            Intent in = new Intent(getApplicationContext(),Add_Record.class);
            startActivity(in);
        }

    }
}