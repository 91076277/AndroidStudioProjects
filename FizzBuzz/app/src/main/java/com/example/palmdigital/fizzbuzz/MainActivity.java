package com.example.palmdigital.fizzbuzz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String stringValue;
    int intValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView output = (TextView)findViewById(R.id.output);

        EditText valueFromUser = (EditText)findViewById(R.id.editText);
        //stringValue = valueFromUser.getText().toString();

       // intValue = Integer.parseInt(stringValue);
        intValue = Integer.parseInt(valueFromUser.getText().toString());

        if(intValue % 3 == 0 && intValue % 5 == 0)jujhjjjujdkk kjbggrj
        {
            output.setText("Fizz Buzz");
        }
        else if(intValue % 3 == 0)
        {
            output.setText("Fizz");
        }
        else if(intValue % 5 == 0)
        {
            output.setText("Buzz");
        }
        else
        {
            output.setText(stringValue);
        }

    }
}
