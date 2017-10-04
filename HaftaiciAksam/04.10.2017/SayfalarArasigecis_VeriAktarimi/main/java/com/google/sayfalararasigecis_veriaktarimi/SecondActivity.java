package com.google.sayfalararasigecis_veriaktarimi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    EditText etAdSoyad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etAdSoyad = (EditText)findViewById(R.id.etAdSoyad);

        String a = getIntent().getStringExtra("ad");
        String s = getIntent().getStringExtra("soyad");
        etAdSoyad.setText(a+" "+ s);

    }
}
