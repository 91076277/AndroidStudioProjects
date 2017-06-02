package org.palmdigital.puppymadlibs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void next01(View view)
    {
        EditText eColor = (EditText)findViewById(R.id.color);
        EditText eBodyPart = (EditText)findViewById(R.id.bodyPart);
        EditText eNoun01 = (EditText)findViewById(R.id.noun01);
        EditText eVerb01 = (EditText)findViewById(R.id.verb01);
        EditText eAdj01 = (EditText)findViewById(R.id.adj01);

        String color = eColor.getText().toString();
        String bodyPart = eBodyPart.getText().toString();
        String noun01 = eNoun01.getText().toString();
        String verb01 = eVerb01.getText().toString();
        String adj01 = eAdj01.getText().toString();

        String story = "Today I saw him again. When he looks at me " +
                "with those " + color + " eyes, it makes my " + bodyPart
            + " go pitterpat, and I feel as if I have " + noun01 +
            "in my stomach. When he scrunches his nose, I want to "
            + verb01 + " him softly. He is so " + adj01;

        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        i.putExtra("FIRST_PART_OF_STORY",story);
        startActivity(i);

    }

}
