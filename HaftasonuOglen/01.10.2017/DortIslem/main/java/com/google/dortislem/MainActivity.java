package com.google.dortislem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    EditText etSayi1,etSayi2;
    Button btnTopla,btnCikar,btnCarp,btnBol;
    TextView tvSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSayi1 = (EditText)findViewById(R.id.etSayi1);
        etSayi2 = (EditText)findViewById(R.id.etSayi2);
        tvSonuc = (TextView)findViewById(R.id.tvSonuc);

        btnTopla = (Button)findViewById(R.id.btnTopla);
        btnCikar = (Button)findViewById(R.id.btnCikar);
        btnBol = (Button)findViewById(R.id.btnBol);
        btnCarp = (Button)findViewById(R.id.btnCarp);



        // ÖRNEK KULLANIM - 1
        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(etSayi1.getText().toString());
                int sayi2 = Integer.parseInt(etSayi2.getText().toString());
                int sonuc = sayi1+sayi2;
                tvSonuc.setText(""+sonuc);
            }
        });

        btnCikar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(etSayi1.getText().toString());
                int sayi2 = Integer.parseInt(etSayi2.getText().toString());
                int sonuc = sayi1-sayi2;
                tvSonuc.setText(""+sonuc);
            }
        });

        btnCarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(etSayi1.getText().toString());
                int sayi2 = Integer.parseInt(etSayi2.getText().toString());
                int sonuc = sayi1*sayi2;
                tvSonuc.setText(""+sonuc);
            }
        });

        btnBol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(etSayi1.getText().toString());
                int sayi2 = Integer.parseInt(etSayi2.getText().toString());
                int sonuc = sayi1/sayi2;
                tvSonuc.setText(""+sonuc);
            }
        });



    }
}
