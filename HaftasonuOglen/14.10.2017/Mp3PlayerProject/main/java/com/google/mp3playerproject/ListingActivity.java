package com.google.mp3playerproject;

import android.content.DialogInterface;
import android.content.Intent;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listing);

        String aranan = getIntent().getStringExtra("aranan");
        this.setTitle(aranan);


        ArrayAdapter<Muzik> listeAdaptoru = new ArrayAdapter<Muzik>(
          this,android.R.layout.simple_list_item_1,muzikler
        );

        muzikler.add(new Muzik("Müzik Adı 1","Müzik url 1",R.raw.alarm01,"Ad Soyad 1","Albüm1"));
        muzikler.add(new Muzik("Müzik Adı 2","Müzik url 2",R.raw.alarm02,"Ad Soyad 2","Albüm2"));
        muzikler.add(new Muzik("Müzik Adı 3","Müzik url 3",R.raw.alarm03,"Ad Soyad 3","Albüm3"));
        muzikler.add(new Muzik("Müzik Adı 4","Müzik url 4",R.raw.alarm04,"Ad Soyad 4","Albüm4"));


        listView = (ListView)findViewById(R.id.liste);
        listView.setAdapter(listeAdaptoru);

        mediaPlayer = new MediaPlayer();

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

                /*
                AlertDialog.Builder builder =
                        new AlertDialog.Builder(getApplicationContext());
                builder.setTitle("Favorilere eklensin mi ?");
                builder.setMessage("Seçili olan nesne, favori olarak eklensin mi ?");
                builder.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        //database'e tıklanan item'ı ekle
                    }
                });
                builder.setNegativeButton("Hayır",null);
                builder.create();
                builder.show();
                */

                Log.d("Log","test");

                return true;
            }
        });



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                try {
                    uri = Uri.parse("android.resource://"
                            +getApplicationContext().getPackageName()+"/"
                            +muzikler.get(i).getMuzikResourceUri()
                    );
                    mediaPlayer.setDataSource(getApplicationContext(),uri);
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
