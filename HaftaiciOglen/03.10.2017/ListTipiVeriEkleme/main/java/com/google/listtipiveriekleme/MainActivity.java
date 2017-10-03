package com.google.listtipiveriekleme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etKelime;
    Button btnEkle,btnListele;
    ArrayList<String> liste = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etKelime = (EditText)findViewById(R.id.etKelime);
        btnEkle = (Button)findViewById(R.id.btnEkle);
        btnListele = (Button)findViewById(R.id.btnListele);

        btnEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liste.add(etKelime.getText().toString());
            }
        });

        btnListele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0; i<liste.size(); i++){
                    Log.d("Log",liste.get(i));
                }
            }
        });





    }
}
