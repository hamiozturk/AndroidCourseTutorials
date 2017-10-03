package com.google.androidlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Log","onCreate ile Activity oluşturulma zamanı çalıştı");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Log","onStart metodu çalıştı");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Log","onStop metodu çalıştı");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Log","onResume metodu çalıştı");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Log","onRestart metodu çalıştı");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Log","onDestroy metodu çalıştı");
    }
}
