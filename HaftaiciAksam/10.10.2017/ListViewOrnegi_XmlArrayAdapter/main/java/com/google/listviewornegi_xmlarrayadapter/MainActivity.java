package com.google.listviewornegi_xmlarrayadapter;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setListAdapter(
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,
                        getResources().getStringArray(R.array.ulkeler))
        );

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Toast.makeText(this,l.getAdapter().getItem(position).toString(),Toast.LENGTH_LONG).show();

        /*
         l.getAdapter().getItem(position).toString() ile
         tıklanan Item'ın içerisindeki yazıyı yakalamış olduk.
          */

    }

}
