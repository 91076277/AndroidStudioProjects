package com.example.palmdigital.cyoav02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    Button path01;
    Button path02;
    TextView story;
    TextView question;
    int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = (TextView)findViewById(R.id.title);
        title.setText("Choose Your Own Adventure 02");

        story = (TextView)findViewById(R.id.story);
        story.setText("One morning the tortoise woke up in a dream");

        question = (TextView)findViewById(R.id.question);
        question.setText("Would you like to wake up or explore the dream?");

        path01 = (Button)findViewById(R.id.path01);
        path01.setOnClickListener(this);
        path01.setText("Wake up");

        path02 = (Button)findViewById(R.id.path02);
        path02.setOnClickListener(this);
        path02.setText("Explore");

        i = 0;
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.path01 && i == 0)
        {
            story.setText("You wake up and have a boring day. The end.");
            question.setText("");
            path01.setVisibility(View.INVISIBLE);
            path02.setVisibility(View.INVISIBLE);
        }else if(view.getId() == R.id.path02 && i == 0)
        {
            story.setText("You approach a glowing, gree, bucket of ooze. Worried that " +
                    "you might get in trouble, you pick up the bucket.");
            question.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
            path01.setText("Backyard");
            path02.setText("Toilet");
            i = 1;
        }else if(view.getId() == R.id.path01 && i == 1)
        {
            story.setText("As you walk into the backyard a net scoops you up and a giant takes" +
                    "you to a boiling pot of water.");
            question.setText("As the man starts to preoare you as soup, do you... 'scream' or 'faint'?");
            path01.setText("scream");
            path02.setText("faint");
            i = 2;
        }else if(view.getId() == R.id.path02 && i == 1)
        {
            story.setText("As you pour the ooze into the toiliet it backs up, gurgles, and explodes, " +
                    "covering you in radioactive waste.");
            question.setText("Do you want to become a ninja? 'yes' or 'heck yes'?");
            path01.setText("yes");
            path02.setText("heck yes");
            i = 3;
        }else if(view.getId() == R.id.path01 && i == 2)
        {
            story.setText("One morning the tortoise woke up in a dream");
            question.setText("Would you like to wake up or explore the dream?");
            path01.setText("wake up ");
            path02.setText("explore");
            i = 0;
        }else if(view.getId() == R.id.path02 && i == 2 )
        {
            story.setText("You made a delicious soup! Yum! The end.");
            question.setText("");
            path01.setVisibility(View.INVISIBLE);
            path02.setVisibility(View.INVISIBLE);
        }else if(view.getId() == R.id.path01 && i == 3)
        {
            story.setText("Awesome dude! You live the rest of your life fighting crimes and eating pizza!");
            question.setText("");
            path01.setVisibility(View.INVISIBLE);
            path02.setVisibility(View.INVISIBLE);
        }else if(view.getId() == R.id.path02 && i == 3)
        {
            story.setText("Awesome dude! You live the rest of your life fighting crimes and eating pizza!");
            question.setText("");
            path01.setVisibility(View.INVISIBLE);
            path02.setVisibility(View.INVISIBLE);
        }
    }
}
