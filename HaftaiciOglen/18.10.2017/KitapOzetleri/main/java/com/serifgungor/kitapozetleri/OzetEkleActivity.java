package com.serifgungor.kitapozetleri;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.serifgungor.kitapozetleri.Database.MyDatabase;

public class OzetEkleActivity extends AppCompatActivity {

    MyDatabase myDatabase;

    EditText etKitapAdi,etYazarAdSoyad,etYayinEvi,etBasimTarihi,etOzet, etSayfaSayisi,etPuan;
    Spinner spDil,spTur;
    Button btnOzetEkle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ozet_ekle);

        myDatabase = new MyDatabase(getApplicationContext());

        etBasimTarihi = (EditText)findViewById(R.id.etBasimTarihi);
        etKitapAdi = (EditText)findViewById(R.id.etKitapAdi);
        etYazarAdSoyad = (EditText)findViewById(R.id.etYazarAdSoyad);
        etYayinEvi = (EditText)findViewById(R.id.etYayinEvi);
        etOzet = (EditText)findViewById(R.id.etOzet);
        etSayfaSayisi = (EditText)findViewById(R.id.etSayfaSayisi);
        etPuan = (EditText)findViewById(R.id.etPuan);
        spDil = (Spinner)findViewById(R.id.spDil);
        spTur = (Spinner)findViewById(R.id.spTur);
        btnOzetEkle = (Button)findViewById(R.id.btnOzetEkle);

        ArrayAdapter turAdapter =
                ArrayAdapter.createFromResource(
                        this,R.array.turler,android.R.layout.simple_spinner_dropdown_item
                );

        ArrayAdapter dilAdapter =
                ArrayAdapter.createFromResource(
                        this,R.array.diller,android.R.layout.simple_spinner_dropdown_item
                );

        spDil.setAdapter(dilAdapter);
        spTur.setAdapter(turAdapter);


        btnOzetEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myDatabase.KitapOzetiEkle(
                    Integer.parseInt(etSayfaSayisi.getText().toString()),
                    Integer.parseInt(etPuan.getText().toString()),
                    etKitapAdi.getText().toString(),
                        etYazarAdSoyad.getText().toString(),
                        etYayinEvi.getText().toString(),
                        "",
                        spTur.getSelectedItem().toString(),
                        etOzet.getText().toString(),
                        spDil.getSelectedItem().toString(),
                        etBasimTarihi.getText().toString()
                );
                finish();
            }
        });


    }
}
