package com.example.palmdigital.steamdemo02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LowerCase extends AppCompatActivity implements View.OnClickListener
{
    String name = "";
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lower_case);

        display = (TextView)findViewById(R.id.display);


        Button a = (Button)findViewById(R.id.a);
        a.setOnClickListener(this);

        Button b = (Button)findViewById(R.id.b);
        b.setOnClickListener(this);

        Button c = (Button)findViewById(R.id.c);
        c.setOnClickListener(this);

        Button d = (Button)findViewById(R.id.d);
        d.setOnClickListener(this);

        Button e = (Button)findViewById(R.id.e);
        e.setOnClickListener(this);

        Button f = (Button)findViewById(R.id.f);
        f.setOnClickListener(this);

        Button g = (Button)findViewById(R.id.g);
        g.setOnClickListener(this);

        Button h = (Button)findViewById(R.id.h);
        h.setOnClickListener(this);

        Button i = (Button)findViewById(R.id.i);
        i.setOnClickListener(this);

        Button j = (Button)findViewById(R.id.j);
        j.setOnClickListener(this);

        Button k = (Button)findViewById(R.id.k);
        k.setOnClickListener(this);

        Button l = (Button)findViewById(R.id.l);
        l.setOnClickListener(this);

        Button m = (Button)findViewById(R.id.m);
        m.setOnClickListener(this);

        Button n = (Button)findViewById(R.id.n);
        n.setOnClickListener(this);

        Button o = (Button)findViewById(R.id.o);
        o.setOnClickListener(this);

        Button p = (Button)findViewById(R.id.p);
        p.setOnClickListener(this);

        Button q = (Button)findViewById(R.id.q);
        q.setOnClickListener(this);

        Button r = (Button)findViewById(R.id.r);
        r.setOnClickListener(this);

        Button s = (Button)findViewById(R.id.s);
        s.setOnClickListener(this);

        Button t = (Button)findViewById(R.id.t);
        t.setOnClickListener(this);

        Button u = (Button)findViewById(R.id.u);
        u.setOnClickListener(this);

        Button v = (Button)findViewById(R.id.v);
        v.setOnClickListener(this);

        Button w = (Button)findViewById(R.id.w);
        w.setOnClickListener(this);

        Button x = (Button)findViewById(R.id.x);
        x.setOnClickListener(this);

        Button y = (Button)findViewById(R.id.y);
        y.setOnClickListener(this);

        Button z = (Button)findViewById(R.id.z);
        z.setOnClickListener(this);

        Button clear = (Button)findViewById(R.id.clear);
        clear.setOnClickListener(this);

        Button space = (Button)findViewById(R.id.space);
        space.setOnClickListener(this);

        Button changeCase = (Button)findViewById(R.id.changeCase);
        changeCase.setOnClickListener(this);
    }
    public void onClick(View view)
    {
        if(view.getId() == R.id.a)
        {
            name = name + "a";
            display.setText(name);
        }else if(view.getId() ==R.id.b)
        {
            name = name + "b";
            display.setText(name);
        }else if(view.getId() == R.id.c)
        {
            name = name + "c";
            display.setText(name);
        }else if(view.getId() == R.id.d)
        {
            name = name + "d";
            display.setText(name);
        }else if(view.getId() == R.id.e)
        {
            name = name + "e";
            display.setText(name);
        }else if(view.getId() == R.id.f)
        {
            name = name + "f";
            display.setText(name);
        }else if(view.getId() == R.id.g)
        {
            name = name + "g";
            display.setText(name);
        }else if(view.getId() == R.id.h)
        {
            name = name + "h";
            display.setText(name);
        }else if(view.getId() == R.id.i)
        {
            name = name + "i";
            display.setText(name);
        }else if(view.getId() == R.id.j)
        {
            name = name + "j";
            display.setText(name);
        }else if(view.getId() == R.id.k)
        {
            name = name + "k";
            display.setText(name);
        }else if(view.getId() == R.id.l)
        {
            name = name + "l";
            display.setText(name);
        }else if(view.getId() == R.id.m)
        {
            name = name + "m";
            display.setText(name);
        }else if(view.getId() == R.id.n)
        {
            name = name + "n";
            display.setText(name);
        }else if(view.getId() == R.id.o)
        {
            name = name + "o";
            display.setText(name);
        }else if(view.getId() == R.id.p)
        {
            name = name + "p";
            display.setText(name);
        }else if(view.getId() == R.id.q)
        {
            name = name + "q";
            display.setText(name);
        }else if(view.getId() == R.id.r)
        {
            name = name + "r";
            display.setText(name);
        }else if(view.getId() == R.id.s)
        {
            name = name + "r";
            display.setText(name);
        }else if(view.getId() == R.id.t)
        {
            name = name + "t";
            display.setText(name);
        }else if(view.getId() == R.id.u)
        {
            name = name + "t";
            display.setText(name);
        }else if(view.getId() == R.id.v)
        {
            name = name + "v";
            display.setText(name);
        }else if(view.getId() == R.id.w)
        {
            name = name + "w";
            display.setText(name);
        }else if(view.getId() == R.id.x)
        {
            name = name + "x";
            display.setText(name);
        }else if(view.getId() == R.id.y)
        {
            name = name + "y";
            display.setText(name);
        }else if(view.getId() == R.id.z)
        {
            name = name + "z";
            display.setText(name);
        }else if(view.getId() == R.id.period)
        {
            name = name + ".";
            display.setText(name);
        } else if(view.getId() == R.id.comma)
        {
            name = name + ",";
            display.setText(name);
        }else if(view.getId() == R.id.space)
        {
            name = name + " ";
            display.setText(name);
        }else if(view.getId() == R.id.clear)
        {
            name = "";
            display.setText("");
        }else if(view.getId() == R.id.changeCase)
        {
            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        }
    }

}
