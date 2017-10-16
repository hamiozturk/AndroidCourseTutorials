package com.google.mp3playerproject;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.KeyListener;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    Button btnArama;
    AutoCompleteTextView actv;
    ArrayList<String> muzikler = new ArrayList<String>();
    /*
    AutoCompleteTextView; içerisine girilen herhangi bir karakterden sonra
    bize adapter yardımıyla kelime önerisi sunabilen bir nesnedir.

    Öneriye doğrudan tıklayıp, EditText içerisine en hızlı şekilde yazı yazabilmeye
    olanak tanır.
     */

    public void muzikleriListele(String dbName, ArrayList<String> muzikler, String aranan){
        SQLiteDatabase db = openOrCreateDatabase(dbName,MODE_PRIVATE,null);
        Cursor c = db.rawQuery("Select * from Muzikler where Baslik like '%"+aranan+"%'",null);

        if(c.getCount()>0){ //veri varsa
            c.moveToFirst(); // bulunan ilk elemandan başla

            do {
                muzikler.add(c.getString(1));
            }while (c.moveToNext()); // bulunacak son elemana kadar git

        }else{
            Log.d("Log","Hiç veri bulunamadı !");
        }

    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        actv = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);


        actv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                muzikleriListele("myDB",muzikler,actv.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,android.R.layout.select_dialog_item,muzikler
        );


        actv.setThreshold(3); //Kaç karakter girilince öneri sunsun ?
        actv.setTextColor(Color.parseColor("#303f9f")); //yazının rengi değişir
        actv.setAdapter(adapter);

        btnArama = (Button)findViewById(R.id.btnArama);
        btnArama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MainActivity.this,ListingActivity.class);
                i.putExtra("aranan",actv.getText().toString());
                startActivity(i);

            }
        });
    }


}
