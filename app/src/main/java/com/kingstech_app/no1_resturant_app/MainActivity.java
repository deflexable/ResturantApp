package com.kingstech_app.no1_resturant_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    TextView logoName;
    LinearLayout secondLayout, fingerLayout;
    int SPLASH_TIME = 3000; //This is 3 seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView) findViewById(R.id.logo);
        logoName = (TextView) findViewById(R.id.logoText);
        secondLayout = (LinearLayout) findViewById(R.id.secondLayout);
        fingerLayout = (LinearLayout) findViewById(R.id.finger);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Do any action here. Now we are moving to next page
                // Gets linearlayout
                LinearLayout layout = findViewById(R.id.logoLayout);
                // Gets the layout params that will allow you to resize the layout
                ViewGroup.LayoutParams params = layout.getLayoutParams();
                params.height = params.WRAP_CONTENT;
                params.width = params.WRAP_CONTENT;
                logoName.setVisibility(View.GONE);
                logo.setImageResource(R.drawable.biglogo);
                layout.setPadding(0,460,0,0);
                secondLayout.setVisibility(View.VISIBLE);
                fingerLayout.setVisibility(View.VISIBLE);
                layout.setLayoutParams(params);



            }
        }, SPLASH_TIME);
    }


}
