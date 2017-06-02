package com.example.palmdigital.toast03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this, "Hello! It is January eleventh of the year Two-thousand sixteen",
                Toast.LENGTH_SHORT).show();

        Toast.makeText(MainActivity.this, "It is a Wednesday.",
                Toast.LENGTH_SHORT).show();

        Toast.makeText(MainActivity.this, "You are at Palm Middle School.",
                Toast.LENGTH_SHORT).show();
    }
}
