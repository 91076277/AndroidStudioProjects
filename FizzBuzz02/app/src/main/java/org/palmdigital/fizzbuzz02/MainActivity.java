package org.palmdigital.fizzbuzz02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void getAnswer(View v)
    {
        EditText eInput = (EditText)findViewById(R.id.editText);
        TextView output = (TextView)findViewById(R.id.output);

        String sInput = eInput.getText().toString();
        int input = Integer.parseInt(sInput);

        if(input % 5 == 0)
        {
          if (input % 3 == 0)
          {
              output.setText("Fizz Buzz");
          }else
          {
              output.setText("Buzz");
          }

        }else if(input % 3 == 0)
        {
            output.setText("Fizz");
        }else
        {
            output.setText(sInput);
        }
    }
}
