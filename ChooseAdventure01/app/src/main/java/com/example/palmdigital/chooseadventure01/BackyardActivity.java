package com.example.palmdigital.chooseadventure01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BackyardActivity extends AppCompatActivity implements View.OnClickListener
{
    Button scream;
    Button faint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backyard);

        //referances
        TextView story06 = (TextView)findViewById(R.id.story06);
        story06.setText("As you walk into the backyard a net scoops you up and " +
                "a giant takes you to a boiling pot of water.");
        TextView question06 = (TextView)findViewById(R.id.question06);
        question06.setText("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");
        scream = (Button)findViewById(R.id.scream);
        scream .setText("Scream");
        scream.setOnClickListener(this);
        faint = (Button)findViewById(R.id.faint);
        faint.setText("Faint");
        faint.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.scream)
        {
            Intent c = new Intent(this, MainActivity.class);
            startActivity(c);

        }else if(view.getId() == R.id.faint)
        {
            Intent d = new Intent(this, SoupActivity.class);
            startActivity(d);
        }
    }
}