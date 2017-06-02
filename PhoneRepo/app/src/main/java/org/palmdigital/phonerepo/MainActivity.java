package org.palmdigital.phonerepo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity
{
    EditText studentNameE;
    EditText studentIdE;
    EditText phoneDescriptionE;

    String studentName;
    String studentId;
    String phoneDescription;

    SharedPreferences pref;
    SharedPreferences.Editor editor;

    String dataBaseName = "PhoneRepoInfo";
    String studentNameKey = "studentNameKey";
    String studentIDKey = "studentIDKey";
    String phoneDescriptionKey = "phoneDescrKey";
    String defaultString = "no info added";



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        studentNameE = (EditText)findViewById(R.id.studentName);
        studentIdE = (EditText)findViewById(R.id.studentId);
        phoneDescriptionE = (EditText)findViewById(R.id.phoneDescription);

        pref = getApplicationContext().getSharedPreferences(dataBaseName, MODE_PRIVATE);
        editor = pref.edit();

    }
    public void save(View v)
    {

        studentName = studentNameE.getText().toString();
        studentId = studentIdE.getText().toString();
        phoneDescription = phoneDescriptionE.getText().toString();

        editor.putString(studentNameKey, studentName);
        editor.putString(studentIDKey, studentId);
        editor.commit();
    }
    public void load(View view)
    {

        String studentNameShow = pref.getString(studentNameKey, studentName);

        TextView test01 = (TextView)findViewById(R.id.test01);
        test01.setText(studentNameShow);
    }
}
