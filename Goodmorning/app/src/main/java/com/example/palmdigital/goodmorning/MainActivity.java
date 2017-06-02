package com.example.palmdigital.goodmorning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    TextView hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button goodmorning = (Button)findViewById(R.id.button);
        goodmorning.setOnClickListener(this);
         hello = (TextView) findViewById(R.id.textView);
    }
    public void onClick(View view) {
        if (view.getId() == R.id.button)
        {
            Log.i("info", "Goodmorning Jazmine");
            hello.setText("Goodmornig Jazmine");
        }
    }
}

