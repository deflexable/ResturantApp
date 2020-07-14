package com.kingstech_app.no1_resturant_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView logo,logotwo;
    TextView logoName;
    Button login, register;
    Animation logoAnimation,logoAnimationone, nameanimation,zoomback;
    LinearLayout secondLayout, firstLayout;
    int SPLASH_TIME = 5000; //This is 3 seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView) findViewById(R.id.logo);
        logotwo = (ImageView) findViewById(R.id.logone);
        logoName = (TextView) findViewById(R.id.logoText);
        secondLayout = (LinearLayout) findViewById(R.id.secondLayout);
        firstLayout = (LinearLayout) findViewById(R.id.logoLayout);
        login = (Button) findViewById(R.id.loginBTN);
        register = (Button) findViewById(R.id.registerBTN);
        Context context;
        logoAnimation = AnimationUtils.loadAnimation(this,R.anim.zoomin );
        logoAnimationone = AnimationUtils.loadAnimation(this,R.anim.logoone );
        nameanimation = AnimationUtils.loadAnimation(this,R.anim.fadein );
        zoomback = AnimationUtils.loadAnimation(this,R.anim.zoomback );
        //zoomin = AnimationUtils.loadAnimation(this,R.anim.fadein );
        logoName.setAnimation(nameanimation);
         logo.setAnimation(nameanimation);
        new Handler().postDelayed(new Runnable() {
            @RequiresApi(api = Build.VERSION_CODES.P)
            @Override
            public void run() {
                //Do any action here. Now we are moving to next page


          firstLayout.setVisibility(View.GONE);
          logotwo.setAnimation(logoAnimation);
          login.setAnimation(nameanimation);
          secondLayout.setVisibility(View.VISIBLE);

            }
        }, SPLASH_TIME);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(intent);
            }
        });


    }


}
