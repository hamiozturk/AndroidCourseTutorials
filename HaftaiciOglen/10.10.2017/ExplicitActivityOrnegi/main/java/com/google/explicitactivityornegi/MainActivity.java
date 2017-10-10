package com.google.explicitactivityornegi;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Intent i = new Intent();
                    String paket = "com.google.implicitactivityornegi";
                    String cls = "com.google.implicitactivityornegi.ImageShareActivity";
                    i.setComponent(new ComponentName(paket,cls));
                    startActivity(i);
                }catch (ActivityNotFoundException e){
                    Log.d("Uyarı","Activity bulunamadı");
                }


            }
        });
    }
}
