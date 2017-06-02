package com.example.palmdigital.consolelog01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int myInt = 4;
        double myDouble = 4.5;
        float myFloat = 4.3f;

        String myString = "I am a string value.";

        System.out.println(myInt);
        System.out.println(myDouble);

        Log.i("info", "myInt =" + myInt);
        Log.i("info", "MyDouble =" + myDouble);
        Log.i("info", "MyFloat =" + myFloat);
        Log.i("info", "MyString = " + myString);

        if(myInt == 10)
        {
            Log.i("info", "the test is true");
        }
        else
        {
            Log.i("info","The test is false.");
        }

        if(myDouble == 4.5)
        {
            Log.i("info", "the test is true");
        }
        else
        {
            Log.i("info","The test is false.");
        }

        //function
        myInt = changeValue();

        Log.i("info", "MyInt has changed to " + myInt);
    }
    public int changeValue()
    {
        return 400;
    }
}
