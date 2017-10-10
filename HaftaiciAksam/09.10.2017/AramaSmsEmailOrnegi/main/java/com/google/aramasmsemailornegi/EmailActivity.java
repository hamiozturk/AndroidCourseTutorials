package com.google.aramasmsemailornegi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmailActivity extends AppCompatActivity {

    EditText etEmail,etKonu,etMesaj;
    Button btnGonder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        etEmail = (EditText)findViewById(R.id.etEmail);
        etKonu = (EditText)findViewById(R.id.etKonu);
        etMesaj = (EditText)findViewById(R.id.etMesajDetay);
        btnGonder = (Button)findViewById(R.id.btnMailGonder);
        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{etEmail.getText().toString()});
                i.putExtra(Intent.EXTRA_SUBJECT,etKonu.getText().toString());
                i.putExtra(Intent.EXTRA_TEXT,etMesaj.getText().toString());
                //.putExtra(Intent.EXTRA_CC, new String[]{ to});
                //.putExtra(Intent.EXTRA_BCC, new String[]{to});
                startActivity(i);

            }
        });

    }
}
