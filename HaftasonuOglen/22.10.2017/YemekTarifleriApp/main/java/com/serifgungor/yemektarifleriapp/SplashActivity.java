package com.serifgungor.yemektarifleriapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;

import java.util.Random;

public class SplashActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        String[] dizi = {"splash_01","splash_02","splash_03","splash_04","splash_05"};
        Random rnd = new Random();

        int refId = getApplicationContext().getResources().getIdentifier(
                dizi[rnd.nextInt(dizi.length)],"drawable",getApplicationContext().getPackageName()
        );

        imageView = (ImageView)findViewById(R.id.ivSplash);
        imageView.setImageResource(refId);


        Thread thread = new Thread(){
            @Override
            public void run() {
               try{
                   Thread.sleep(5000);
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
