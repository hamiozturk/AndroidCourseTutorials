package com.google.aramasmsemailornegi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public void intentGecis(View v){
        if (v.getId() == R.id.btnArama){
            startActivity(new Intent(MainActivity.this,AramaActivity.class));
        }else if(v.getId() == R.id.btnSms){
            //startActivity(new Intent(MainActivity.this,SmsActivity.class));
        }else if(v.getId() == R.id.btnEmail){
            //startActivity(new Intent(MainActivity.this,EmailActivity.class));
        }else if(v.getId() == R.id.btnRehber){
            startActivity(new Intent(MainActivity.this,RehberActivity.class));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
