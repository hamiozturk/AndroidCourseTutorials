package com.google.listviewornegi2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetayActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);
        tv = (TextView)findViewById(R.id.textView);
        tv.setText(getIntent().getStringExtra("ulke"));
    }
}
