package com.serifgungor.kitapozetleri;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import com.serifgungor.kitapozetleri.Adapter.OzelAdapter;

public class MainActivity extends AppCompatActivity {

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


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_item_add:
                Intent i = new Intent(MainActivity.this,OzetEkleActivity.class);
                startActivityForResult(i,50);
                break;
        }

        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode==50){

        }

        super.onActivityResult(requestCode, resultCode, data);
    }

    List<KitapOzetleri> kitapOzetleriList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kitapOzetleriList = new ArrayList<>();

        kitapOzetleriList.add(
                new KitapOzetleri(
                        300,
                        5,
                        "kitap adı",
                        "yazar adsoyad",
                        "yayın evi",
                        "resim",
                        "tür",
                        "özet",
                        "dil",
                        "basım tarihi"
                )
        );

        kitapOzetleriList.add(
                new KitapOzetleri(
                        300,
                        3,
                        "kitap adı",
                        "yazar adsoyad",
                        "yayın evi",
                        "resim",
                        "tür",
                        "özet",
                        "dil",
                        "basım tarihi"
                )
        );

        //resim kısmına ne yazılır ise, drawable klasörüne de eklenmesi gerekecek

        ListView kitaplarListView = (ListView)findViewById(R.id.listView);

        try{
            OzelAdapter ozelAdapter = new OzelAdapter(this,kitapOzetleriList);
            kitaplarListView.setAdapter(ozelAdapter);
        }catch (Exception e){

        }





    }
}
