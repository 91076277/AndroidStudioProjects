package com.example.palmdigital.chooseadventure01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    Button wakeUp;
    Button explore;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referances
        TextView story01 = (TextView)findViewById(R.id.story01);
        story01.setText("One morning the tortoise woke up in a dream");
        TextView question01 = (TextView)findViewById(R.id.question01);
        question01.setText("Would you like to wake up or explore the dream?");
        wakeUp = (Button)findViewById(R.id.wakeUp);
        wakeUp.setText("Wake Up");
        wakeUp.setOnClickListener(this);
        explore = (Button)findViewById(R.id.explore);
        explore.setText("Explore");
        explore.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.wakeUp)
        {
            Intent i = new Intent(this, WakeUpActivity.class);
            startActivity(i);

        }else if(view.getId() == R.id.explore)
        {
            Intent j = new Intent(this, ExploreActivity.class);
            startActivity(j);
        }
    }
}
