package com.serifgungor.yemektarifleriapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.GridView;

import com.serifgungor.yemektarifleriapp.Adapter.TurAdapter;
import com.serifgungor.yemektarifleriapp.Database.DatabaseHelper;
import com.serifgungor.yemektarifleriapp.Model.Tur;

import java.io.File;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Tur> turler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView)findViewById(R.id.gridView);

        DatabaseHelper dbHelper;
        SQLiteDatabase db;
        Cursor c;
        turler = new ArrayList<>();

        try{
            String[] f = getAssets().list("");
            for(String f1 : f){
                Log.v("names",f1);
            }

        }catch (Exception e){

        }

        try{
            dbHelper = new DatabaseHelper(getApplicationContext());
            dbHelper.createDatabase();
            db = dbHelper.getReadableDatabase();
            c = db.rawQuery("select * from Tur order by id desc",null);
            while (c.moveToNext()){
                turler.add(new Tur(c.getInt(0),c.getString(1),c.getString(2)));
            }
            c.close();
            db.close();
        }catch (Exception e){
            Log.e("DB_LOG",e.getMessage());
            Log.e("DB_LOG","Veritabanı oluşturulamadı veya kopyalanamadı !");
        }





        TurAdapter turAdapter = new TurAdapter(this,turler);
        gridView.setAdapter(turAdapter);
    }
}
