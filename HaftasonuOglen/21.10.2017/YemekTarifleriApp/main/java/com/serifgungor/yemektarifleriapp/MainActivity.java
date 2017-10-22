package com.serifgungor.yemektarifleriapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import com.serifgungor.yemektarifleriapp.Adapter.TurAdapter;
import com.serifgungor.yemektarifleriapp.Model.Tur;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Tur> turler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView)findViewById(R.id.gridView);

        turler = new ArrayList<>();
        turler.add(new Tur(0,"Çorbalar","corbalar"));
        turler.add(new Tur(0,"Reçeller","tatlilar"));
        turler.add(new Tur(0,"Hamur İşi","borekler"));
        turler.add(new Tur(0,"Etli Yemekler","etliyemekler"));
        turler.add(new Tur(0,"Pizzalar","pizzalar"));
        turler.add(new Tur(0,"Köfteler","kofteler"));

        TurAdapter turAdapter = new TurAdapter(this,turler);
        gridView.setAdapter(turAdapter);
    }
}
