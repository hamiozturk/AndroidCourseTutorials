package com.google.butonatiklamaornek4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn1,btn2;

    @Override
    public void onClick(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button3);
        btn2 = (Button)findViewById(R.id.button4);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
       

    }
}
