package com.example.palmdigital.calculator01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    int solved = 42;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       TextView answer = (TextView)findViewById(R.id.answer);
        answer.setText("" + solved);


        Button zero = (Button)findViewById(R.id.button00);
        zero.setText("0");
        zero.setOnClickListener(this);

        Button one = (Button)findViewById(R.id.button01);
        one.setText("1");
        one.setOnClickListener(this);

        Button two = (Button)findViewById(R.id.button02);
        two.setText("2");
        two.setOnClickListener(this);

        Button three = (Button)findViewById(R.id.button03);
        three.setText("3");
        three.setOnClickListener(this);

        Button four = (Button)findViewById(R.id.button04);
        four.setText("4");
        four.setOnClickListener(this);

        Button five = (Button)findViewById(R.id.button05);
        five.setText("5");
        five.setOnClickListener(this);

        Button six = (Button)findViewById(R.id.button06);
        six.setText("6");
        six.setOnClickListener(this);

        Button seven = (Button)findViewById(R.id.button07);
        seven.setText("7");
        seven.setOnClickListener(this);

        Button eight = (Button)findViewById(R.id.button08);
        eight.setText("8");
        eight.setOnClickListener(this);

        Button nine = (Button)findViewById(R.id.button09);
        nine.setText("9");
        nine.setOnClickListener(this);

        Button add = (Button)findViewById(R.id.additionButton);
        add.setText("+");
        add.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        if (view.getId() == R.id.button00)
        {
            Log.i("Info", "0");
        }else if (view.getId() == R.id.button01)
        {
            Log.i("Info", "1");
        }else if (view.getId() == R.id.button02)
         {
        Log.i("Info", "2");
        }else if (view.getId() == R.id.button03)
        {
        Log.i("Info", "3");
        }else if (view.getId() == R.id.button04)
        {
            Log.i("Info", "4");
        }else if (view.getId() == R.id.button05)
        {
            Log.i("Info", "5");
        }else if (view.getId() == R.id.button06)
        {
            Log.i("Info", "6");
        }else if (view.getId() == R.id.button07)
        {
            Log.i("Info", "7");
        }else  if (view.getId() == R.id.button08)
        {
            Log.i("Info", "8");
        }else if (view.getId() == R.id.button09)
        {
        Log.i("Info", "9");
        }else  if (view.getId() == R.id.additionButton)
        {
            Log.i("Info", "The answer is " + solved);
        }












    }
}
