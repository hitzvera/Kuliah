package com.pam.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public int textCounter = 0;
    Button btn, reset;
    TextView showNum;
    TextView paragraph3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        paragraph3 = findViewById(R.id.paragraph3);
        paragraph3.setText("Kalo semua saya kaan menjadikan sebuah ");

        btn = (Button) findViewById(R.id.button);
        reset = (Button) findViewById(R.id.resetButton);
        showNum = (TextView) findViewById(R.id.showNum);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCounter++;
                showNum.setText(Integer.toString(textCounter));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textCounter = 0;
                showNum.setText(Integer.toString(textCounter));
            }
        });
    }
}