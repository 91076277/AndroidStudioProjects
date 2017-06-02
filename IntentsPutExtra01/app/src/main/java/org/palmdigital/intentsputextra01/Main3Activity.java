package org.palmdigital.intentsputextra01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity
{
    String newString02;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        if(savedInstanceState == null)
        {
            Bundle extras = getIntent().getExtras();
            if (extras == null)
            {
                newString02 = null;
            }else
            {
                newString02 = extras.getString("MORE_STORY");
            }
        }else
        {
            newString02 = (String) savedInstanceState.getSerializable("MORE_STORY");
        }

        TextView finalStoryView = (TextView)findViewById(R.id.finalStory);
        finalStoryView.setText(newString02);
    }
}
