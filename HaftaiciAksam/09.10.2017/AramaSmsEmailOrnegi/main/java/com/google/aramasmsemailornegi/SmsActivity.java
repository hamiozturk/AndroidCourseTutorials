package com.google.aramasmsemailornegi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SmsActivity extends AppCompatActivity {

    EditText etTelNo,etMesaj;
    Button btnGonder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        etTelNo = (EditText)findViewById(R.id.etSmsTelNo);
        etMesaj = (EditText)findViewById(R.id.etSmsMesaj);
        btnGonder = (Button)findViewById(R.id.btnSmsGonder);
        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mesaj = etMesaj.getText().toString();
                String telNo = etTelNo.getText().toString();

               Uri u = Uri.parse("smsto:"+telNo);
               Intent i = new Intent(Intent.ACTION_SENDTO,u);
               i.putExtra("sms_body",mesaj);
               startActivity(i);

            }
        });

    }
}
