package com.google.explicitactivity;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,OrnekActivity.class));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Intent i = new Intent();

                    String paket = "com.google.implicitactivityornegi";
                    String cls = "com.google.implicitactivityornegi.TextShareActivity";

                    i.setComponent(new ComponentName(paket,cls));
                    startActivity(i);
                }catch (ActivityNotFoundException e){
                    Log.e("Hata","Uygulama yüklü değil yada ilgili Activity bulunamadı");
                }
            }
        });

    }
}
