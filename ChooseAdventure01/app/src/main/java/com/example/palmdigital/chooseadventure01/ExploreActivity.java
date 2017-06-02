package com.example.palmdigital.chooseadventure01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ExploreActivity extends AppCompatActivity implements View.OnClickListener
{
    Button  backyard ;
    Button toilet;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explore);

        //referances
        TextView story03 = (TextView)findViewById(R.id.story03);
        story03.setText("You approach a glowing, green bucket of ooze. Worried that you will" +
                " get in trouble, you pick up the bucket.");
        TextView question03 = (TextView)findViewById(R.id.question03);
        question03.setText("Do you want to pour the ooze into the 'backyard' or 'toilet'?");
        backyard = (Button)findViewById(R.id.backyard);
        backyard .setText("Backyard");
        backyard.setOnClickListener(this);
        toilet = (Button)findViewById(R.id.toilet);
        toilet.setText("Toilet");
        toilet.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.backyard)
        {
            Intent x = new Intent(this, BackyardActivity.class);
            startActivity(x);

        }else if(view.getId() == R.id.toilet)
        {
            Intent y = new Intent(this, ToiletActivity.class);
            startActivity(y);
        }
    }
}

