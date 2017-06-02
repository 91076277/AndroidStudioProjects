package com.example.palmdigital.chooseadventure01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NinjaActivity extends AppCompatActivity implements View.OnClickListener
{
    Button back02;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ninja);

        TextView story04 = (TextView)findViewById(R.id.story05);
        story04.setText("Awesome dude!  You live out the rest of your life fighting" +
                " crimes and eating pizza!");

        back02 = (Button)findViewById(R.id.back02);
        back02.setText("Back to the Beginning!");
        back02.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.back02)
        {
            Intent l = new Intent(this, MainActivity.class);
            startActivity(l);

        }
    }
}
