package com.google.mp3playerproject;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FavoriActivity extends AppCompatActivity {

    ListView favoriListesi;
    ArrayList<Muzik> muzikler = new ArrayList<>();

    public void muzikleriListele(String dbName,ArrayList<Muzik> muzikler){
        SQLiteDatabase db = openOrCreateDatabase(dbName,MODE_PRIVATE,null);
        Cursor c = db.rawQuery("Select * from Muzikler INNER JOIN Favoriler ON Muzikler.id=Favoriler.muzikId",null);

        if(c.getCount()>0){ //veri varsa
            c.moveToFirst(); // bulunan ilk elemandan başla

            do {
                muzikler.add(
                        new Muzik(
                                c.getString(1),
                                c.getString(2),
                                R.raw.alarm01,
                                c.getString(3),
                                c.getString(4),
                                c.getInt(0)
                        )
                );
            }while (c.moveToNext()); // bulunacak son elemana kadar git

        }else{
            Log.d("Log","Hiç veri bulunamadı !");
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favori);

        favoriListesi = (ListView)findViewById(R.id.favoriListView);

        this.muzikleriListele("myDB",muzikler);


        ArrayAdapter<Muzik> muzikArrayAdapter = new ArrayAdapter<Muzik>(
                this,android.R.layout.simple_list_item_1,muzikler
        );
        favoriListesi.setAdapter(muzikArrayAdapter);

    }
}
