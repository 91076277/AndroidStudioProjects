package com.example.palmdigital.steamdemo03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView myTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton = (Button)findViewById(R.id.button);
         myTextView = (TextView)findViewById(R.id.textView);

    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.button) {
            myTextView.setText("Hello Sara!");
        }
    }
}
