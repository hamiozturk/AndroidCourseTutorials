package com.google.karsilamaekraniornegi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    private static int SLEEP_TIME = 5;

    private class IntentLauncher extends Thread{
        @Override
        public void run() {
            try{
                Thread.sleep(SLEEP_TIME*1000);
            }catch (Exception e){

            }
            Intent i = new Intent(SplashActivity.this,MainActivity.class);
            startActivity(i);
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        setContentView(R.layout.activity_splash);
        IntentLauncher launcher = new IntentLauncher();
        launcher.start();

    }
}
