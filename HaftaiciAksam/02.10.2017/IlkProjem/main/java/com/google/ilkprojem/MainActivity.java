package com.google.ilkprojem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnTikla;
    EditText etAd,etSoyad,etAdSoyad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnTikla = (Button)findViewById(R.id.btnTikla);
        etAd = (EditText)findViewById(R.id.etAd);
        etSoyad = (EditText)findViewById(R.id.etSoyad);
        etAdSoyad = (EditText)findViewById(R.id.etAdSoyad);


        btnTikla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String isim = etAd.getText().toString();
                // getText().toString() ile EditText nesnesi içerisindeki string'i yakalayabiliriz.
                String soyisim = etSoyad.getText().toString();

                etAdSoyad.setText(isim+" "+soyisim);
                // setText metodu ile EditText nesnesi içerisine string yazdırabiliriz.
            }
        });





        /*

        setContentView ile R.layout.activity_main içerisinde;

        R -> Resources (Kaynak) içerisinde,
        layout -> layout klasörü içerisinde,
        activity_main diyerek, acitivity_main.xml
        uzantısına sahip dosyayı işaret ederiz.

         */

    }

}
