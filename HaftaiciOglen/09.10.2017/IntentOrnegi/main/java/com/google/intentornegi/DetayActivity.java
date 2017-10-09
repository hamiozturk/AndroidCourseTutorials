package com.google.intentornegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class DetayActivity extends AppCompatActivity {

    EditText etAd,etSoyad,etYas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        etAd = (EditText)findViewById(R.id.etIsim);
        etSoyad = (EditText)findViewById(R.id.etSoyisim);
        etYas = (EditText)findViewById(R.id.etYasi);

        etAd.setText(getIntent().getStringExtra("ad"));
        etSoyad.setText(getIntent().getStringExtra("soyad"));
        etYas.setText(getIntent().getStringExtra("yas"));

    }
}
