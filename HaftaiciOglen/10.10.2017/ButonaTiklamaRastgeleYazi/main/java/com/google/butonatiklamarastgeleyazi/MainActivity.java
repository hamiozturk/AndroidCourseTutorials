package com.google.butonatiklamarastgeleyazi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] dizi = {"Android","iOS","Windows","Linux"};
    Button btn;
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        text = (TextView)findViewById(R.id.textView);
        btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                int sayi = rnd.nextInt(dizi.length);
                text.setText(""+dizi[sayi]);
            }
        });

    }
}
