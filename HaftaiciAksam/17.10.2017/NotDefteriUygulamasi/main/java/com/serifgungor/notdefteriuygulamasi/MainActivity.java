package com.serifgungor.notdefteriuygulamasi;

import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.PopupMenu;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Not> liste;
    PopupMenu popupMenu;
    ArrayAdapter<Not> arrayAdapter;

    public void notSil(String dbName, int notId){
        SQLiteDatabase db = openOrCreateDatabase(dbName,MODE_PRIVATE,null);
        db.execSQL("delete from Notlar where id = "+notId);
    }

    public void notlariListele(String dbName) {

        SQLiteDatabase db = openOrCreateDatabase(dbName,MODE_PRIVATE,null);
        db.execSQL("Create Table if not exists Notlar(id INTEGER PRIMARY KEY, Baslik varchar, Tarih varchar, Icerik varchar)");


        Cursor c = db.rawQuery("Select * from Notlar",null);

        if(c.getCount()>0){
            c.moveToFirst();
            do{
                liste.add(
                        new Not(
                                c.getInt(c.getColumnIndex("id")),
                                c.getString(c.getColumnIndex("Baslik")), //c.getString(1);
                                c.getString(c.getColumnIndex("Tarih")), //c.getString(2);
                                c.getString(c.getColumnIndex("Icerik")) //c.getString(3);
                        )
                );
                //Liste Not tipinde olduğu için liste.add dediğimde Not tipinde veri gönderebilirim.
                //c.getString metodu sayesinde ise, tablodaki kolon indisini temsil ediyorum.
            }while (c.moveToNext());
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        try{
            if(requestCode==10){
                Not not = (Not)data.getSerializableExtra("not");
                liste.add(not);
            }else if(requestCode==20){
                Not not = (Not)data.getSerializableExtra("not");
                liste.clear();
                listView.setAdapter(arrayAdapter);
            }
        }catch (Exception e){

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,NotEkleActivity.class);
                startActivityForResult(i,10);
            }
        });


        this.setTitle(R.string.title);
        //uygulama activity sayfamızın başlığını strings.xml'den çektik.

        liste = new ArrayList<Not>();
        notlariListele("myDB");

        listView = (ListView)findViewById(R.id.listView);

        arrayAdapter = new ArrayAdapter<Not>(
                this,android.R.layout.simple_list_item_1,liste
        );

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(final AdapterView<?> adapterView, final View view, final int i, long l) {

                popupMenu = new PopupMenu(MainActivity.this,view,Gravity.CENTER);
                popupMenu.getMenuInflater().inflate(R.menu.menu_popup,popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        Intent intent;
                        switch (item.getItemId()){
                            case R.id.menu_id_goruntule:
                                // Sayfaya Gönder

                                intent = new Intent(MainActivity.this,DetayActivity.class);
                                intent.putExtra("islem","goruntule");
                                intent.putExtra("veri",liste.get(i));
                                startActivityForResult(intent,1);

                                break;
                            case R.id.menu_id_guncelle:
                                // Sayfaya GÖNDER

                                intent = new Intent(MainActivity.this,DetayActivity.class);
                                intent.putExtra("islem","guncelle");
                                intent.putExtra("veri",liste.get(i));
                                startActivityForResult(intent,1);

                                break;
                            case R.id.menu_id_sil:
                                //AlertDialog

                                popupMenu.dismiss();
                                AlertDialog.Builder dialog = new AlertDialog.Builder(view.getContext());
                                dialog.setTitle("Veri silinsin mi ?");
                                dialog.setNegativeButton("Hayır",null);
                                dialog.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialogInterface, int j) {
                                        //DELETE
                                        notSil("myDB",liste.get(i).getNotId());
                                        liste.remove(i);
                                        listView.setAdapter(arrayAdapter);
                                    }
                                });
                                dialog.setMessage("Verinin silinmesi işlemini onaylıyor musunuz ?");
                                dialog.create();
                                dialog.show();


                                break;
                        }

                        return false;
                    }
                });
                popupMenu.show();

            }
        });





    }

}
