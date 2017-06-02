package com.example.palmdigital.consolelog03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity
{
// fields - class level variables
    private int myInt;
    private double myDouble;
    private String myString;
    private boolean myBoolean;
    private float myFloat;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myInt = setIntValue();
        Log.i("info", "myInt = " + myInt);

        myDouble = setDoubleValue();
        Log.i("info", "myDouble = " + myDouble);

        myString = setStringValue();
        Log.i("info", "myString = " + myString);

        myBoolean = setBooleanValue();
        Log.i("info", "myBoolean = " + myBoolean);

        //declare a float variable called myFloat
        //set  its value with a funvtion called setFloat Value
        //return the sum of two floats

        myFloat = setFloatValue();
        Log.i("info", "myFloat = " + myFloat);
    }
   public int setIntValue()
    {
       return 10;
    }

    public double setDoubleValue()
    {
        return 10.987;
    }

    public String setStringValue()
    {
        return "This is a String";
    }

    public Boolean setBooleanValue()
    {
        return true;
    }

    public float setFloatValue()
    {
        return 4.4f + 3.5f;
    }
}
