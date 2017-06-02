package com.example.palmdigital.steamdemo01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button myButton01 = (Button)findViewById(R.id.myButton01);
        myButton01.setOnClickListener(this);

    }

    public void onClick(View view)
    {
        Log.i("Info", "You clicked the button.");
    }

}
