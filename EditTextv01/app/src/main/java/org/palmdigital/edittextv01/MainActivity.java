package org.palmdigital.edittextv01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(this);


    }

    public void onClick(View view)
    {
        TextView result = (TextView)findViewById(R.id.result);
        EditText firstName = (EditText)findViewById(R.id.firstName);
        EditText lastName = (EditText)findViewById(R.id.lastName);
        EditText workPhone = (EditText)findViewById(R.id.workPhone);

        String yourName = "Your name is: ";
        yourName += firstName.getText().toString() + "" + lastName.getText().toString();

        result.setText(yourName);
    }
}
