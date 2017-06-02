package org.palmdigital.buttonclicks_v01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button button = (Button)findViewById(R.id.getName);

    } //end of onCreate()
    public void getName(View view)
    {
        Toast.makeText(this, "This button works!", Toast.LENGTH_LONG).show();
    } // end of getName()
    public void buttoness(View mortal)
    {
        Toast.makeText(this, "Do not touch me peasant!", Toast.LENGTH_LONG).show();
    } // end of buttoness()
    public void glorious(View diePeasant)
    {
        Toast.makeText(this, "*points spear threateningly*", Toast.LENGTH_LONG).show();
    } // end of glorious()
} //end of MainActivity
