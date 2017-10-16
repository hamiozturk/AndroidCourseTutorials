package com.serifgungor.kitapozetleri;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

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
