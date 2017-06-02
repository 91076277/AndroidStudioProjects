package com.example.palmdigital.chooseadventure01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WakeUpActivity extends AppCompatActivity implements View.OnClickListener
{

    Button back01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_up);

        TextView story02 = (TextView)findViewById(R.id.story02);
        story02.setText("You wake up and have a boring day. The end");

        back01 = (Button)findViewById(R.id.back01);
        back01.setText("Back to the Beginning!");
        back01.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.back01)
        {
            Intent l = new Intent(this, MainActivity.class);
            startActivity(l);

        }
    }
}
