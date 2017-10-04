package com.google.intentveritasima2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class KisiDetayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisi_detay);

        ArrayList<Kisi> kisiler = (ArrayList<Kisi>)getIntent().getSerializableExtra("kisiler");

        for (int i=0; i<kisiler.size(); i++){
            Toast.makeText(getApplicationContext(),""+kisiler.get(i).getYas(),Toast.LENGTH_LONG).show();
        }

    }
}
