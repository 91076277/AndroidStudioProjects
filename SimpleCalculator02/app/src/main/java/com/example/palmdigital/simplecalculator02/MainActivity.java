package com.example.palmdigital.simplecalculator02;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int firstNum;
    int secondNum;
    int solved;
    TextView output01;
    TextView output02;
    TextView finalOutput;
    ImageView addition;
    ImageView subtraction;
    ImageView division;
    ImageView multiplication;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output01 = (TextView) findViewById(R.id.output01);

        ImageView numberRow0100 = (ImageView) findViewById(R.id.numberRow0100);
        numberRow0100.setOnClickListener(this);

        ImageView numberRow0101 = (ImageView) findViewById(R.id.numberRow0101);
        numberRow0101.setOnClickListener(this);

        ImageView numberRow0102 = (ImageView) findViewById(R.id.numberRow0102);
        numberRow0102.setOnClickListener(this);

        ImageView numberRow0103 = (ImageView) findViewById(R.id.numberRow0103);
        numberRow0103.setOnClickListener(this);

        ImageView numberRow0104 = (ImageView) findViewById(R.id.numberRow0104);
        numberRow0104.setOnClickListener(this);

        ImageView numberRow0105 = (ImageView) findViewById(R.id.numberRow0105);
        numberRow0105.setOnClickListener(this);

        ImageView numberRow0106 = (ImageView) findViewById(R.id.numberRow0106);
        numberRow0106.setOnClickListener(this);

        ImageView numberRow0107 = (ImageView) findViewById(R.id.numberRow0107);
        numberRow0107.setOnClickListener(this);

        ImageView numberRow0108 = (ImageView) findViewById(R.id.numberRow0108);
        numberRow0108.setOnClickListener(this);

        ImageView numberRow0109 = (ImageView) findViewById(R.id.numberRow0109);
        numberRow0109.setOnClickListener(this);

        addition = (ImageView) findViewById(R.id.addition);
        addition.setOnClickListener(this);

        subtraction = (ImageView) findViewById(R.id.subtraction);
        subtraction.setOnClickListener(this);

        division = (ImageView)findViewById(R.id.division);
        division.setOnClickListener(this);

        multiplication = (ImageView)findViewById(R.id.multiplication);
        multiplication.setOnClickListener(this);

        output02 = (TextView) findViewById(R.id.output02);

        ImageView numberRow0200 = (ImageView) findViewById(R.id.numberRow0200);
        numberRow0200.setOnClickListener(this);

        ImageView numberRow0201 = (ImageView) findViewById(R.id.numberRow0201);
        numberRow0201.setOnClickListener(this);

        ImageView numberRow0202 = (ImageView) findViewById(R.id.numberRow0202);
        numberRow0202.setOnClickListener(this);

        ImageView numberRow0203 = (ImageView) findViewById(R.id.numberRow0203);
        numberRow0203.setOnClickListener(this);

        ImageView numberRow0204 = (ImageView) findViewById(R.id.numberRow0204);
        numberRow0204.setOnClickListener(this);

        ImageView numberRow0205 = (ImageView) findViewById(R.id.numberRow0205);
        numberRow0205.setOnClickListener(this);

        ImageView numberRow0206 = (ImageView) findViewById(R.id.numberRow0206);
        numberRow0206.setOnClickListener(this);

        ImageView numberRow0207 = (ImageView) findViewById(R.id.numberRow0207);
        numberRow0207.setOnClickListener(this);

        ImageView numberRow0208 = (ImageView) findViewById(R.id.numberRow0208);
        numberRow0208.setOnClickListener(this);

        ImageView numberRow0209 = (ImageView) findViewById(R.id.numberRow0209);
        numberRow0209.setOnClickListener(this);

        ImageView equals = (ImageView) findViewById(R.id.equals);
        equals.setOnClickListener(this);

        finalOutput = (TextView) findViewById(R.id.finalOutput);
    }

    public void onClick(View view)
    {
        int pOrM;
        if (view.getId() == R.id.numberRow0100) {
            firstNum = 0;
            output01.setText("0");
        } else if (view.getId() == R.id.numberRow0101) {
            firstNum = 1;
            output01.setText("1");
        } else if (view.getId() == R.id.numberRow0102) {
            firstNum = 2;
            output01.setText("2");
        } else if (view.getId() == R.id.numberRow0103) {
            firstNum = 3;
            output01.setText("3");
        } else if (view.getId() == R.id.numberRow0104) {
            firstNum = 4;
            output01.setText("4");
        } else if (view.getId() == R.id.numberRow0105) {
            firstNum = 5;
            output01.setText("5");
        } else if (view.getId() == R.id.numberRow0106) {
            firstNum = 6;
            output01.setText("6");
        } else if (view.getId() == R.id.numberRow0107) {
            firstNum = 7;
            output01.setText("7");
        } else if (view.getId() == R.id.numberRow0108) {
            firstNum = 8;
            output01.setText("8");
        } else if (view.getId() == R.id.numberRow0109) {
            firstNum = 9;
            output01.setText("9");
        } else if (view.getId() == R.id.numberRow0200) {
            secondNum = 0;
            output02.setText("0");
        } else if (view.getId() == R.id.numberRow0201) {
            secondNum = 1;
            output02.setText("1");
        } else if (view.getId() == R.id.numberRow0202) {
            secondNum = 2;
            output02.setText("2");
        } else if (view.getId() == R.id.numberRow0203) {
            secondNum = 3;
            output02.setText("3");
        } else if (view.getId() == R.id.numberRow0204) {
            secondNum = 4;
            output02.setText("4");
        } else if (view.getId() == R.id.numberRow0205) {
            secondNum = 5;
            output02.setText("5");
        } else if (view.getId() == R.id.numberRow0206) {
            secondNum = 6;
            output02.setText("6");
        } else if (view.getId() == R.id.numberRow0207) {
            secondNum = 7;
            output02.setText("7");
        } else if (view.getId() == R.id.numberRow0208) {
            secondNum = 8;
            output02.setText("8");
        } else if (view.getId() == R.id.numberRow0209) {
            secondNum = 9;
            output02.setText("9");
        } else if (view.getId() == R.id.addition) {
            pOrM = 0;
            colorSwitch(pOrM);
            calculate(pOrM);
        } else if (view.getId() == R.id.subtraction) {
            pOrM = 1;
            calculate(pOrM);
            colorSwitch(pOrM);
        } else if(view.getId() == R.id.division){
            pOrM = 2;
            calculate(pOrM);
            colorSwitch(pOrM);
        }else if(view.getId() == R.id.multiplication) {
            pOrM = 3;
            calculate(pOrM);
            colorSwitch(pOrM);
        }else if (view.getId() == R.id.equals) {
            finalOutput.setText(solved + "");
            pOrM = 4;
        }
    } // end of onClick()

    public void colorSwitch(int pOrM)
    {
        if(pOrM == 0)
        {
            addition.setBackgroundColor(0xffff0000);
            subtraction.setBackgroundColor(0xffcccccc);
            division.setBackgroundColor(0xffcccccc);
            multiplication.setBackgroundColor(0xffcccccc);
        }else if(pOrM == 1)
        {
            subtraction.setBackgroundColor(0xff00ffff);
            addition.setBackgroundColor(0xffcccccc);
            division.setBackgroundColor(0xffcccccc);
            multiplication.setBackgroundColor(0xffcccccc);
        }else if(pOrM == 2)
        {
            division.setBackgroundColor(0xff0000ff);
            multiplication.setBackgroundColor(0xffcccccc);
            addition.setBackgroundColor(0xffcccccc);
            subtraction.setBackgroundColor(0xffcccccc);
        }else if(pOrM == 3)
        {
            multiplication.setBackgroundColor(0xffff00ff);
            division.setBackgroundColor(0xffcccccc);
            addition.setBackgroundColor(0xffcccccc);
            subtraction.setBackgroundColor(0xffcccccc);
        }
    } // end of colorSwitch()

    public void calculate(int pOrM)
    {
        if(pOrM == 0)
        {
            solved = secondNum + firstNum;
        }else if(pOrM == 1)
        {
            solved = firstNum - secondNum;
        }else if(pOrM == 2)
        {
            solved = firstNum/secondNum;
        }else if(pOrM == 3)
        {
            solved = firstNum * secondNum;
        }
    }
}











