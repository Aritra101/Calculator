package com.aritra.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public EditText etNumber1,etNumber2;
    public Button btnAddition,btnSubstraction,btnMultiplication,btnDivision;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber1=findViewById(R.id.etNum1);
        etNumber2=findViewById(R.id.etNum2);
        btnAddition=findViewById(R.id.btnAdd);
        btnSubstraction=findViewById(R.id.btnSub);
        btnMultiplication=findViewById(R.id.btnMul);
        btnDivision=findViewById(R.id.btnDiv);
        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1= etNumber1.getText().toString();
                int n1=Integer.parseInt(number1);
                String number2= etNumber2.getText().toString();
                int n2=Integer.parseInt(number2);
                int sum=n1+n2;
                Intent i = new Intent(MainActivity.this,NavigationActivity.class);//Initializing intent class with parameterized constructor.
                i.putExtra("key", sum);//A function putExtra used here
                startActivity(i);
            }
        });
        btnSubstraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1= etNumber1.getText().toString();
                int n1=Integer.parseInt(number1);
                String number2= etNumber2.getText().toString();
                int n2=Integer.parseInt(number2);
                int sub=n2-n1;
                Intent i = new Intent(MainActivity.this,SubActivity.class);//Initializing intent class with parameterized constructor.
                i.putExtra("key", sub);//A function putExtra used here
                startActivity(i);
            }
        });
        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1= etNumber1.getText().toString();
                int n1=Integer.parseInt(number1);
                String number2= etNumber2.getText().toString();
                int n2=Integer.parseInt(number2);
                int mul=n2*n1;
                Intent i = new Intent(MainActivity.this,MulActivity.class);//Initializing intent class with parameterized constructor.
                i.putExtra("key", mul);//A function putExtra used here
                startActivity(i);
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number1= etNumber1.getText().toString();
                float n1=Float.parseFloat(number1);
                String number2= etNumber2.getText().toString();
                Float n2=Float.parseFloat(number2);
                float div=n2/n1;
                Intent i = new Intent(MainActivity.this,DivActivity.class);//Initializing intent class with parameterized constructor.
                i.putExtra("key", div);//A function putExtra used here
                startActivity(i);
            }
        });
    }
}
