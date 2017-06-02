package org.palmdigital.intentsputextra01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity
{
    String newString;
    String story02;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        if(savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString = null;
            }else
            {
                newString = extras.getString("STORY_SO_FAR");
            }
        }else
        {
            newString = (String) savedInstanceState.getSerializable("STORY_SO_FAR");
        }

    }
    public void next02(View v)
    {

        //references

        EditText nat01 = (EditText)findViewById(R.id.nat01);
        String str_nat01 = nat01.getText().toString();

        story02 += newString + "" + str_nat01 + " chef";
        Intent j = new Intent(this, Main3Activity.class);

        j.putExtra("MORE_STORY", story02);

        startActivity(j);
    }

}
