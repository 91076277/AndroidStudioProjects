package com.example.palmdigital.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    TextView firstNumOutput;
    TextView finalOutput;
    TextView secondNumOutput;
    Double firstNum;
    Double secondNum;
    Double solution;
    ImageView addition;
    ImageView subtraction;
    ImageView division;
    ImageView multiplication;
    ImageView clear;
    int operator;
    String numString01 = "";
    String numString02 = "";

    int firstNumNum00;
    int firstNumNum01;
    int firstNumNum02;
    int firstNumNum03;
    int firstNumNum04;
    int firstNumNum05;
    int firstNumNum06;
    int firstNumNum07;
    int firstNumNum08;
    int firstNumNum09;

    String firstNumOutput00;
    String firstNumOutput01;
    String firstNumOutput02;
    String firstNumOutput03;
    String firstNumOutput04;
    String firstNumOutput05;
    String firstNumOutput06;
    String firstNumOutput07;
    String firstNumOutput08;
    String firstNumOutput09;

    int secondNumNum00;
    int secondNumNum01;
    int secondNumNum02;
    int secondNumNum03;
    int secondNumNum04;
    int secondNumNum05;
    int secondNumNum06;
    int secondNumNum07;
    int secondNumNum08;
    int secondNumNum09;

    String secondNumOutput00;
    String secondNumOutput01;
    String secondNumOutput02;
    String secondNumOutput03;
    String secondNumOutput04;
    String secondNumOutput05;
    String secondNumOutput06;
    String secondNumOutput07;
    String secondNumOutput08;
    String secondNumOutput09;

    String decimalPoint00;
    String decimalPoint01;




    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firstNumOutput = (TextView)findViewById(R.id.firstNumOutput);

        secondNumOutput = (TextView)findViewById(R.id.secondNumOutput);
        secondNumOutput.setOnClickListener(this);

        finalOutput = (TextView)findViewById(R.id.finalOutput);
        finalOutput.setOnClickListener(this);

        ImageView num10 = (ImageView)findViewById(R.id.num10);
        num10.setOnClickListener(this);

        ImageView num11 = (ImageView)findViewById(R.id.num11);
        num11.setOnClickListener(this);


        ImageView num12 = (ImageView)findViewById(R.id.num12);
        num12.setOnClickListener(this);

        ImageView num13 = (ImageView)findViewById(R.id.num13);
        num13.setOnClickListener(this);

        ImageView num14 = (ImageView)findViewById(R.id.num14);
        num14.setOnClickListener(this);

        ImageView num15 = (ImageView)findViewById(R.id.num15);
        num15.setOnClickListener(this);

        ImageView num16 = (ImageView)findViewById(R.id.num16);
        num16.setOnClickListener(this);

        ImageView num17 = (ImageView)findViewById(R.id.num17);
        num17.setOnClickListener(this);

        ImageView num18 = (ImageView)findViewById(R.id.num18);
        num18.setOnClickListener(this);

        ImageView num19 = (ImageView)findViewById(R.id.num19);
        num19.setOnClickListener(this);

        ImageView num20 = (ImageView)findViewById(R.id.num20);
        num20.setOnClickListener(this);

        ImageView num21 = (ImageView)findViewById(R.id.num21);
        num21.setOnClickListener(this);

        ImageView num22 = (ImageView)findViewById(R.id.num22);
        num22.setOnClickListener(this);

        ImageView num23 = (ImageView)findViewById(R.id.num23);
        num23.setOnClickListener(this);

        ImageView num24 = (ImageView)findViewById(R.id.num24);
        num24.setOnClickListener(this);

        ImageView num25 = (ImageView)findViewById(R.id.num25);
        num25.setOnClickListener(this);

        ImageView num26 = (ImageView)findViewById(R.id.num26);
        num26.setOnClickListener(this);

        ImageView num27 = (ImageView)findViewById(R.id.num27);
        num27.setOnClickListener(this);

        ImageView num28 = (ImageView)findViewById(R.id.num28);
        num28.setOnClickListener(this);

        ImageView num29 = (ImageView)findViewById(R.id.num29);
        num29.setOnClickListener(this);

        ImageView decimalPoint = (ImageView)findViewById(R.id.decimalPoint);
        decimalPoint.setOnClickListener(this);

        ImageView decimalPoint2 = (ImageView)findViewById(R.id.decimalPoint2);
        decimalPoint2.setOnClickListener(this);

         clear = (ImageView)findViewById(R.id.clear);
        clear.setOnClickListener(this);

         addition = (ImageView)findViewById(R.id.addition);
        addition.setOnClickListener(this);

         subtraction = (ImageView)findViewById(R.id.subtract);
        subtraction.setOnClickListener(this);

         division = (ImageView)findViewById(R.id.division);
        division.setOnClickListener(this);

         multiplication = (ImageView)findViewById(R.id.multiplication);
        multiplication.setOnClickListener(this);

        ImageView equals = (ImageView)findViewById(R.id.equals);
        equals.setOnClickListener(this);

    }
    public void onClick(View view)
    {

        if(view.getId() == R.id.num10)
        {
            firstNumNum00 = 0;
            firstNum = 0.0;
            firstNumOutput00 =  "0";
            numString01 = numString01 + firstNumOutput00;
            firstNumOutput.setText(numString01);
        }else if(view.getId() == R.id.num11)
        {
            firstNumNum01 = 1;
            firstNumOutput01 = "1";
            numString01 = numString01 + firstNumOutput01;
            firstNumOutput.setText(numString01);
            firstNum = 1.0;
        }else if(view.getId() == R.id.num12)
        {
            firstNumNum02 = 2;
            firstNum = 2.0;
            firstNumOutput02 = "2";
            numString01 = numString01 + firstNumOutput02;
            firstNumOutput.setText(numString01);
        }else if(view.getId() == R.id.num13)
        {
            firstNumNum03 = 3;
            firstNum = 3.0;
            firstNumOutput03 = "3";
            numString01 = numString01 + firstNumOutput03;
            firstNumOutput.setText(numString01);
        }else if(view.getId() == R.id.num14)
        {
            firstNumNum04 = 4;
            firstNum = 4.0;
            firstNumOutput04 = "4";
            numString01 = numString01 + firstNumOutput04;
            firstNumOutput.setText(numString01);
        }else if(view.getId() == R.id.num15)
        {
            firstNumNum05 = 5;
            firstNum = 5.0;
            firstNumOutput05 = "5";
            numString01 = numString01 + firstNumOutput05;
            firstNumOutput.setText(numString01);
        }else if(view.getId() == R.id.num16)
        {
            firstNumNum06 = 6;
            firstNum = 6.0;
            firstNumOutput06 = "6";
            numString01 = numString01 + firstNumOutput06;
            firstNumOutput.setText(numString01);
        }else if(view.getId() == R.id.num17)
        {
            firstNumNum07 = 7;
            firstNum = 7.0;
            firstNumOutput07 = "7";
            numString01 = numString01 + firstNumOutput07;
            firstNumOutput.setText(numString01);
        }else if(view.getId() == R.id.num18)
        {
            firstNumNum08 = 8;
            firstNum = 8.0;
            firstNumOutput08 = "8";
            numString01 = numString01 + firstNumOutput08;
            firstNumOutput.setText(numString01);
        }else if(view.getId() == R.id.num19)
        {
            firstNumNum09 = 9;
            firstNum = 9.0;
            firstNumOutput09 = "9";
            numString01 = numString01 + firstNumOutput09;
            firstNumOutput.setText(numString01);
        }else if(view.getId() == R.id.decimalPoint) {
            decimalPoint00 = ".";
            numString01 = numString01 + decimalPoint00;
            firstNumOutput.setText(numString01);
        } else if(view.getId() == R.id.num20)
        {
            secondNumNum00 = 0;
            secondNum = 0.0;
            secondNumOutput00 = "0";
            numString02 = numString02 + secondNumOutput00;
            secondNumOutput.setText(numString02);
        }else if(view.getId() == R.id.num21)
        {
            secondNumNum01 = 1;
            secondNum = 1.0;
            secondNumOutput01 = "1";
            numString02 = numString02 + secondNumOutput01;
            secondNumOutput.setText(numString02);
        }else if(view.getId() == R.id.num22)
        {
            secondNumNum02 = 2;
            secondNum = 2.0;
            secondNumOutput02 = "2";
            numString02 = numString02 + secondNumOutput02;
            secondNumOutput.setText(numString02);
        }else if(view.getId() == R.id.num23)
        {
            secondNumNum03 = 3;
            secondNum = 3.0;
            secondNumOutput03 = "3";
            numString02 = numString02 + secondNumOutput03;
            secondNumOutput.setText(numString02);
        }else if(view.getId() == R.id.num24)
        {
            secondNumNum04 = 4;
            secondNum = 4.0;
            secondNumOutput04 = "4";
            numString02 = numString02 + secondNumOutput04;
            secondNumOutput.setText(numString02);
        }else if(view.getId() == R.id.num25)
        {
            secondNumNum05 = 5;
            secondNum = 5.0;
            secondNumOutput05 = "5";
            numString02 = numString02 + secondNumOutput05;
            secondNumOutput.setText(numString02);
        }else if(view.getId() == R.id.num26)
        {
            secondNumNum06 = 6;
            secondNum = 6.0;
            secondNumOutput06 = "6";
            numString02 = numString02 + secondNumOutput06;
            secondNumOutput.setText(numString02);
        }else if(view.getId() == R.id.num27)
        {
            secondNumNum07 = 7;
            secondNum = 7.0;
            secondNumOutput07 = "7";
            numString02 = numString02 + secondNumOutput07;
            secondNumOutput.setText(numString02);
        }else if(view.getId() == R.id.num28)
        {
            secondNumNum08 = 8;
            secondNum = 8.0;
            secondNumOutput08 = "8";
            numString02 = numString02 + secondNumOutput08;
            secondNumOutput.setText(numString02);
        }else if(view.getId() == R.id.num29)
        {
            secondNumNum09 = 9;
            secondNum = 9.0;
            secondNumOutput09 = "9";
            numString02 = numString02 + secondNumOutput09;
            secondNumOutput.setText(numString02);
        }else if(view.getId() == R.id.decimalPoint2) {
            decimalPoint01 = ".";
            numString02 = numString02 + decimalPoint01;
            secondNumOutput.setText(numString02);
        }else if(view.getId() == R.id.addition)
        {
             operator = 0;
            colorSwitch();

        }else if(view.getId() == R.id.subtract)
        {
             operator = 1;
            colorSwitch();

        }else if(view.getId() == R.id.division)
        {
             operator = 2;
            colorSwitch();

        }else if(view.getId() == R.id.multiplication)
        {
             operator = 3;
            colorSwitch();

        }else if(view.getId() == R.id.clear)
        {
             operator = 4;
            colorSwitch();
            calculate();

        }else if(view.getId() == R.id.equals)
        {
            calculate();
            finalOutput.setText(solution + "");


        }

    }
            public void calculate()
            {
                if(operator == 0)
                {
                    solution = Double.parseDouble(numString01) + Double.parseDouble(numString02);
                }else if(operator == 1)
                {
                    solution = Double.parseDouble(numString01) - Double.parseDouble(numString02);
                }else if(operator == 2)
                {
                    solution = Double.parseDouble(numString01) / Double.parseDouble(numString02);
                }else if(secondNum == 0 && operator == 2)
                {
                    finalOutput.setText("ERROR!!");
                }else if(operator == 3)
                {
                    solution = Double.parseDouble(numString01) * Double.parseDouble(numString02);
                }else if(operator == 4)
                {
                    firstNumOutput.setText("");
                    secondNumOutput.setText("");
                    finalOutput.setText("");
                    numString01 = "";
                    numString02 = "";
                }
            }
            public void colorSwitch()
            {
                if(operator == 0)
                {
                    addition.setBackgroundColor(0xffff0000);
                    subtraction.setBackgroundColor(0xffcccccc);
                    division.setBackgroundColor(0xffcccccc);
                    multiplication.setBackgroundColor(0xffcccccc);
                    clear.setBackgroundColor(0xffcccccc);
                }else if(operator == 1)
                {
                    subtraction.setBackgroundColor(0xff00ffff);
                    addition.setBackgroundColor(0xffcccccc);
                    division.setBackgroundColor(0xffcccccc);
                    multiplication.setBackgroundColor(0xffcccccc);
                    clear.setBackgroundColor(0xffcccccc);
                }else if(operator == 2)
                {
                    division.setBackgroundColor(0xff0000ff);
                    multiplication.setBackgroundColor(0xffcccccc);
                    addition.setBackgroundColor(0xffcccccc);
                    subtraction.setBackgroundColor(0xffcccccc);
                    clear.setBackgroundColor(0xffcccccc);
                }else if(operator == 3)
                {
                    multiplication.setBackgroundColor(0xffff00ff);
                    division.setBackgroundColor(0xffcccccc);
                    addition.setBackgroundColor(0xffcccccc);
                    subtraction.setBackgroundColor(0xffcccccc);
                    clear.setBackgroundColor(0xffcccccc);
                }else if(operator == 4)
                {
                    clear.setBackgroundColor(0xff00ff00);
                    multiplication.setBackgroundColor(0xffcccccc);
                    division.setBackgroundColor(0xffcccccc);
                    addition.setBackgroundColor(0xffcccccc);
                    subtraction.setBackgroundColor(0xffcccccc);
                }

            }



}
