package com.example.palmdigital.button05;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button)findViewById(R.id.buttonMyButton01);
        buttonObject01.setText("The ALL POWERFUL BUTTON");
        buttonObject01.setOnClickListener(this);
        buttonObject01.setBackgroundColor(0xff00ffff);

        Button buttonObject02 = (Button)findViewById(R.id.buttonMyButton02);
        buttonObject02.setText("The GREAT king of buttons");
        buttonObject02.setOnClickListener(this);
        buttonObject02.setBackgroundColor(0xffff00ff);

        Button buttonObject03 = (Button)findViewById(R.id.buttonMyButton03);
        buttonObject03.setText("A rebellion against the ALL POWERFUL button.");
        buttonObject03.setOnClickListener(this);
        buttonObject03.setBackgroundColor(0xffffff00);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonMyButton01)
        {
            Toast.makeText(this, "The ALL POWERFUL BUTTON blesses you.",
                    Toast.LENGTH_SHORT).show();
            Log.i("Info", "You have been blessed by the ALL POWERFUL BUTTON.");
        }else if (view.getId() == R.id.buttonMyButton02)
        {
            Toast.makeText(this, "The GREAT KING of buttons has made you a knight of the realm",
                    Toast.LENGTH_SHORT).show();
            Log.i("Info", "You are now a noble knight of the great button realm.");
        }else if (view.getId() == R.id.buttonMyButton03)
        {
            Toast.makeText(this, "You have joined the rebellion.",
                    Toast.LENGTH_SHORT).show();
            Log.i("Info", "The rebellion was crushed.");
    }

}
