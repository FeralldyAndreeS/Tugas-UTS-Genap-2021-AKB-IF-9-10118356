package com.example.uts_10118356;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;


//05-06-2021 - 10118356 - Feralldy Andree Sapoetra - IF-9

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getSupportActionBar().hide();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run () {

                Intent MainIntent =new Intent(SplashScreen.this, com.example.uts_10118356.MainActivity.class);

                startActivity(MainIntent);
                finish();
            }

        }, 2000);

    }
}

//05-06-2021 - 10118356 - Feralldy Andree Sapoetra - IF-9