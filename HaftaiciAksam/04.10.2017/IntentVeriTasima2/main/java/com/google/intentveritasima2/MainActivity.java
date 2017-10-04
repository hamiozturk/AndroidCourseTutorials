package com.google.intentveritasima2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etYas,etIsim;
    Button btnGecis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        etIsim = (EditText)findViewById(R.id.etIsim);
        etYas = (EditText)findViewById(R.id.etYas);
        btnGecis = (Button)findViewById(R.id.btnGecis);
        btnGecis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,KisiDetayActivity.class);

                ArrayList<Kisi> kisiler = new ArrayList<Kisi>();
                kisiler.add(new Kisi(etIsim.getText().toString(),Integer.parseInt(etYas.getText().toString())));
                i.putExtra("kisiler",kisiler);

                startActivity(i);

            }
        });

    }
}
