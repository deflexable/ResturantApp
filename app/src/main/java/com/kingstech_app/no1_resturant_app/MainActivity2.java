package com.kingstech_app.no1_resturant_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText emailET, passwordET;
    Button fbBTN, ggBTN, ttBTN, signInBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        emailET = (EditText) findViewById(R.id.emailET);
        passwordET = (EditText) findViewById(R.id.passwordET);
        signInBTN = (Button) findViewById(R.id.signupBTN);
        fbBTN = (Button) findViewById(R.id.fbBTN);
        ggBTN = (Button) findViewById(R.id.ggBTN);
        ttBTN = (Button) findViewById(R.id.ttBTN);

        emailET.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                passwordET.setBackgroundResource(R.drawable.edit_text_one);
                emailET.setBackgroundResource(R.drawable.edittexttwo);
                return false;
            }
        });

        passwordET.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                emailET.setBackgroundResource(R.drawable.edit_text_one);
                passwordET.setBackgroundResource(R.drawable.edittexttwo);
                return false;
            }
        });
    }
}