package com.laythntawashy.bmi_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class registration extends AppCompatActivity {
    TextView login;
    Button create;
    EditText name;
    EditText email;
    EditText password;
    EditText confirm_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        login = findViewById(R.id.txt_login);
        create = findViewById(R.id.b_Created);
        name = findViewById(R.id.et_name);
        email = findViewById(R.id.txt_email);
        password = findViewById(R.id.txt_Password1);
        confirm_password = findViewById(R.id.txt_Password2);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent s = new Intent(registration.this,Login.class);
                startActivity(s);

            }
        });

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(getApplicationContext(),CompleteInformationActivity.class);
                startActivity(c);

            }
        });

//        create.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String entered_email = email.getText().toString().trim();
//                String entered_password = password.getText().toString();
//
//                if(TextUtils.isEmpty((CharSequence) email)){
//                    email.setError("Email is Required");
//                    return;
//
//                }
//
//                if(TextUtils.isEmpty((CharSequence) password)){
//                    password.setError("password is Required");
//                    return;
//                }
//
//                if(password.length() < 6){
//                    password.setError("password Must be >= 6 Characters");
//
//                }
//
//
//                Intent s = new Intent(registration.this,CompleteInformationActivity.class);
//                startActivity(s);
//            }
//        });
    }

//    public void create(View v) {
//        String entered_name = name.getText().toString().trim();
//        String entered_email = email.getText().toString().trim();
//        String entered_password = password.getText().toString();
//        String entered_confirm_password = confirm_password.getText().toString();
//
////        check name
//        if(TextUtils.isEmpty(entered_name) || TextUtils.isEmpty(entered_email) || TextUtils.isEmpty(entered_password) || TextUtils.isEmpty(entered_confirm_password)){
////           Toastry.error(context,"All fields must be filled", Toast.LENGTH_LONG).show();
//            Toast.makeText(this, "All fields must be filled", Toast.LENGTH_SHORT).show();
//            return;
//        }
//
////        check email
//        if(!Fun.isvValidEmail(entered_email)){
//            email.setError("Invalid email");
//            email.requestFocus();
//            return;
//        }else{
//            email.setError(null);
//        }
//
////        check password
//        if(!entered_password.equals(entered_confirm_password)){
////            Toastry.error(context,"Password do not match", Toast.LENGTH_LONG).show();
//            Toast.makeText(this, "Password do not match", Toast.LENGTH_SHORT).show();
//            password.requestFocus();
//            return;
//
//        }else {
//            password.setError(null);
//        }
//
//    }
}