package com.laythntawashy.bmi_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CompleteInformationActivity extends AppCompatActivity {
    Button save;
    TextView value;
    TextView value2;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_information);

        save = findViewById(R.id.B_save_date);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(CompleteInformationActivity.this,Add_Record.class);
                startActivity(c);

            }
        });

        value = (TextView) findViewById(R.id.ed_txt_weigth);
        value2 = (TextView) findViewById(R.id.ed_txt_langth);

    }
    public void increment(View v){
        count++;
        value.setText("" +count);
    }
    public void Decrement(View v){
        if(count <= 0) count = 0;
        else count--;

        value.setText("" +count);
    }
    public void increment1(View v){
        count++;
        value2.setText("" +count);
    }
    public void Decrement1(View v){
        if(count <= 0) count = 0;
        else count--;

        value2.setText("" +count);
    }
}