package org.palmdigital.puppymadlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity
{

    String finalStory;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                finalStory= null;
            } else {
                finalStory= extras.getString("SECOND_PART_OF_STORY");
            }
        } else {
            finalStory= (String) savedInstanceState.getSerializable("SECOND_PART_OF_STORY");
        }

        TextView finalView = (TextView)findViewById(R.id.finalView);
        finalView.setText(finalStory);

    }
}
