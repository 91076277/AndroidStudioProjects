package org.palmdigital.pizzamadlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void getStory(View pizza)
    {
        EditText adjective01 = (EditText)findViewById(R.id.adjective01);
        EditText nationality = (EditText)findViewById(R.id.nationality);
        EditText personName = (EditText)findViewById(R.id.personName);
        EditText noun01 = (EditText)findViewById(R.id.noun01);
        EditText adjective02 = (EditText)findViewById(R.id.adjective02);
        EditText adjective03 = (EditText)findViewById(R.id.adjective03);
        EditText pluralNoun01 = (EditText)findViewById(R.id.pluralNoun01);
        EditText noun02 = (EditText)findViewById(R.id.noun02);
        String adjective01s = adjective01.getText().toString();
        char aOrAn = adjective01s.charAt(0);
        TextView storyTextView = (TextView)findViewById(R.id.storyTextView);
        String story;

        if(aOrAn == 'a' || aOrAn == 'e' || aOrAn == 'i' || aOrAn == 'o' || aOrAn == 'u')
        {
             story = "Pizza was invented by an ";
            story = story + adjective01s + " " + nationality.getText().toString() +
                    " chef named " + personName.getText().toString() + ". To make pizza, you need to " +
                    "take a lump of " + noun01.getText().toString() + ", and make a thin, round "
                    + adjective02.getText().toString() + " sauce, " + adjective03.getText().toString()
                    + " cheese, and fresh chopped " + pluralNoun01.getText().toString() + ". Next " +
                    "you have to bake it in a very hot " + noun02.getText().toString();
            storyTextView.setText(story);
        }else
        {
            story = "Pizza was invented by a ";
            story = story + adjective01s + " " + nationality.getText().toString() +
                    " chef named " + personName.getText().toString() + ". To make pizza, you need to " +
                    "take a lump of " + noun01.getText().toString() + ", and make a thin, round "
                    + adjective02.getText().toString() + " sauce, " + adjective03.getText().toString()
                    + " cheese, and fresh chopped " + pluralNoun01.getText().toString() + ". Next " +
                    "you have to bake it in a very hot " + noun02.getText().toString();
            storyTextView.setText(story);
        }



    }
}
