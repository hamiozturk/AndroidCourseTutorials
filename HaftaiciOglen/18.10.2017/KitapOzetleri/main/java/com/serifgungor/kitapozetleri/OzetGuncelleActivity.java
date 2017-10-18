package com.serifgungor.kitapozetleri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.serifgungor.kitapozetleri.Database.MyDatabase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OzetGuncelleActivity extends AppCompatActivity {

    EditText etYazarAdSoyadGuncelle,etYayinEviGuncelle,etBasimTarihiGuncelle,etSayfaSayisiGuncelle,
            etPuanGuncelle,etOzetGuncelle, etKitapAdiGuncelle, etResimGuncelle;
    Button btnOzetGuncelle,btnOzetSil;
    Spinner spTurGuncelle,spDilGuncelle;

    MyDatabase myDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ozet_guncelle);

        String islem = getIntent().getStringExtra("islem");
        final int kitapId = getIntent().getIntExtra("id",0);

        myDatabase = new MyDatabase(getApplicationContext());
        KitapOzetleri kitapOzetleri = myDatabase.kitapOzetiDetaylari(kitapId);

        spTurGuncelle = (Spinner)findViewById(R.id.spTurGuncelle);
        spDilGuncelle = (Spinner)findViewById(R.id.spDilGuncelle);

        btnOzetGuncelle = (Button)findViewById(R.id.btnOzetGuncelle);
        btnOzetSil = (Button)findViewById(R.id.btnOzetSil);

        etBasimTarihiGuncelle = (EditText)findViewById(R.id.etBasimTarihiGuncelle);
        etOzetGuncelle = (EditText)findViewById(R.id.etOzetGuncelle);
        etSayfaSayisiGuncelle = (EditText)findViewById(R.id.etSayfaSayisiGuncelle);
        etPuanGuncelle = (EditText)findViewById(R.id.etPuanGuncelle);
        etYayinEviGuncelle = (EditText)findViewById(R.id.etYayinEviGuncelle);
        etYazarAdSoyadGuncelle = (EditText)findViewById(R.id.etYazarAdSoyadGuncelle);
        etKitapAdiGuncelle = (EditText)findViewById(R.id.etKitapAdiGuncelle);
        etResimGuncelle = (EditText)findViewById(R.id.etResimGuncelle);


        etYayinEviGuncelle.setText(kitapOzetleri.getYayinEvi());
        etYazarAdSoyadGuncelle.setText(kitapOzetleri.getYazarAdSoyad());
        etOzetGuncelle.setText(kitapOzetleri.getOzet());
        etBasimTarihiGuncelle.setText(kitapOzetleri.getBasimTarihi());
        etSayfaSayisiGuncelle.setText(""+kitapOzetleri.getSayfaSayisi());
        etPuanGuncelle.setText(""+kitapOzetleri.getPuan());
        etKitapAdiGuncelle.setText(kitapOzetleri.getKitapAdi());
        etResimGuncelle.setText(kitapOzetleri.getResim());

        if("guncelle".equals(islem)){
            this.setTitle("Özet Güncelle");
        }else if("goruntule".equals(islem)){
            this.setTitle("Özet Detayları");
            btnOzetGuncelle.setVisibility(View.INVISIBLE);
            btnOzetSil.setVisibility(View.INVISIBLE);
        }


        ArrayAdapter turAdapter =
                ArrayAdapter.createFromResource(
                        this,R.array.turler,android.R.layout.simple_spinner_dropdown_item
                );

        ArrayAdapter dilAdapter =
                ArrayAdapter.createFromResource(
                        this,R.array.diller,android.R.layout.simple_spinner_dropdown_item
                );

        spDilGuncelle.setAdapter(dilAdapter);
        spTurGuncelle.setAdapter(turAdapter);


        btnOzetGuncelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               // myDatabase.kitapOzetiDuzenle();
                myDatabase.kitapOzetiDuzenle(
                        kitapId,
                        Integer.parseInt(etSayfaSayisiGuncelle.getText().toString()),
                        Integer.parseInt(etPuanGuncelle.getText().toString()),
                        etKitapAdiGuncelle.getText().toString(),
                        etYazarAdSoyadGuncelle.getText().toString(),
                        etYayinEviGuncelle.getText().toString(),
                        etResimGuncelle.getText().toString(),
                        spTurGuncelle.getSelectedItem().toString(),
                        etOzetGuncelle.getText().toString(),
                        spDilGuncelle.getSelectedItem().toString(),
                        etBasimTarihiGuncelle.getText().toString()
                );
                finish();
            }
        });

        btnOzetSil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDatabase.kitapOzetiSil(kitapId);
                finish();
            }
        });

    }
}
