package com.google.aramasmsemailornegi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AramaActivity extends AppCompatActivity {

    EditText etTelNo;
    Button btnAra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arama);

        etTelNo = (EditText)findViewById(R.id.etTelefonNo);
        btnAra = (Button)findViewById(R.id.btnAramaYap);
        btnAra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i;
                Uri number = Uri.parse("tel:"+etTelNo.getText().toString());
                i = new Intent(Intent.ACTION_DIAL,number);
                startActivity(i);
            }
        });

    }
}
