package com.example.moduledemo;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myutils.MyMath;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Plus:" + MyMath.Plus(10, 20), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Minus:" + MyMath.Minus(20, 10), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Multiply:" + MyMath.Times(10, 20), Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Div:" + MyMath.Div(20, 10), Toast.LENGTH_SHORT).show();
    }
}
