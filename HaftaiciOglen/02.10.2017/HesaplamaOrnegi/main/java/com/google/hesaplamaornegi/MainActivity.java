package com.google.hesaplamaornegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnHesapla;
    EditText etSayi1,etSayi2,etToplam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHesapla = (Button)findViewById(R.id.btnHesapla);
        etSayi1 = (EditText)findViewById(R.id.etSayi1);
        etSayi2 = (EditText)findViewById(R.id.etSayi2);
        etToplam = (EditText)findViewById(R.id.etToplam);

        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(etSayi1.getText().toString());
                int sayi2 = Integer.parseInt(etSayi2.getText().toString());
                int sonuc = sayi1+sayi2;
                etToplam.setText(""+sonuc);
            }
        });



    }
}
