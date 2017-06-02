package com.example.palmdigital.chooseadventure01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SoupActivity extends AppCompatActivity implements View.OnClickListener
{
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soup);

        TextView story08 = (TextView)findViewById(R.id.story08);
        story08.setText("You made a delicious soup! Yum! The end.");

        back = (Button)findViewById(R.id.back);
        back.setText("Back to the Beginning!");
        back.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.back)
        {
            Intent k = new Intent(this, MainActivity.class);
            startActivity(k);

        }
}
}
