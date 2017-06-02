package com.example.palmdigital.steamdemo06;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    String name = "";
    TextView display;
    String a = "A";
    String b = "B";
    String c = "C";
    String d = "D";
    String e = "E";
    String f = "F";
    String g = "G";
    String h = "H";
    String i = "I";
    String j = "J";
    String k = "K";
    String l = "L";
    String m = "M";
    String n = "N";
    String o = "O";
    String p = "P";
    String q = "Q";
    String r = "R";
    String s = "S";
    String t = "T";
    String u = "U";
    String v = "V";
    String w = "W";
    String x = "X";
    String y = "Y";
    String z = "Z";

    Button ba;
    Button bb;
    Button bc;
    Button bd;
    Button be;
    Button bf;
    Button bg;
    Button bh;
    Button bi;
    Button bj;
    Button bk;
    Button bl;
    Button bm;
    Button bn;
    Button bo;
    Button bp;
    Button bq;
    Button br;
    Button bs;
    Button bt;
    Button bu;
    Button bv;
    Button bw;
    Button bx;
    Button by;
    Button bz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView)findViewById(R.id.display);


        ba = (Button)findViewById(R.id.a);
        ba.setOnClickListener(this);

        bb = (Button)findViewById(R.id.b);
        bb.setOnClickListener(this);

        bc = (Button)findViewById(R.id.c);
        bc.setOnClickListener(this);

        bd = (Button)findViewById(R.id.d);
        bd.setOnClickListener(this);

        be = (Button)findViewById(R.id.e);
        be.setOnClickListener(this);

        bf = (Button)findViewById(R.id.f);
        bf.setOnClickListener(this);

        bg = (Button)findViewById(R.id.g);
        bg.setOnClickListener(this);

        bh = (Button)findViewById(R.id.h);
        bh.setOnClickListener(this);

        bi = (Button)findViewById(R.id.i);
        bi.setOnClickListener(this);

        bj = (Button)findViewById(R.id.j);
        bj.setOnClickListener(this);

        bk = (Button)findViewById(R.id.k);
        bk.setOnClickListener(this);

        bl = (Button)findViewById(R.id.l);
        bl.setOnClickListener(this);

        bm = (Button)findViewById(R.id.m);
        bm.setOnClickListener(this);

        bn = (Button)findViewById(R.id.n);
        bn.setOnClickListener(this);

        bo = (Button)findViewById(R.id.o);
        bo.setOnClickListener(this);

        bp = (Button)findViewById(R.id.p);
        bp.setOnClickListener(this);

        bq = (Button)findViewById(R.id.q);
        bq.setOnClickListener(this);

        br = (Button)findViewById(R.id.r);
        br.setOnClickListener(this);

        bs = (Button)findViewById(R.id.s);
        bs.setOnClickListener(this);

        bt = (Button)findViewById(R.id.t);
        bt.setOnClickListener(this);

        bu = (Button)findViewById(R.id.u);
        bu.setOnClickListener(this);

        bv = (Button)findViewById(R.id.v);
        bv.setOnClickListener(this);

        bw = (Button)findViewById(R.id.w);
        bw.setOnClickListener(this);

        bx = (Button)findViewById(R.id.x);
        bx.setOnClickListener(this);

        by = (Button)findViewById(R.id.y);
        by.setOnClickListener(this);

        bz = (Button)findViewById(R.id.z);
        bz.setOnClickListener(this);

        Button period = (Button)findViewById(R.id.period);
        period.setOnClickListener(this);

        Button comma = (Button)findViewById(R.id.comma);
        comma.setOnClickListener(this);

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
            name = name + a;
            display.setText(name);
        }else if(view.getId() ==R.id.b)
        {
            name = name + b;
            display.setText(name);
        }else if(view.getId() == R.id.c)
        {
            name = name + c;
            display.setText(name);
        }else if(view.getId() == R.id.d)
        {
            name = name + d;
            display.setText(name);
        }else if(view.getId() == R.id.e)
        {
            name = name + e;
            display.setText(name);
        }else if(view.getId() == R.id.f)
        {
            name = name + f;
            display.setText(name);
        }else if(view.getId() == R.id.g)
        {
            name = name + g;
            display.setText(name);
        }else if(view.getId() == R.id.h)
        {
            name = name + h;
            display.setText(name);
        }else if(view.getId() == R.id.i)
        {
            name = name + i;
            display.setText(name);
        }else if(view.getId() == R.id.j)
        {
            name = name + j;
            display.setText(name);
        }else if(view.getId() == R.id.k)
        {
            name = name + k;
            display.setText(name);
        }else if(view.getId() == R.id.l)
        {
            name = name + l;
            display.setText(name);
        }else if(view.getId() == R.id.m)
        {
            name = name + m;
            display.setText(name);
        }else if(view.getId() == R.id.n)
        {
            name = name + n;
            display.setText(name);
        }else if(view.getId() == R.id.o)
        {
            name = name + o;
            display.setText(name);
        }else if(view.getId() == R.id.p)
        {
            name = name + p;
            display.setText(name);
        }else if(view.getId() == R.id.q)
        {
            name = name + q;
            display.setText(name);
        }else if(view.getId() == R.id.r)
        {
            name = name + r;
            display.setText(name);
        }else if(view.getId() == R.id.s)
        {
            name = name + s;
            display.setText(name);
        }else if(view.getId() == R.id.t)
        {
            name = name + t;
            display.setText(name);
        }else if(view.getId() == R.id.u)
        {
            name = name + u;
            display.setText(name);
        }else if(view.getId() == R.id.v)
        {
            name = name + v;
            display.setText(name);
        }else if(view.getId() == R.id.w)
        {
            name = name + w;
            display.setText(name);
        }else if(view.getId() == R.id.x)
        {
            name = name + x;
            display.setText(name);
        }else if(view.getId() == R.id.y)
        {
            name = name + y;
            display.setText(name);
        }else if(view.getId() == R.id.z)
        {
            name = name + z;
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


        }
    }

}
