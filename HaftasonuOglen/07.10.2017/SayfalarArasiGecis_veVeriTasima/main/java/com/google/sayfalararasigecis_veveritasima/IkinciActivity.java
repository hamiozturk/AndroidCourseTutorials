package com.google.sayfalararasigecis_veveritasima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class IkinciActivity extends AppCompatActivity {

    EditText sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ikinci);
        sonuc = (EditText)findViewById(R.id.etSonuc);

        String ad = getIntent().getStringExtra("ad");
        String soyad = getIntent().getStringExtra("soyad");
        int yas = getIntent().getIntExtra("yas",0);
        sonuc.setText(ad+" "+soyad+" "+yas);

    }
}
