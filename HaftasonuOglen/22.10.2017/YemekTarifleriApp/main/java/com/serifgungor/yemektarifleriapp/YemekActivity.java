package com.serifgungor.yemektarifleriapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.serifgungor.yemektarifleriapp.Adapter.YemekAdapter;
import com.serifgungor.yemektarifleriapp.Model.Yemek;

import java.util.ArrayList;

public class YemekActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Yemek> yemekler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek);

        yemekler = new ArrayList<>();

        String[] malzemeler = {"malzeme1","malzeme2"};
        yemekler.add(new Yemek(
                1,4,20,20,200,"borekler",1,"Börek","Yapılışı",malzemeler
        ));


        listView =(ListView)findViewById(R.id.listView);
        YemekAdapter yemekAdapter = new YemekAdapter(this,yemekler);
        listView.setAdapter(yemekAdapter);



    }
}
