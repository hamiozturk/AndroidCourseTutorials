package com.google.intentornegi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etAd,etSoyad,etYas;
    Button btnGonder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGonder = (Button)findViewById(R.id.btnGonder);
        etAd = (EditText)findViewById(R.id.etAd);
        etSoyad = (EditText)findViewById(R.id.etSoyad);
        etYas = (EditText)findViewById(R.id.etYas);

        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*
                Toast.makeText(
                        getApplicationContext(),
                        "Merhaba "+etAd.getText().toString(),
                        Toast.LENGTH_SHORT
                ).show();
                */

                Intent i = new Intent(MainActivity.this,DetayActivity.class);
                i.putExtra("ad",etAd.getText().toString());
                i.putExtra("soyad",etSoyad.getText().toString());
                i.putExtra("yas",etYas.getText().toString());
                startActivity(i);

            }
        });



    }
}
