package com.aritra.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MulActivity extends AppCompatActivity {
    public TextView txtMul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mul);
        txtMul=findViewById(R.id.tvMul);
        Intent i= getIntent();
        int mul=i.getIntExtra("key",0);
        txtMul.setText(Integer.toString(mul));
    }
}