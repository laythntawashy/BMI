package com.laythntawashy.bmi_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    Button add_record;
    Button add_food;
    Button view_food;
    TextView logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        add_food = findViewById(R.id.b_addfoodhome);
        add_record = findViewById(R.id.b_addrecordhome2);
        view_food = findViewById(R.id.b_viewfoodhome);
        logout = findViewById(R.id.txt_logout_home);

        add_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(HomeActivity.this , Add_food_details.class);
                startActivity(a);
            }
        });

        add_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(HomeActivity.this , Add_Record.class);
                startActivity(b);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logout = new Intent(HomeActivity.this , Login.class);
                startActivity(logout);
                finish();
            }
        });
    }
}