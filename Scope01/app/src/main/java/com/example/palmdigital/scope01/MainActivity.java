package com.example.palmdigital.scope01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

//We are outside the MainActivity class and any methods.
    //You cannot create variables here.

    //Understanding how scope works is VERY important!!

public class MainActivity extends AppCompatActivity
{
    //In MainActivity class but outside of any methods.

    // fields - these variables have classwide scope -- any code inside the class can see and use these variables
    String myString;
    // declare a field that is a double named enemyHealth

    Double enemyHealth;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Here, we are inside the onCreate(), which is inside the class

        //When we 'declare' or 'define' a variable we use the following format:
        //dataType variableName; <-- this is a variable declaration/definition
        //Some examples:
        int myInt; //<-- This is declaring a variable of dataTye 'int' and named 'myInt'
        double myDouble; //<-- this is declaring the variable of dataType 'double' and named 'myDouble'
        TextView textView_story; // <-- declaring variable of dataType 'TextView' and named 'textView_story'
        ImageView imageView_ex; //<-- declaring a variable of dataType 'ImageView' and named 'imageView_ex'

        // Assigning a value to a declared variable
        // After we declare a variable we can assign a value to it
        // variableName = someValueOfTheSameDataTypeAsTheVariable;
        // Some examples:
        myInt = 10; // <-- setting the value of 'myInt' to 10, 'myInt' has dataType 'int and 10 is an 'int'
        myDouble = 20.12; //<-- myDouble gets 20.12
        textView_story = (TextView)findViewById(R.id.textView_story); //<-- set value of 'textView_story' to UI
                                                                        //element R.id.textView_story
        imageView_ex = (ImageView)findViewById(R.id.androidDude);

        // You know you can declare and assign in the same step
        // dataType variableName = someValueOfTheSameDataTypeAsTheVariable;
        // Some examples
        int myInt2 = 25; // <--  Declaration and assignment
        myInt2 = 50; // What is the difference here? this is only an assignment
        // THE DIFFERENCE IS THE DATA TYPE INT!
        myString = "This is a string"; // <-- declaration and an assignment
        myString = "This is another string"; // <-- just an assignment

        // !!!!!!!!!!!!!! Wherever you declare a variable determines that variable's scope !!!!!!!!!
        // In other words, if I declare a variable in onCreate, only code in onCreate can see it and use it
        // Nothing outside on onCreate can see it

        enemyHealth = 7.3;

    }//End of onCreate()

        public void myAwesomeMethod01()
        {
           myString = "What's going on here..";
            enemyHealth = 4.8;
        }// end of myAwesomeMethod01

        public void myAwesomeMethod02()
        {
            enemyHealth = 55.3;
        }

}//End of class
    // Do not do stuff out here