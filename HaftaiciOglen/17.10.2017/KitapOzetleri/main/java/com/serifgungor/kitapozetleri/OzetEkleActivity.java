package com.serifgungor.kitapozetleri;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class OzetEkleActivity extends AppCompatActivity {

    public void KitapOzetiEkle(
            int sayfaSayisi,
            int puan,
            String kitapAdi,
            String yazarAdSoyad,
            String yayinEvi,
            String resim,
            String tur,
            String ozet,
            String dil,
            String basimTarihi
    ){
        String dbName = "KitapOzetleriDb";
        SQLiteDatabase db = openOrCreateDatabase(dbName,MODE_PRIVATE,null);
        // yoksa database'i oluştur, varsa aç

        StringBuilder sb = new StringBuilder();
        sb.append("Create Table if not exists Ozetler(");
        sb.append("id INTEGER PRIMARY KEY,");
        sb.append("sayfaSayisi int(4),");
        sb.append("puan int(3),");
        sb.append("kitapAdi varchar,");
        sb.append("yazarAdSoyad varchar,");
        sb.append("yayinEvi varchar,");
        sb.append("resim varchar,");
        sb.append("tur varchar,");
        sb.append("ozet varchar,");
        sb.append("dil varchar,");
        sb.append("basimTarihi varchar");
        sb.append(")");
        // Ozetler isminde eğer tablo yok ise oluştur.
        db.execSQL(sb.toString()); // execSQL içerisindeki String ifadeyi sorgu olarak çalıştır.

        StringBuilder sorgu2 = new StringBuilder();
        sorgu2.append("insert into Ozetler values(");
        sorgu2.append("NULL,");
        sorgu2.append(sayfaSayisi+",");
        sorgu2.append(puan+",");
        sorgu2.append("'"+kitapAdi+"',");
        sorgu2.append("'"+yazarAdSoyad+"',");
        sorgu2.append("'"+yayinEvi+"',");
        sorgu2.append("'"+resim+"',");
        sorgu2.append("'"+tur+"',");
        sorgu2.append("'"+ozet+"',");
        sorgu2.append("'"+dil+"',");
        sorgu2.append("'"+basimTarihi+"'");
        sorgu2.append(")");
        // Ozetler ismindeki tabloya veri ekler
        db.execSQL(sorgu2.toString());

    }


    EditText etKitapAdi,etYazarAdSoyad,etYayinEvi,etBasimTarihi,etOzet, etSayfaSayisi,etPuan;
    Spinner spDil,spTur;
    Button btnOzetEkle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ozet_ekle);

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
                        this,R.array.turler,android.R.layout.simple_spinner_item
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
                KitapOzetiEkle(
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
