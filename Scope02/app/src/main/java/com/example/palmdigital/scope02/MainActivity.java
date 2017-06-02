package com.example.palmdigital.scope02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
// fields
    int a;
    double b;
    String c;
    TextView e;
    ImageView f;
    float g;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void  myAwesomeMethod01()
    {
        int myInt00;
        double myDouble00;
        String myString00;
        TextView myTextView00;
        ImageView myImageView00;
        Button myButton00;
        c = "Hello.";
        f = (ImageView)findViewById(R.id.imageView);

    }
    public void  myAwesomeMethod02()
    {
        int myInt01;
        double myDouble01;
        String myString01;
        TextView myTextView01;
        ImageView myImageView01;
        Button myButton01;
        e = (TextView)findViewById(R.id.textView8);

    }
    public void  myAwesomeMethod03()
    {
        int myInt02;
        double myDouble02;
        String myString02;
        TextView myTextView02;
        ImageView myImageView02;
        Button myButton02;
        a = 9;

    }public void  myAwesomeMethod04()
    {
        int myInt03;
        double myDouble03;
        String myString03;
        TextView myTextView03;
        ImageView myImageView03;
        Button myButton03;
        e = (Button)findViewById(R.id.button4);

    }
    public void  myAwesomeMethod05()
    {
        int myInt04;
        double myDouble04;
        String myString04;
        TextView myTextView04;
        ImageView myImageView04;
        Button myButton04;
        b = 8.8;
        g = 5.8f;

    }
}
