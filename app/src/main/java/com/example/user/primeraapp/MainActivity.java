package com.example.user.primeraapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView txt1,txt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);

        findViewById(R.id.txt1).setOnClickListener(this);
        findViewById(R.id.txt2).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.txt1:
                if(txt1.getVisibility() == View.VISIBLE)
                {
                    txt1.setVisibility(View.VISIBLE);
                    txt2.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.txt2:
                if(txt2.getVisibility() == View.VISIBLE)
                {
                    txt1.setVisibility(View.INVISIBLE);
                    txt2.setVisibility(View.VISIBLE);
                }
                break;

        }

    }
}
