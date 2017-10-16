package com.serifgungor.notdefteriuygulamasi;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NotEkleActivity extends AppCompatActivity {

    public void notEkle(
            String dbName,
            String baslik,
            String tarih,
            String not
    ){

        SQLiteDatabase db = openOrCreateDatabase(dbName,MODE_PRIVATE,null);
        db.execSQL("Create Table if not exists Notlar(id INTEGER PRIMARY KEY, Baslik varchar, Tarih varchar, Icerik varchar)");
        // eğer yoksa Notlar isimli tablo oluştur
        db.execSQL("insert into Notlar values(NULL,'"+baslik+"','"+tarih+"','"+not+"')");
        //Notlar tablosuna veri ekle
    }

    EditText etBaslik,etTarih,etNot;
    Button btnNotEkle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_ekle);

        etBaslik = (EditText)findViewById(R.id.etBaslik);
        etNot = (EditText)findViewById(R.id.etIcerik);
        etTarih = (EditText)findViewById(R.id.etTarih);
        btnNotEkle = (Button)findViewById(R.id.btnNotEkle);
        btnNotEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notEkle(
                        "myDB",
                        etBaslik.getText().toString(),
                        etTarih.getText().toString(),
                        etNot.getText().toString()
                );

                Not not = new Not(etBaslik.getText().toString(),etTarih.getText().toString(),etNot.getText().toString());

                Intent intent=new Intent();
                intent.putExtra("not",not);
                setResult(10,intent);

                finish();
            }
        });




    }
}
