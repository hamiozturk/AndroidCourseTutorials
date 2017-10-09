package com.google.intentilesayfalararasigecis_veveritasima;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SonucActivity extends AppCompatActivity {

    EditText etSonuc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonuc);

        etSonuc = (EditText)findViewById(R.id.etSonuc);
        etSonuc.setText(""+getIntent().getIntExtra("sonuc",0));
    }
}
