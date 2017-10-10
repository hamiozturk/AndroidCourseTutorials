package com.google.implicitactivityornegi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class TextShareActivity extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_share);

        et = (EditText)findViewById(R.id.etYazi);

        try{
            et.setText(getIntent().getStringExtra(Intent.EXTRA_TEXT).toString());
        }catch (Exception e){
            e.getMessage();
        }




    }
}
