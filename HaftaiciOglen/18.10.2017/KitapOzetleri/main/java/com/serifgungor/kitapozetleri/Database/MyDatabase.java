package com.serifgungor.kitapozetleri.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.serifgungor.kitapozetleri.KitapOzetleri;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * Created by user on 18.10.2017.
 */

public class MyDatabase extends SQLiteOpenHelper {

        // Database Version
        private static final int DATABASE_VERSION = 1;

        // Database Name
        private static final String DATABASE_NAME = "KitapOzetleriDb";//database adı

        private static final String TABLE_NAME = "Ozetler";

        private static String KITAP_ID = "id";
        private static String SAYFA_SAYISI = "sayfaSayisi";
        private static String PUAN = "puan";
        private static String KITAP_ADI = "kitapAdi";
        private static String YAZAR_ADSOYAD = "yazarAdSoyad";
        private static String YAYIN_EVI = "yayinEvi";
        private static String RESIM = "resim";
        private static String TUR = "tur";
        private static String OZET = "ozet";
        private static String DIL = "dil";
        private static String BASIM_TARIHI = "basimTarihi";



        public MyDatabase(Context context) {
                super(context, DATABASE_NAME, null, DATABASE_VERSION);
        }

        // DATABASE İÇİN TABLO OLUŞTUR
        @Override
        public void onCreate(SQLiteDatabase db) {  // Databesi oluşturuyoruz.Bu methodu biz çağırmıyoruz. Databese de obje oluşturduğumuzda otamatik çağırılıyor.
                String CREATE_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + "("
                + KITAP_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + SAYFA_SAYISI + " int(4),"
                + PUAN + " int(3),"
                + KITAP_ADI + " varchar,"
                + YAZAR_ADSOYAD + " varchar,"
                + YAYIN_EVI + " varchar,"
                + RESIM + " varchar,"
                + TUR + " varchar,"
                + OZET + " TEXT,"
                + DIL + " varchar,"
                + BASIM_TARIHI + " varchar" + ")";
                db.execSQL(CREATE_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
            // TODO Auto-generated method stub

        }

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
        ) {
            //kitapEkle methodu ise adı üstünde Databese veri eklemek için
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put(SAYFA_SAYISI, sayfaSayisi);
            values.put(PUAN, puan);
            values.put(KITAP_ADI, kitapAdi);
            values.put(YAZAR_ADSOYAD, yazarAdSoyad);
            values.put(YAYIN_EVI, yayinEvi);
            values.put(RESIM, resim);
            values.put(TUR, tur);
            values.put(OZET, ozet);
            values.put(DIL, dil);
            values.put(BASIM_TARIHI, basimTarihi);

            db.insert(TABLE_NAME, null, values);
            db.close(); //Database Bağlantısını kapattık*/
        }


        public void kitapOzetiSil(int id){ //id si belli olan row u silmek için
                SQLiteDatabase db = this.getWritableDatabase();
                db.delete(TABLE_NAME, KITAP_ID + " = ?",
                new String[] { String.valueOf(id) });
                db.close();
        }

        public void kitapOzetiDuzenle(
                int id,
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
        ) {
            SQLiteDatabase db = this.getWritableDatabase();
            //Bu methodda ise var olan veriyi güncelliyoruz(update)
            ContentValues values = new ContentValues();
            values.put(KITAP_ID, id);
            values.put(SAYFA_SAYISI, sayfaSayisi);
            values.put(PUAN, puan);
            values.put(KITAP_ADI, kitapAdi);
            values.put(YAZAR_ADSOYAD, yazarAdSoyad);
            values.put(YAYIN_EVI, yayinEvi);
            values.put(RESIM, resim);
            values.put(TUR, tur);
            values.put(OZET, ozet);
            values.put(DIL, dil);
            values.put(BASIM_TARIHI, basimTarihi);

            // updating row
            db.update(TABLE_NAME, values, KITAP_ID + " = ?", new String[] { String.valueOf(id) });
        }

        public KitapOzetleri kitapOzetiDetaylari(int id){

            KitapOzetleri kitapOzetleri = new KitapOzetleri();


            String selectQuery = "SELECT * FROM " + TABLE_NAME + " WHERE id="+id;

            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.rawQuery(selectQuery, null);
            // Move to first row
            cursor.moveToFirst();
            if(cursor.getCount() > 0){

                kitapOzetleri.setId(cursor.getInt(cursor.getColumnIndex("id")));
                kitapOzetleri.setSayfaSayisi(cursor.getInt(cursor.getColumnIndex("sayfaSayisi")));
                kitapOzetleri.setPuan(cursor.getInt(cursor.getColumnIndex("puan")));
                kitapOzetleri.setKitapAdi(cursor.getString(cursor.getColumnIndex("kitapAdi")));
                kitapOzetleri.setYazarAdSoyad(cursor.getString(cursor.getColumnIndex("yazarAdSoyad")));
                kitapOzetleri.setYayinEvi(cursor.getString(cursor.getColumnIndex("yayinEvi")));
                kitapOzetleri.setResim(cursor.getString(cursor.getColumnIndex("resim")));
                kitapOzetleri.setTur(cursor.getString(cursor.getColumnIndex("tur")));
                kitapOzetleri.setOzet(cursor.getString(cursor.getColumnIndex("ozet")));
                kitapOzetleri.setDil(cursor.getString(cursor.getColumnIndex("dil")));
                kitapOzetleri.setBasimTarihi(cursor.getString(cursor.getColumnIndex("basimTarihi")));


            }
            cursor.close();
            db.close();
            return kitapOzetleri;
        }

