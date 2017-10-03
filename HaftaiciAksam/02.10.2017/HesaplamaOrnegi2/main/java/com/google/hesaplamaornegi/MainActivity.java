package com.google.hesaplamaornegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnTopla,btnCikar,btnCarp,btnBol;
    EditText etSayi1,etSayi2,etSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTopla = (Button)findViewById(R.id.btnTopla);
        btnCikar = (Button)findViewById(R.id.btnCikar);
        btnBol = (Button)findViewById(R.id.btnBol);
        btnCarp = (Button)findViewById(R.id.btnCarp);

        etSayi1 = (EditText)findViewById(R.id.etSayi1);
        etSayi2 = (EditText)findViewById(R.id.etSayi2);
        etSonuc = (EditText)findViewById(R.id.etSonuc);

        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(etSayi1.getText().toString());
                int sayi2 = Integer.parseInt(etSayi2.getText().toString());
                int sonuc = sayi1+sayi2;
                etSonuc.setText(""+sonuc);
            }
        });

        btnCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(etSayi1.getText().toString());
                int sayi2 = Integer.parseInt(etSayi2.getText().toString());
                int sonuc = sayi1-sayi2;
                etSonuc.setText(""+sonuc);
            }
        });

        btnCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(etSayi1.getText().toString());
                int sayi2 = Integer.parseInt(etSayi2.getText().toString());
                int sonuc = sayi1*sayi2;
                etSonuc.setText(""+sonuc);
            }
        });

        btnBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(etSayi1.getText().toString());
                int sayi2 = Integer.parseInt(etSayi2.getText().toString());
                int sonuc = sayi1/sayi2;
                etSonuc.setText(""+sonuc);
            }
        });




    }
}
