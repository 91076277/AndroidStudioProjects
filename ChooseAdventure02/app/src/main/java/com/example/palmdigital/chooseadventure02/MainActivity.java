package com.example.palmdigital.chooseadventure02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button path01;
    Button path02;
    TextView title;
    TextView story;
    TextView question;
    int whichButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextView) findViewById(R.id.title);
        title.setText("Choose Your Own Adventure 02");

        story = (TextView) findViewById(R.id.story);
        story.setText("One Morning the tortoise woke up in a dream.");

        question = (TextView) findViewById(R.id.question);
        question.setText("Would you like to wake up or explore the dream?");

        path01 = (Button) findViewById(R.id.path01);
        path01.setText("Wake Up");
        path01.setOnClickListener(this);

        path02 = (Button) findViewById(R.id.path02);
        path02.setText("Explore");
        path02.setOnClickListener(this);




    }

    public void onClick(View view) {
        if (view.getId() == R.id.path01) {
            whichButton = 10;
            if (whichButton == 10) {
                story.setText("You woke up and had a boring day. The end.");
                question.setText("");
                path01.setText("");
                path02.setText("");
            }
            if (whichButton == 22) {
                story.setText("As you walk into the backyard a net scoops you up and a giant takes you" +
                        "to a boiling pot of water.");
                question.setText("As the man start to prepare you as soup, do you... 'Scream' or 'Faint'?");
                path01.setText("Scream");
                path02.setText("Faint");
                whichButton = 12;
            } else if (whichButton == 23) {
                story.setText("Awesome dude! You live out the rest of your life fighting crimes" +
                        "and eating pizza!");
                question.setText("");
                path01.setText("");
                path02.setText("");

            } if (whichButton == 12) {
                story.setText("One Morning the tortoise woke up in a dream.");
                question.setText("Would you like to wake up or explore the dream?");
                path01.setText("Wake Up");
                path02.setText("Explore");

            }
        }   else if (view.getId() == R.id.path02) {
                whichButton = 21;
                if (whichButton == 21) {
                    story.setText("You aproach a glowing, green bucket of oozze. Worried that you will " +
                            "get in trouble,you pick up the bucket.");
                    question.setText("Do you want to pour the ooze into the 'backyard' or the 'toilet'");
                    path01.setText("Backyard");
                    path02.setText("Toilet");
                    whichButton = 22;
                } else if (whichButton == 22) {
                    story.setText("As you pour the ooze into the toilet it backs up, gurgles, and explored, " +
                            "covering you in radioactive waste.");
                    question.setText("Do you want to train to be a ninja? 'Yes' or 'HECK YES");
                    path01.setText("Yes");
                    path02.setText("Heck Yes");
                    whichButton = 23;
                } else if (whichButton == 23) {
                    story.setText("Awesome dude! You live out the rest of your life fighting crimes" +
                            "and eating pizza!");
                    question.setText("");
                    path01.setText("");
                    path02.setText("");
                }else if (whichButton == 12) {
                    story.setText("You made a delicious soup! Yum! The end.");
                    question.setText("");
                    path01.setText("");
                    path02.setText("");
                }
            }
        }
    }

