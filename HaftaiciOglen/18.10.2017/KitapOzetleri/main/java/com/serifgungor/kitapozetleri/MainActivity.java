package com.serifgungor.kitapozetleri;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import com.serifgungor.kitapozetleri.Adapter.OzelAdapter;
import com.serifgungor.kitapozetleri.Database.MyDatabase;

public class MainActivity extends AppCompatActivity {

    List<KitapOzetleri> kitapOzetleriList;
    SwipeRefreshLayout swipeRefreshLayout;
    ListView kitaplarListView;
    OzelAdapter ozelAdapter;
    MyDatabase myDatabase;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDatabase = new MyDatabase(getApplicationContext());
        kitapOzetleriList = new ArrayList<>();
        myDatabase.kitaplariListele(kitapOzetleriList);
        kitaplarListView = (ListView)findViewById(R.id.listView);
        ozelAdapter = new OzelAdapter(this,kitapOzetleriList);

        swipeRefreshLayout = (SwipeRefreshLayout)findViewById(R.id.swipe_reflesh_layout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                new Handler().postDelayed(new Runnable() {
                    @Override public void run() {
                        swipeRefreshLayout.setRefreshing(false);
                        // burada ise Swipe Reflesh olduğunda ne yapacaksanız onu eklemeniz yeterlidir.
                        // Örneğin bir listeyi clear edebilir yada yeniden veri doldurabilirsiniz.

                        kitapOzetleriList.clear();
                        myDatabase.kitaplariListele(kitapOzetleriList);

                        try{
                            kitaplarListView.setAdapter(ozelAdapter);
                        }catch (Exception e){}

                    }
                }, 3000);

            }
        });

        swipeRefreshLayout.setColorSchemeResources(
                android.R.color.holo_blue_bright,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_red_light
        );

        //resim kısmına ne yazılır ise, drawable klasörüne de eklenmesi gerekecek

        try{
            kitaplarListView.setAdapter(ozelAdapter);
        }catch (Exception e){

        }


    }
}
