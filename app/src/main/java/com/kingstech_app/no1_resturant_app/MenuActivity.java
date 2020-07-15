package com.kingstech_app.no1_resturant_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    Button allBTN, bfBTN, lunBTN, dinBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        allBTN = (Button) findViewById(R.id.allBTN);
        bfBTN = (Button) findViewById(R.id.bfBTN);
        lunBTN = (Button) findViewById(R.id.lunBTN);
        dinBTN = (Button) findViewById(R.id.dinBTN);

        allBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lunBTN.setTextColor(getResources().getColor(R.color.white));
                dinBTN.setTextColor(getResources().getColor(R.color.white));
                bfBTN.setTextColor(getResources().getColor(R.color.white));
                allBTN.setTextColor(getResources().getColor(R.color.green));
            }
        });
        bfBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                allBTN.setTextColor(getResources().getColor(R.color.white));
                lunBTN.setTextColor(getResources().getColor(R.color.white));
                dinBTN.setTextColor(getResources().getColor(R.color.white));
                bfBTN.setTextColor(getResources().getColor(R.color.green));
            }
        });
        lunBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                allBTN.setTextColor(getResources().getColor(R.color.white));
                dinBTN.setTextColor(getResources().getColor(R.color.white));
                bfBTN.setTextColor(getResources().getColor(R.color.white));
                lunBTN.setTextColor(getResources().getColor(R.color.green));
            }
        });
        dinBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                allBTN.setTextColor(getResources().getColor(R.color.white));
                bfBTN.setTextColor(getResources().getColor(R.color.white));
                lunBTN.setTextColor(getResources().getColor(R.color.white));
                dinBTN.setTextColor(getResources().getColor(R.color.green));
            }
        });
    }
}