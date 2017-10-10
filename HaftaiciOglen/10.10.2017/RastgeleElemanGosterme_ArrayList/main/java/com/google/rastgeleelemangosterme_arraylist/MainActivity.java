package com.google.rastgeleelemangosterme_arraylist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Button btnElemanEkle,btnElemanListele;
    TextView tvEleman;
    EditText etEleman;

    ArrayList<String> liste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        liste = new ArrayList<String>();

        etEleman =(EditText)findViewById(R.id.etEleman);
        tvEleman =(TextView)findViewById(R.id.textView);
        btnElemanEkle =(Button)findViewById(R.id.btnElemanEkle);
        btnElemanListele=(Button)findViewById(R.id.btnListele);

        btnElemanEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                liste.add(etEleman.getText().toString());
                etEleman.setText("");
            }
        });

        btnElemanListele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnd = new Random();
                int rastgeleSayi = rnd.nextInt(liste.size());
                tvEleman.setText(""+liste.get(rastgeleSayi));
            }
        });

    }
}
