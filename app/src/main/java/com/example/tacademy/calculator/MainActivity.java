package com.example.tacademy.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView res;
    Button a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        res = (TextView) findViewById(R.id.result);
        a = (Button) findViewById(R.id.a);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "1");
            }
        });

        a = (Button) findViewById(R.id.b);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "2");
            }
        });
        a = (Button) findViewById(R.id.c);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "3");
            }
        });
        a = (Button) findViewById(R.id.d);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "4");
            }
        });
        a = (Button) findViewById(R.id.e);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "5");
            }
        });
        a = (Button) findViewById(R.id.f);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "6");
            }
        });
        a = (Button) findViewById(R.id.g);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "7");
            }
        });
        a = (Button) findViewById(R.id.h);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "8");
            }
        });
        a = (Button) findViewById(R.id.i);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "9");
            }
        });
        a = (Button) findViewById(R.id.j);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(" ");

            }
        });
        a = (Button) findViewById(R.id.k);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "0");
            }
        });
        a = (Button) findViewById(R.id.l);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "=");
            }
        });
        a = (Button) findViewById(R.id.m);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "+");
            }
        });
        a = (Button) findViewById(R.id.n);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "-");
            }
        });
        a = (Button) findViewById(R.id.o);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                res.setText(res.getText() + "*");
            }
        });


    }
}
