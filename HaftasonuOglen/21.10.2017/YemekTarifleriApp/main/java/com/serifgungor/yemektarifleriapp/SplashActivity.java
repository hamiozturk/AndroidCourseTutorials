package com.serifgungor.yemektarifleriapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Thread thread = new Thread(){
            @Override
            public void run() {
               try{
                   Thread.sleep(3000);
               }catch (Exception e){
                    e.printStackTrace();
               }finally {
                   startActivity(new Intent(SplashActivity.this,MainActivity.class));
                   finish();
               }
            }
        };
        thread.start();



    }
}