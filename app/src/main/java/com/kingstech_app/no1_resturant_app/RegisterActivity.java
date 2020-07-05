package com.kingstech_app.no1_resturant_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class RegisterActivity extends AppCompatActivity {

    EditText emailET, nameET, passwordET;
    Button signUpBTN;
    ImageButton fbBTN, ggBTN, ttBTN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        emailET = (EditText) findViewById(R.id.emailET);
        nameET = (EditText) findViewById(R.id.nameET);
        passwordET = (EditText) findViewById(R.id.passwordET);
        signUpBTN = (Button) findViewById(R.id.signupBTN);
        fbBTN = (ImageButton) findViewById(R.id.fbBTN);
        ggBTN = (ImageButton) findViewById(R.id.ggBTN);
        ttBTN = (ImageButton) findViewById(R.id.ttBTN);

        emailET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameET.setBackgroundResource(R.drawable.edit_text_one);
                passwordET.setBackgroundResource(R.drawable.edit_text_one);
                emailET.setBackgroundResource(R.drawable.edittexttwo);
            }
        });
        nameET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailET.setBackgroundResource(R.drawable.edit_text_one);
                passwordET.setBackgroundResource(R.drawable.edit_text_one);
                nameET.setBackgroundResource(R.drawable.edittexttwo);
            }
        });
        passwordET.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                emailET.setBackgroundResource(R.drawable.edit_text_one);
                nameET.setBackgroundResource(R.drawable.edit_text_one);
                passwordET.setBackgroundResource(R.drawable.edittexttwo);
            }
        });
    }
}