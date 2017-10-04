package com.google.sayfalararasigecis_veriaktarimi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText etAd,etSoyad;
    Button btnGecis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAd = (EditText)findViewById(R.id.etAd);
        etSoyad = (EditText)findViewById(R.id.etSoyad);
        btnGecis = (Button)findViewById(R.id.btnGecis);
        btnGecis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,SecondActivity.class);
                i.putExtra("ad",etAd.getText().toString());
                i.putExtra("soyad",etSoyad.getText().toString());
                // putExtra diğer sayfaya geçerken veriyi taşır
                startActivity(i); // diğer sayfaya geçer
            }
        });

    }
}
