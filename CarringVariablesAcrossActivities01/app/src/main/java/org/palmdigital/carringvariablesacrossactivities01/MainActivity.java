package org.palmdigital.carringvariablesacrossactivities01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView test01 = (TextView)findViewById(R.id.textView);

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String testString = "It is.";

        test01.setText("Is this working?");

        Intent i = new Intent(this, TheSecond.class);
        i.putExtra("Test01", testString);
        startActivity(i);
    }
    public void click(View troll)
    {
        Intent j = new Intent(this, TheSecond.class);
        startActivity(j);
    }

}
