package com.google.activityyasamdongusu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Log","onCreate metodu çalıştı");

    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Log","onStart metodu çalıştı");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Log","onStop metodu çalıştı");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Log","onDestroy metodu çalıştı (Activity kapatıldı)");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Log","onPause metodu çalıştı (Proje alta alındı)");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Log","onResume metodu çalıştı");
    }
}
