package com.example.palmdigital.imageview05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView contacts = (ImageView)findViewById(R.id.contacts);
        contacts.setOnClickListener(this);

        ImageView messages = (ImageView)findViewById(R.id.messages);
        messages.setOnClickListener(this);

        ImageView email = (ImageView)findViewById(R.id.emails);
        email.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        if(view.getId() == R.id.contacts)
        {
            Log.i("info", "Contacts was clicked.");
            Toast.makeText(this, "YOU CLICKED CONTACTS!", Toast.LENGTH_SHORT).show();
        }else if(view.getId() == R.id.messages)
        {
            Log.i("info", "Messages was clicked.");
            Toast.makeText(this, "YOU CLICKED MESSAGES!", Toast.LENGTH_SHORT).show();
        }else if(view.getId() == R.id.emails)
        {
            Log.i("info", "Emails was clicked.");
            Toast.makeText(this, "YOU CLICKED EMAILS!", Toast.LENGTH_SHORT).show();
        }
    }

}
