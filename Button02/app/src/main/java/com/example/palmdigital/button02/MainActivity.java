package com.example.palmdigital.button02;

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
        buttonObject01.setText("Button One - A Fabulous Button");

        buttonObject01.setOnClickListener(this);
    } //end of the onCreate method

    public void onClick(View view)
    {
        Log.i("info", "YoU pReSsEd BuTtOn OnE!!");
        Toast.makeText(this, "YoU pReSsEd BuTtOn OnE!!", Toast.LENGTH_SHORT).show();
    } //end of onClick method
}