        public void kitaplariListele(List<KitapOzetleri> kitapOzetleriList) {

            SQLiteDatabase db = this.getReadableDatabase();
            String selectQuery = "SELECT * FROM " + TABLE_NAME + " ORDER BY ID DESC";
            Cursor cursor = db.rawQuery(selectQuery, null);

            if (cursor.moveToFirst()) {
                do {
                    kitapOzetleriList.add(
                            new KitapOzetleri(
                                    cursor.getInt(cursor.getColumnIndex("id")),
                                    cursor.getInt(cursor.getColumnIndex("sayfaSayisi")),
                                    cursor.getInt(cursor.getColumnIndex("puan")),
                                    cursor.getString(cursor.getColumnIndex("kitapAdi")),
                                    cursor.getString(cursor.getColumnIndex("yazarAdSoyad")),
                                    cursor.getString(cursor.getColumnIndex("yayinEvi")),
                                    cursor.getString(cursor.getColumnIndex("resim")),
                                    cursor.getString(cursor.getColumnIndex("tur")),
                                    cursor.getString(cursor.getColumnIndex("ozet")),
                                    cursor.getString(cursor.getColumnIndex("dil")),
                                    cursor.getString(cursor.getColumnIndex("basimTarihi"))
                            )
                    );

                } while (cursor.moveToNext());
            }
            db.close();
        }

        public int getRowCount() {
            // Bu method bu uygulamada kullanılmıyor ama her zaman lazım olabilir.Tablodaki row sayısını geri döner.
            //Login uygulamasında kullanacağız
            String countQuery = "SELECT  * FROM " + TABLE_NAME;
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.rawQuery(countQuery, null);
            int rowCount = cursor.getCount();
            db.close();
            cursor.close();
            // return row count
            return rowCount;
        }

        public void resetTables(){
            //Bunuda uygulamada kullanmıyoruz. Tüm verileri siler. tabloyu resetler.
            SQLiteDatabase db = this.getWritableDatabase();
            // Delete All Rows
            db.delete(TABLE_NAME, null, null);
            db.close();
        }




/*

*/








}/*





public class MyDatabase{

    private SQLiteDatabase db;

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
        db = SQLiteDatabase.openOrCreateDatabase(dbName,null);
        // yoksa database'i oluştur, varsa aç

        StringBuilder sb = new StringBuilder();
        sb.append("Create Table if not exits Ozetler(");
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
        sorgu2.append("'"+kitapAdi+"'");
        sorgu2.append("'"+yazarAdSoyad+"'");
        sorgu2.append("'"+yayinEvi+"'");
        sorgu2.append("'"+resim+"'");
        sorgu2.append("'"+tur+"'");
        sorgu2.append("'"+ozet+"'");
        sorgu2.append("'"+dil+"'");
        sorgu2.append("'"+basimTarihi+"'");
        sorgu2.append(")");
        // Ozetler ismindeki tabloya veri ekler
        db.execSQL(sorgu2.toString());

    }

    public void kitaplariListele(List<KitapOzetleri> kitapOzetleriList){
        String dbName = "KitapOzetleriDb";
        db = SQLiteDatabase.openOrCreateDatabase(dbName,null);

        Cursor c = db.rawQuery("Select * from Ozetler order by id desc",null);

        if(c.getCount()>0){
            c.moveToFirst();

            do{
                kitapOzetleriList.add(
                        new KitapOzetleri(
                                c.getInt(c.getColumnIndex("id")),
                                c.getInt(c.getColumnIndex("sayfaSayisi")),
                                c.getInt(c.getColumnIndex("puan")),
                                c.getString(c.getColumnIndex("kitapAdi")),
                                c.getString(c.getColumnIndex("yazarAdSoyad")),
                                c.getString(c.getColumnIndex("yayinEvi")),
                                c.getString(c.getColumnIndex("resim")),
                                c.getString(c.getColumnIndex("tur")),
                                c.getString(c.getColumnIndex("ozet")),
                                c.getString(c.getColumnIndex("dil")),
                                c.getString(c.getColumnIndex("basimTarihi"))
                        )
                );
            }while (c.moveToNext());

        }
    }


}
*/