package com.google.ornekson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailActivity extends AppCompatActivity {

    EditText etKonu,etGonderilecekEmail,etIcerik;
    Button btnGonder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        btnGonder = (Button)findViewById(R.id.btnEmailGonder);
        etKonu =(EditText)findViewById(R.id.etKonu);
        etGonderilecekEmail = (EditText)findViewById(R.id.etEmail);
        etIcerik =(EditText)findViewById(R.id.etMesaj);
        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_EMAIL,etGonderilecekEmail.getText().toString());
                i.putExtra(Intent.EXTRA_SUBJECT,etKonu.getText().toString());
                i.putExtra(Intent.EXTRA_TEXT,etIcerik.getText().toString());
                startActivity(i);

            }
        });
    }
}
