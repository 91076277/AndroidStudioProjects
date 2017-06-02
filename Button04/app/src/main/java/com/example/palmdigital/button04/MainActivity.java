package com.example.palmdigital.button04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonObject01 = (Button)findViewById(R.id.buttonMyButton01);
        buttonObject01.setText("The ALL POWERFUL BUTTON");
        buttonObject01.setOnClickListener(this);

        Button buttonObject02 = (Button)findViewById(R.id.buttonMyButton02);
        buttonObject02.setText("The GREAT king of buttons");
        buttonObject02.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.buttonMyButton01)
        {
            Toast.makeText(this, "The ALL POWERFUL BUTTON blesses you.",
                    Toast.LENGTH_SHORT).show();
            Log.i("Info", "You have been blessed by the ALL POWERFUL BUTTON.");
        }else if (view.getId() == R.id.buttonMyButton02)
        {
            Toast.makeText(this, "The GREAT KING of buttons has made you a knight of the realm",
                    Toast.LENGTH_SHORT).show();
            Log.i("Info", "You are now a noble knight of the great button realm.");
        }
    }

}
