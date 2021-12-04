package com.laythntawashy.bmi_project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Add_Record extends AppCompatActivity {
    TextView value;
    TextView value2;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);

        value = (TextView) findViewById(R.id.ed_txt_record_weigth);
        value2 = (TextView) findViewById(R.id.ed_txt_record_length);

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