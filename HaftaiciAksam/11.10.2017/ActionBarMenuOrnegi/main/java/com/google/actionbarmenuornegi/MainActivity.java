package com.google.actionbarmenuornegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.setTitle("Merhaba Sınıf !"); //SAYFA BAŞLIĞINI DEĞİŞTİRİR
        //this.getSupportActionBar().setTitle(); //SAYFA BAŞLIĞINI DEĞİŞTİRİR
        this.getSupportActionBar().setSubtitle("Alt Başlık"); //ALT BAŞLIK EKLER

        this.getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu1,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                super.onBackPressed();
                return true;
            case R.id.menu_item_1:
                Toast.makeText(getApplicationContext(),"Ayarlar",Toast.LENGTH_LONG).show();
                return true;

            case R.id.menu_item_2:
                Toast.makeText(getApplicationContext(),"İletişim",Toast.LENGTH_LONG).show();
                return true;

            case R.id.menu_item_3:
                Toast.makeText(getApplicationContext(),"Google Play",Toast.LENGTH_LONG).show();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
