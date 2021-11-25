package com.aritra.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {
    public TextView txtSub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        txtSub=findViewById(R.id.tvSub);
        Intent i= getIntent();
        int sub=i.getIntExtra("key",0);
        txtSub.setText(Integer.toString(sub));
    }
}