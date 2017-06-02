package com.example.palmdigital.chooseadventure01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ToiletActivity extends AppCompatActivity implements View.OnClickListener
{
        Button yes;
        Button heckYes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toilet);

        //referances
        TextView story04 = (TextView)findViewById(R.id.story04);
        story04.setText("As you pour the ooze into the toilet it backs up, gurgles, and explodes, " +
                "covering you in radioactive waste.");
        TextView question04 = (TextView)findViewById(R.id.question04);
        question04.setText("Do you want to train to be a NINJA?  'Yes' or 'HECK YES'?");
        yes = (Button)findViewById(R.id.yes);
        yes .setText("Yes");
        yes.setOnClickListener(this);
        heckYes = (Button)findViewById(R.id.heckYes);
        heckYes.setText("Heck Yes!");
        heckYes.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.yes)
        {
            Intent a = new Intent(this, NinjaActivity.class);
            startActivity(a);

        }else if(view.getId() == R.id.heckYes)
        {
            Intent b = new Intent(this, NinjaActivity.class);
            startActivity(b);
        }
    }
}