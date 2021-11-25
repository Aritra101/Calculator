package com.aritra.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NavigationActivity extends AppCompatActivity {

    public TextView txtSum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        txtSum=findViewById(R.id.tvSum);
        Intent i=getIntent();
        int sum=i.getIntExtra("key",0);
        txtSum.setText(Integer.toString(sum));
    }
}