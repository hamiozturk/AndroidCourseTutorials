package com.google.intentilesayfalararasigecis_veveritasima;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etSayi1,etSayi2;
    Button btnTopla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSayi1 = (EditText)findViewById(R.id.etSayi1);
        etSayi2 = (EditText)findViewById(R.id.etSayi2);
        btnTopla = (Button)findViewById(R.id.btnIslem);

        btnTopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sayi1 = Integer.parseInt(etSayi1.getText().toString());
                int sayi2 = Integer.parseInt(etSayi2.getText().toString());
                int sonuc = sayi1+sayi2;

                Intent intent = new Intent(MainActivity.this,SonucActivity.class);
                intent.putExtra("sonuc",sonuc);
                startActivity(intent);
            }
        });


    }
}
