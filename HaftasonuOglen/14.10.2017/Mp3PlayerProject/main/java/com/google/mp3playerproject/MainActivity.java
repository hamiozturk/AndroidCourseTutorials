package com.google.mp3playerproject;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button btnArama;
    AutoCompleteTextView actv;
    /*
    AutoCompleteTextView; içerisine girilen herhangi bir karakterden sonra
    bize adapter yardımıyla kelime önerisi sunabilen bir nesnedir.

    Öneriye doğrudan tıklayıp, EditText içerisine en hızlı şekilde yazı yazabilmeye
    olanak tanır.
     */


    String[] muzikler = {"amuzik","amuzik2","amuzik3","cmuzik","fmuzik"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        actv = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,android.R.layout.select_dialog_item,muzikler
        );

        actv.setThreshold(1); //Kaç karakter girilince öneri sunsun ?
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
