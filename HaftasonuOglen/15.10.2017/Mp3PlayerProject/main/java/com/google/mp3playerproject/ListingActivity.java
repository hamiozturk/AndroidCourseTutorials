package com.google.mp3playerproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class ListingActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Muzik> muzikler = new ArrayList<>();
    MediaPlayer mediaPlayer;
    Uri uri;


    public void muzikEkle(
        String dbName,
        String baslik,
        String url,
        String sanatci,
        String album,
        String tur
    ){

        SQLiteDatabase db = openOrCreateDatabase(dbName,MODE_PRIVATE,null);
        String sorgu = "Create Table if not exists Muzikler(id INTEGER PRIMARY KEY,Baslik varchar,Url varchar, Sanatci varchar, Album varchar, Tur varchar)";
        // Eğer yoksa Muzikler isminde tablo oluştur.
        db.execSQL(sorgu); // SQL sorgusunu çalıştır.
        String sorgu2 = "insert into Muzikler values(NULL,'"+baslik+"','"+url+"','"+sanatci+"','"+album+"','"+tur+"')";
        db.execSQL(sorgu2);

    }

    public void favorilereEkle(String dbName, int muzikId){
        SQLiteDatabase db = openOrCreateDatabase(dbName,MODE_PRIVATE,null);
        String sorgu = "Create Table if not exists Favoriler(id INTEGER PRIMARY KEY,muzikId int(5))";
        //yoksa tabloyu oluştur
        db.execSQL(sorgu); // SQL sorgusunu çalıştır.
        String sorgu2 = "insert into Favoriler values(NULL,"+muzikId+")";
        db.execSQL(sorgu2);
    }

    public void muzikleriListele(String dbName,ArrayList<Muzik> muzikler,String aranan){
        SQLiteDatabase db = openOrCreateDatabase(dbName,MODE_PRIVATE,null);
        Cursor c = db.rawQuery("Select * from Muzikler where Baslik like '%"+aranan+"%'",null);

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


            /*
                    0 -> id
                    1 - > Baslik
                    2 - > Url
                    3 -> Sanatci
                    4 -> Album
                    5 -> Tur
             */
            //muzikler.add(new Muzik("Müzik Adı 1","Müzik url 1",R.raw.alarm01,"Ad Soyad 1","Albüm1"));


    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        String aranan = getIntent().getStringExtra("aranan");
        this.setTitle(aranan);


        ArrayAdapter<Muzik> listeAdaptoru = new ArrayAdapter<Muzik>(
          this,android.R.layout.simple_list_item_1,muzikler
        );

        try{
            this.muzikEkle("myDB","Müzik Adı 1","Müzik url 1","Sanatçı","Albüm","Tür");
            this.muzikEkle("myDB","Müzik Adı 2","Müzik url 2","Sanatçı","Albüm","Tür");
            this.muzikEkle("myDB","Müzik Adı 3","Müzik url 3","Sanatçı","Albüm","Tür");
            this.muzikEkle("myDB","Müzik Adı 4","Müzik url 4","Sanatçı","Albüm","Tür");
            this.muzikleriListele("myDB",muzikler,aranan);
        }catch (Exception e){

        }






        listView = (ListView)findViewById(R.id.liste);
        listView.setAdapter(listeAdaptoru);



        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, final int i, long l) {


                new AlertDialog.Builder(adapterView.getContext())
                .setTitle("Favorilere eklensin mi ?")
                .setMessage("Seçili olan nesne, favori olarak eklensin mi ?")
                .setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int j) {
                        //database'e tıklanan item'ı ekle
                        favorilereEkle("myDB",muzikler.get(i).getMuzikId());
                    }
                })
                .setNegativeButton("Hayır",null)
                .create()
                .show();


                return true;
            }
        });



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {




                try {
                    /*uri = Uri.parse("android.resource://"
                            +getApplicationContext().getPackageName()+"/"
                            +muzikler.get(i).getMuzikResourceUri()
                    );
                    */
                    //mediaPlayer.setDataSource(getApplicationContext(),uri);
                    //mediaPlayer.prepare();

                    uri = Uri.parse(muzikler.get(i).getMuzikUrl());

                    mediaPlayer = new MediaPlayer();
                    mediaPlayer.setDataSource(getApplicationContext(),uri);
                    mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
                    mediaPlayer.prepare();


                }catch (Exception e){

                }

                if(!mediaPlayer.isPlaying()){ //mediaPlayer çalmıyorsa
                    mediaPlayer.start(); //çal
                    setTitle(muzikler.get(i).getMuzikAdi());
                    // Sayfa başlığını, tıklanan liste indisine göre diziden metot ile
                    // indise ait olan elemanın başlık metnini yazdırıyoruz.
                }else{
                    //mediaPlayer.pause(); //durdur
                    mediaPlayer.release(); //bitir
                }


            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        //mediaPlayer.pause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i;
        switch (item.getItemId()){
            case R.id.menu_item_arama:
                i = new Intent(ListingActivity.this,MainActivity.class);
                startActivity(i);
                finish();
                break;
            case R.id.menu_item_favoriler:
                i = new Intent(ListingActivity.this,FavoriActivity.class);
                startActivity(i);
                break;
        }

        return true;
    }
}
