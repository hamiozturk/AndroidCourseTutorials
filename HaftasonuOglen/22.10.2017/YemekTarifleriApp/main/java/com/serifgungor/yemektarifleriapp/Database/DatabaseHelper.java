package com.serifgungor.yemektarifleriapp.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.compat.BuildConfig;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by user on 22.10.2017.
 */


/*


1 orta boy patates,1 orta boy soğan,1 orta boy domates,1 orta boy kabak,1 havuç,4-5 tane taze fasulye,2 tane sarımsak,1 kaşık salça,1 kaşık sanayağ,1 kaşık zeytinyağı,Tuz, pulbiber, karabiber


6 adet yufka,400 gram yeşil mercimek,1.5 çay bardağı sıvı yağ,3 adet orta boy kuru soğan,1 dolu yemek kaşığı biber salçası,2 çay kaşığı tuz,2 çay kaşığı kimyon,1 çay kaşığı karabiber,Yarım demet maydanoz,1.5 çay bardağı sıvı yağ,1 çay bardağı su,2 adet yumurta sarısı


 */

public class DatabaseHelper extends SQLiteOpenHelper {
    private Context myContext;
    private static String DB_NAME = "Yemekler.db";
    private static String DB_PATH = "/data/data/com.serifgungor.yemektarifleriapp/databases/";
    private static int DATABASE_VERSION = 1;



    public SQLiteDatabase myDatabase;


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        if (i > i1)
        {
            Log.v("Database Upgrade", "Database version higher than old.");
            String myPath = DB_PATH + DB_NAME;
            File dbfile = new File(myPath);
            dbfile.delete();
        }
    }


    public DatabaseHelper(Context context) throws IOException{
        super(context,DB_NAME,null,DATABASE_VERSION);
        this.myContext = context;
        boolean dbExists = checkDatabase();

        if(dbExists){
            Log.d("DB_LOG","Database bulundu !");


            //Değişiklik varsa DB'i sil, tekrar oluştur
            if(checkDatabase()==true){ //Database varsa

/*
                try{
                    if(createDatabase()==true){
                        Log.d("DB_LOG","Database Yeniden Oluşturuldu");
                    }else{
                        Log.d("DB_LOG","Database Tekrar Oluşturulamadı");
                    }
                }catch (IOException e){}
                */

            }



        }else{
            Log.d("DB_LOG","Database bulunamadı !");
            createDatabase();
        }

    }

    public boolean createDatabase() throws IOException{
        boolean dbExists = checkDatabase();
        // checkDatabase metodu ile database varmı/yokmu kontrolü yap
        if(dbExists){ //database varsa
            return true;
        }else{ // database yoksa
            this.getReadableDatabase();
            try {
                this.close();
                copyDatabase();
            }catch (IOException e){
                throw  new Error("Database kopyalanma hatası");
            }
            return false;
        }
    }

    public boolean checkDatabase(){
        boolean checkdb = false;

        try{
            String dosyaKonumu = DB_PATH + DB_NAME;
            File dbFile = new File(dosyaKonumu);
            checkdb = dbFile.exists();
        }catch (SQLiteException e){
            Log.d("DB_LOG","Database bulunamadı");
        }

        return checkdb;
    }

    private void copyDatabase() throws IOException{
        String outFileName = DB_PATH + DB_NAME;
        OutputStream myOutput = new FileOutputStream(outFileName);
        InputStream myInput = myContext.getAssets().open(DB_NAME);

        byte[] buffer = new byte[1024];
        int length;
        while ((length = myInput.read(buffer)) > 0)
        {
            myOutput.write(buffer, 0, length);
        }
        myInput.close();
        myOutput.flush();
        myOutput.close();
    }

    public void openDatabase(){
        String myPath = DB_PATH + DB_NAME;
        myDatabase = SQLiteDatabase.openDatabase(myPath, null, SQLiteDatabase.OPEN_READWRITE);
    }

    //delete database
    public void deleteDatabase()
    {
        File file = new File(DB_PATH + DB_NAME);
        if(file.exists())
        {
            file.delete();
            System.out.println("delete database file.");
        }
    }


    public synchronized void close(){
        if (myDatabase != null){
            myDatabase.close();
        }
        super.close();
    }


    /*

    CREATE TABLE `Yemek` (
	`id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`kacKisilik`	INTEGER DEFAULT 0,
	`pisirmeSuresi`	INTEGER DEFAULT 0,
	`hazirlamaSuresi`	INTEGER DEFAULT 0,
	`kalori`	INTEGER DEFAULT 0,
	`resim`	VARCHAR,
	`turId`	INTEGER,
	`isim`	VARCHAR NOT NULL,
	`yapilisi`	TEXT NOT NULL,
	`malzemeler`	TEXT NOT NULL
    );

    CREATE TABLE `Tur` (
	`id`	INTEGER PRIMARY KEY AUTOINCREMENT,
	`baslik`	VARCHAR,
	`resim`	VARCHAR
    );


     */

}