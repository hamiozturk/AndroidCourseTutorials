package com.google.implicitactivityornegi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv =(ImageView)findViewById(R.id.imageView);

        try {
            iv.setImageURI((Uri) getIntent().getExtras().get(Intent.EXTRA_STREAM));
        }catch (Exception e){
            e.getMessage();
        }


    }
}
