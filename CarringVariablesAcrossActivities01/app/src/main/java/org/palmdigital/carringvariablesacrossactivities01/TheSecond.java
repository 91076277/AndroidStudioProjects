package org.palmdigital.carringvariablesacrossactivities01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TheSecond extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_second);

        Intent i = getIntent();

        String testString = (String)i.getSerializableExtra("Test01");

        TextView textView02 = (TextView)findViewById(R.id.textView2);

        textView02.setText(testString);
    }

}
