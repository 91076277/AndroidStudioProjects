package com.example.palmdigital.sara;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView sparkles;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button glitter = (Button)findViewById(R.id.button);
        glitter.setOnClickListener(this);

        sparkles = (TextView)findViewById(R.id.textView);
    }
    public void onClick(View view)
    {
       if(view.getId() == R.id.button)
       {
           sparkles.setText("Goodmornig and goodnight!");
       }
    }
}
