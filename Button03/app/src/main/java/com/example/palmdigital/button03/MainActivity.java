package com.example.palmdigital.button03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button)findViewById(R.id.buttonMyButton01);
        buttonObject01.setOnClickListener(this);
    }// end of onCreate method
    public void onClick(View view)
    {
        Log.i("Info", "You pressed the button");
        Toast.makeText(this, "DO NOT TOUCH THE GREAT KING OF BUTTONS PEASANT!!!",
                Toast.LENGTH_SHORT).show();
    }
}
