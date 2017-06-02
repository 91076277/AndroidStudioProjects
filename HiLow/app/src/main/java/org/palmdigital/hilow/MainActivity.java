package org.palmdigital.hilow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    int input;
    String output;
    Random rand = new Random();
    int max = 100;
    int min = 1;
    int answer = rand.nextInt((max - min) + 1) + min;
    TextView outputTV;
    String str_input;
    EditText inputET;
    int currentNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void hiLow(View view)
    {
        currentNumber = 0;
        int maxClicks = 8;
        Button hiLowB = (Button)findViewById(R.id.hiLow);
        if(currentNumber == maxClicks)
        {
            hiLowB.setEnabled(false);
            Toast.makeText(this, "Your game is done! Start a new one!", Toast.LENGTH_SHORT).show();
        }else
        {
            currentNumber = currentNumber + 1;
            game02();
        }

    }
    public void game01()
    {

        outputTV = (TextView)findViewById(R.id.outputTV);
        inputET = (EditText)findViewById(R.id.inputET);
        str_input = inputET.getText().toString();
        input = Integer.parseInt(str_input);

        for (int i = 0; i < 1; i++)
        {
            if (input == answer)
            {
                output = "You won!";
            }
            else if (input > answer)
            {
                output = "Too high!";
            }
            else if (input < answer)
            {
                output = "Too low!";
            }
            outputTV.setText(output);
        }

    }
    public void game02()
    {
        inputET = (EditText)findViewById(R.id.inputET);
        str_input = inputET.getText().toString();
        input = Integer.parseInt(str_input);
        outputTV = (TextView)findViewById(R.id.outputTV);

        for (int i = 0; i < 8; i++)
        {
            if(i < 7)
            {
                game01();
            }else if(input != answer && i == 7)
            {
                output = "You Lost!";
            }
        }
    }

    public void newGame(View v)
    {
        Random rand = new Random();
         answer = rand.nextInt((max - min) + 1) + min;
        outputTV = (TextView)findViewById(R.id.outputTV);
        output = "New Game";
        outputTV.setText(output);
        currentNumber = 0;
    }

    }

