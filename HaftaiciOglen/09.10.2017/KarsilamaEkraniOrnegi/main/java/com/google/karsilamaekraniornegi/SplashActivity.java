package com.google.karsilamaekraniornegi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread karsilama = new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                }catch (Exception e){
                    e.getMessage();
                }finally {
                    Intent i = new Intent(SplashActivity.this,MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        };
        karsilama.start();





    }
}
