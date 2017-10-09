package com.google.ornekson;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SmsActivity extends AppCompatActivity {

    EditText etMesaj,etTelefon;
    Button btnGonder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        etMesaj = (EditText)findViewById(R.id.etMesaj);
        etTelefon = (EditText)findViewById(R.id.etPhone);
        btnGonder =(Button)findViewById(R.id.btnGonder);
        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gonderilecekTelNo = etTelefon.getText().toString();
                String mesaj = etMesaj.getText().toString();

                Uri u = Uri.parse("smsto:"+gonderilecekTelNo);
                Intent i = new Intent(Intent.ACTION_SENDTO,u);
                i.putExtra("sms_body",mesaj);
                startActivity(i);

            }
        });

    }
}
