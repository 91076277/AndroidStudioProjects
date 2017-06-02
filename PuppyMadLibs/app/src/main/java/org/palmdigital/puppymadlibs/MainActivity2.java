package org.palmdigital.puppymadlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity
{
    String story02;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                story02= null;
            } else {
                story02= extras.getString("FIRST_PART_OF_STORY");
            }
        } else {
            story02= (String) savedInstanceState.getSerializable("FIRST_PART_OF_STORY");
        }
    }
    public void next02(View v)
    {
        EditText eAdj02 = (EditText)findViewById(R.id.adj02);
        EditText eVerb02 = (EditText)findViewById(R.id.verb02);
        EditText eNoun02 = (EditText)findViewById(R.id.noun02);
        EditText eNoun03 = (EditText)findViewById(R.id.noun03);

        String adj02 = eAdj02.getText().toString();
        String verb02 = eVerb02.getText().toString();
        String noun02 = eNoun02.getText().toString();
        String noun03 = eNoun03.getText().toString();

        story02 += " and " + adj02 + ". Tomorrow he will be mine. " +
                "For now he " + verb02 + " in the store " + noun02
                + " looking at me. " + noun03 + " love is hard to " +
                "resist!";

        Intent j = new Intent(this, MainActivity3.class);
        j.putExtra("SECOND_PART_OF_STORY", story02);
        startActivity(j);
    }

}
