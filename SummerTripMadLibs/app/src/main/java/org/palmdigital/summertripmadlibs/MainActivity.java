package org.palmdigital.summertripmadlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void getStory(View view)
    {
        EditText personName = (EditText)findViewById(R.id.personName);
        EditText place01 = (EditText)findViewById(R.id.place);
        EditText adjective01 = (EditText)findViewById(R.id.adjective01);
        EditText pluralNoun01 = (EditText)findViewById(R.id.pluralNoun01);
        EditText adjective02 = (EditText)findViewById(R.id.adjective02);
        EditText pluralNoun02 = (EditText)findViewById(R.id.pluralNoun02);
        EditText place02 = (EditText)findViewById(R.id.place02);
        EditText actionVerb01 = (EditText)findViewById(R.id.actionVerb01);
        EditText pluralNoun03 = (EditText)findViewById(R.id.pluralNoun03);
        TextView story = (TextView)findViewById(R.id.story);

        String storyString = "Last Summer my mum and dad took me and ";
        storyString += personName.getText().toString();
        storyString += " on a trip to ";
        storyString += place01.getText().toString();
        storyString += ". The weather there is very ";
        storyString += adjective01.getText().toString();
        storyString += "! Northern ";
        storyString += place01.getText().toString();
        storyString += " has many ";
        storyString += pluralNoun01.getText().toString();
        storyString += ", and they make ";
        storyString += adjective02.getText().toString();
        storyString += "";
        storyString += pluralNoun02.getText().toString();
        storyString += ". Many people also go to ";
        storyString += place02.getText().toString();
        storyString += " to ";
        storyString += actionVerb01.getText().toString();
        storyString += " or see the ";
        storyString += pluralNoun03.getText().toString();



        story.setText(storyString);
    }
}
