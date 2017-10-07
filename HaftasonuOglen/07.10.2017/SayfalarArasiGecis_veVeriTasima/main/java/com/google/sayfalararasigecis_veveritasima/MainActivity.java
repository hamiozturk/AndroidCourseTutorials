package com.google.sayfalararasigecis_veveritasima;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etAd,etSoyad,etYas;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAd = (EditText)findViewById(R.id.etAd);
        etSoyad = (EditText)findViewById(R.id.etSoyad);
        etYas = (EditText)findViewById(R.id.etYas);
        btn = (Button)findViewById(R.id.btnGonder);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,IkinciActivity.class);
                i.putExtra("ad",etAd.getText().toString());
                i.putExtra("soyad",etSoyad.getText().toString());
                i.putExtra("yas",20);
                startActivity(i);
                /*
                startActivity diğer sayfaya geçiş yapabilmemiz için gereklidir.
                içerisine intent tipinde değer beklenir.

                En kısa şekilde kullanımı ise;
                startActivity(new Intent(MainActivity.this,IkinciActivity.class));


                 */

            }
        });


    }
}
