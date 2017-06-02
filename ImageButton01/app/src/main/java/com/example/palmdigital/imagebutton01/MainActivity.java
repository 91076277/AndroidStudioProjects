package com.example.palmdigital.imagebutton01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageButton01 = (ImageButton)findViewById(R.id.imageButton01);
        imageButton01.setOnClickListener(this);

        ImageButton imageButton02 = (ImageButton)findViewById(R.id.imageButton02);
        imageButton02.setOnClickListener(this);

        ImageButton imageButton03 = (ImageButton)findViewById(R.id.imageButton03);
        imageButton03.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.imageButton01 )
        {
            Log.i("info", "The right arrow was clicked.");
            Toast.makeText(this, "YOU CLICKED THE RIGHT ARROW!", Toast.LENGTH_SHORT).show();
        }else if(view.getId() == R.id.imageButton02 )
        {
        Log.i("info", "The stop sign was clicked.");
        Toast.makeText(this, "YOU CLICKED THE STOP SIGN", Toast.LENGTH_SHORT).show();
        }if(view.getId() == R.id.imageButton03 )
        {
        Log.i("info", "The left arrow was clicked.");
        Toast.makeText(this, "YOU CLICKED THE LEFT ARROW!", Toast.LENGTH_SHORT).show();
        }

    }

}
