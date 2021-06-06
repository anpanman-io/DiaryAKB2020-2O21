package com.example.a10118390_baru;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


//04-06-2021 - 10118390 - Mario Gonzaga Muharjani - IF-9

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run () {

                Intent MainIntent =new Intent(SplashScreen.this, MainActivity.class);

                startActivity(MainIntent);
                finish();
            }

        }, 2000);

    }
}