package com.aritra.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DivActivity extends AppCompatActivity {

    public TextView txtDiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_div);
        txtDiv=findViewById(R.id.tvDiv);
        Intent i= getIntent();
        float div=i.getFloatExtra("key",0.0f);
        txtDiv.setText(Float.toString(div));
    }
}