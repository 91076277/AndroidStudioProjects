package com.example.palmdigital.buttonchallenge01;

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

        Button buttonObject01 = (Button)findViewById(R.id.button01);
        buttonObject01.setText("Contacts");
        buttonObject01.setBackgroundColor(0xff0000ff);
        buttonObject01.setOnClickListener(this);

        Button buttonObject02 = (Button)findViewById(R.id.button02);
        buttonObject02.setText("Email");
        buttonObject02.setBackgroundColor(0xffcccccc);
        buttonObject02.setOnClickListener(this);

        Button buttonObject03 = (Button)findViewById(R.id.button03);
        buttonObject03.setText("Messages");
        buttonObject03.setBackgroundColor(0xffff0000);
        buttonObject03.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.button01)
        {
            Log.i("Info", "You selected Contacts.");
            Toast.makeText(this, "You selected Contacts.", Toast.LENGTH_SHORT).show();
        }else if(view.getId() == R.id.button02)
        {
            Log.i("Info", "You selected Email.");
            Toast.makeText(this, "You selected Email.", Toast.LENGTH_SHORT).show();
        }else if(view.getId() == R.id.button03)
        {
            Log.i("Info", "You selected Messages.");
            Toast.makeText(this, "You selected Messages.", Toast.LENGTH_SHORT).show();
        }
    }
}
