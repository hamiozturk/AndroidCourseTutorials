package com.google.arraylistveriekleme;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etEleman;
    Button btnEkle,btnListele;
    TextView tvListele;
    ArrayList<String> elemanListesi = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEleman = (EditText)findViewById(R.id.etEleman);
        btnEkle = (Button)findViewById(R.id.btnEkle);
        btnListele = (Button)findViewById(R.id.btnListele);
        tvListele = (TextView)findViewById(R.id.tvEleman);

        btnEkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                elemanListesi.add(etEleman.getText().toString());
            }
        });

        btnListele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder sb = new StringBuilder();
                for(int i=0;i<elemanListesi.size();i++){
                    sb.append(elemanListesi.get(i)+"\n");
                }
                tvListele.setText(sb);
            }
        });


    }
}
