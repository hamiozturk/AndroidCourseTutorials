package com.google.listviewornegi2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView liste;
    String[] ulkeler = {"Türkiye","Mısır","Kore","Çin","Fransa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liste = (ListView)findViewById(R.id.listView);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(
            this,android.R.layout.simple_list_item_1,ulkeler
        );
        liste.setAdapter(myAdapter);
        liste.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, final int i, long l) {

                AlertDialog.Builder dialogOlustur
                        = new AlertDialog.Builder(MainActivity.this);

                dialogOlustur.setMessage(ulkeler[i])
                        .setCancelable(false)
                        .setPositiveButton("Tamam", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int j) {
                                dialogInterface.dismiss(); //Dialog'u kapat

                                Intent intent =
                                        new Intent(getApplicationContext(),DetayActivity.class);
                                intent.putExtra("ulke",ulkeler[i].toString());
                                startActivity(intent);

                            }
                        })
                        .create().show();


            }
        });


    }
}
