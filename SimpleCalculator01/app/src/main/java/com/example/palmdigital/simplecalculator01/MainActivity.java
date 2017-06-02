package com.example.palmdigital.simplecalculator01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    int firstNumber = 42;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView firstDisplay = (TextView)findViewById(R.id.firstTextDisplay);
        firstDisplay.setText("" + firstNumber);
    }
}
