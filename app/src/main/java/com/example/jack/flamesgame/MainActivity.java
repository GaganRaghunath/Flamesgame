package com.example.jack.flamesgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText first;
    EditText second;
    ImageButton chk;
    TextView tans,tquotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = (EditText) findViewById(R.id.et1);
        second = (EditText) findViewById(R.id.et2);
        chk = (ImageButton) findViewById(R.id.btn);
        tans = (TextView) findViewById(R.id.tvans);
        tquotes=(TextView) findViewById(R.id.tvquotes);

        chk.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String s1=first.getText().toString();
        String s2=second.getText().toString();

        StringBuilder sb1=new StringBuilder(s1);
        StringBuilder sb2=new StringBuilder(s2);
        int a = s1.length();
        int b = s2.length();
        char fl1='f';
        char fl2='l';
        char fl3='a';
        char fl4='m';
        char fl5='e';
        char fl6='s';

        switch (v.getId()) {

            case R.id.btn:
                int j,k,i;
                for (i = 0; i < a; i++) {
                    char c = sb1.charAt(i);

                    for (j = 0; j < b; j++) {
                        char d = sb2.charAt(j);
                        if (c == d) {
                            sb1.deleteCharAt(i);
                            sb2.deleteCharAt(j);
                            a=sb1.length();
                            b=sb2.length();
                            i = 0;
                            break;
                        }
                    }
                }

                int n = (a + b);
                StringBuilder s3 = new StringBuilder("flames");

                j=0;

                for (i = 0; i < 5; i++)
                {
                    k=0;
                    int fl = s3.length();
                        while(j<=fl) {
                        k++;
                        if(j==fl)
                        {
                            j=0;
                        }
                        if (k == n)
                        {
                            s3.deleteCharAt(j);
                            break;
                        }
                        j++;
                    }
                }

                if (s3.charAt(0) == fl1) {
                    tans.setText(R.string.name1);
                    tquotes.setText(R.string.quote1);
                } else if (s3.charAt(0) == fl2) {
                    tans.setText(R.string.name2);
                    tquotes.setText(R.string.quote2);
                } else if (s3.charAt(0) == fl3) {
                    tans.setText(R.string.name3);
                    tquotes.setText(R.string.quote3);
                } else if (s3.charAt(0) == fl4) {
                    tans.setText(R.string.name4);
                    tquotes.setText(R.string.quote4);
                } else if (s3.charAt(0) == fl5) {
                    tans.setText(R.string.name5);
                    tquotes.setText(R.string.quote5);
                } else if (s3.charAt(0) == fl6) {
                    tans.setText(R.string.name6);
                    tquotes.setText(R.string.quote6);
                    break;

                }
        }

    }
}