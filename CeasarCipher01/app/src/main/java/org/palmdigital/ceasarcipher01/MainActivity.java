package org.palmdigital.ceasarcipher01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    String output = "Your encrypted string: ";
    String output02 = "Your decrypted string is: ";
    TextView outputTV;
    TextView outputTV02;
    int shift;
    int deShift;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outputTV = (TextView)findViewById(R.id.encryptTV);
        outputTV02 = (TextView)findViewById(R.id.decryptTV);

        outputTV.setText(output);
        outputTV02.setText(output02);

    }
    public void encrypt(View view)
    {
        char[] alphabet = new char[26];
        alphabet[0] = 'A';
        alphabet[1] = 'B';
        alphabet[2] = 'C';
        alphabet[3] = 'D';
        alphabet[4] = 'E';
        alphabet[5] = 'F';
        alphabet[6] = 'G';
        alphabet[7] = 'H';
        alphabet[8] = 'I';
        alphabet[9] = 'J';
        alphabet[10] = 'K';
        alphabet[11] = 'L';
        alphabet[12] = 'M';
        alphabet[13] = 'N';
        alphabet[14] = 'O';
        alphabet[15] = 'P';
        alphabet[16] = 'Q';
        alphabet[17] = 'R';
        alphabet[18] = 'S';
        alphabet[19] = 'T';
        alphabet[20] = 'U';
        alphabet[21] = 'V';
        alphabet[22] = 'W';
        alphabet[23] = 'X';
        alphabet[24] = 'Y';
        alphabet[25] = 'Z';

        int shiftCharIndex;
        int fixedCharIndex;
        EditText messageET = (EditText)findViewById(R.id.messageET);
        EditText shiftET = (EditText)findViewById(R.id.shiftET);
        String str_shift = shiftET.getText().toString();
        String input = messageET.getText().toString();
        int shift;
        if(str_shift.isEmpty())
        {
            shift = 1;
            Toast.makeText(this, "Your shift was set to one. Change if desired.", Toast.LENGTH_SHORT).show();
        }
        else
        {
            shift = Integer.parseInt(str_shift);
        }

        for (int i = 0; i < input.length(); i++)
        {
            for (int j = 0; j < alphabet.length; j++)
            {
                if (input.charAt(i) == alphabet[j])
                {
                    shiftCharIndex = j + shift;
                    fixedCharIndex = shiftCharIndex % 26;
                    output = output + alphabet[fixedCharIndex];
                } // end of if statement
            } // end of inner loop
            if (input.charAt(i) == ' ')
            {
                output += " ";
            }
        } // end of outer for loop
        outputTV.setText(output);
    }
    public void decrypt(View v)
    {
        char[] alphabet02 = new char[26];
        alphabet02[0] = 'A';
        alphabet02[1] = 'B';
        alphabet02[2] = 'C';
        alphabet02[3] = 'D';
        alphabet02[4] = 'E';
        alphabet02[5] = 'F';
        alphabet02[6] = 'G';
        alphabet02[7] = 'H';
        alphabet02[8] = 'I';
        alphabet02[9] = 'J';
        alphabet02[10] = 'K';
        alphabet02[11] = 'L';
        alphabet02[12] = 'M';
        alphabet02[13] = 'N';
        alphabet02[14] = 'O';
        alphabet02[15] = 'P';
        alphabet02[16] = 'Q';
        alphabet02[17] = 'R';
        alphabet02[18] = 'S';
        alphabet02[19] = 'T';
        alphabet02[20] = 'U';
        alphabet02[21] = 'V';
        alphabet02[22] = 'W';
        alphabet02[23] = 'X';
        alphabet02[24] = 'Y';
        alphabet02[25] = 'Z';

        int shiftCharIndex02;
        int fixedCharIndex02;
        EditText messageET = (EditText)findViewById(R.id.messageET);
        EditText shiftET = (EditText)findViewById(R.id.shiftET);
        String str_shift = shiftET.getText().toString();
        String input = messageET.getText().toString();
        if(str_shift.isEmpty())
        {
            shift = 1;
            Toast.makeText(this, "Your shift was set to one. Change if desired.", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
           shift = Integer.parseInt(str_shift);
            deShift = 26 - shift;
            for (int i = 0; i < input.length(); i++)
            {
                for (int j = 0; j < alphabet02.length; j++)
                {
                    if (input.charAt(i) == alphabet02[j])
                    {
                        shiftCharIndex02 = j + deShift;
                        fixedCharIndex02 = shiftCharIndex02 % 26;
                        output02 = output02 + alphabet02[fixedCharIndex02];
                    } // end of if statement
                } // end of inner loop
                if (input.charAt(i) == ' ')
                {
                    output02 += " ";
                }
            } // end of outer for loop
            outputTV02.setText(output02);
        }
    }
    
    public void clear(View c)
    {
        output = "Your encrypted string: ";
        outputTV.setText(output);
        output02 = "Your decrypted string is: ";
        outputTV02.setText(output02);
    }
}
