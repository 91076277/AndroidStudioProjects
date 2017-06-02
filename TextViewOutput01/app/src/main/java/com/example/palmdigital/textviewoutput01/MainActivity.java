package com.example.palmdigital.textviewoutput01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView firstOutput;
    TextView secondOutput;
    TextView lastOutput;
    int firstNum;
    int secondNum;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstOutput = (TextView)findViewById(R.id.firstOutput);
        secondOutput = (TextView)findViewById(R.id.secondOutput);
        lastOutput = (TextView)findViewById(R.id.lastOutput);

        ImageView number_one = (ImageView)findViewById(R.id.number_one);
        number_one.setOnClickListener(this);

        ImageView number_two = (ImageView)findViewById(R.id.number_two);
        number_two.setOnClickListener(this);

        ImageView number_three = (ImageView)findViewById(R.id.number_three);
        number_three.setOnClickListener(this);

        ImageView number_four = (ImageView)findViewById(R.id.number_four);
        number_four.setOnClickListener(this);

        ImageView number_five = (ImageView)findViewById(R.id.number_five);
        number_five.setOnClickListener(this);

        ImageView number_six = (ImageView)findViewById(R.id.number_six);
        number_six.setOnClickListener(this);

        ImageView solve = (ImageView)findViewById(R.id.equals);
        solve.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.number_one)
        {
            firstOutput.setText("1");
            firstNum = 1;
        }else if(view.getId() == R.id.number_two)
        {
            firstOutput.setText("2");
            firstNum = 2;
        }else if(view.getId() == R.id.number_three)
        {
            firstOutput.setText("3");
            firstNum = 3;
        }else if(view.getId() == R.id.number_four)
        {
            secondOutput.setText("4");
            secondNum = 4;
        }else if(view.getId() == R.id.number_five)
        {
             secondOutput.setText("5");
            secondNum = 5;
        }else if(view.getId() == R.id.number_six)
        {
            secondOutput.setText("6");
            secondNum = 6;
        }else if(view.getId() == R.id.equals)
        {
            lastOutput.setText(firstNum + secondNum +"");
        }

    }

}
