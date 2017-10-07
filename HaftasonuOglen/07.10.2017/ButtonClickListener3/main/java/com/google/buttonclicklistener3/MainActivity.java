package com.google.buttonclicklistener3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn1){
            Toast.makeText(getApplicationContext(),"Buton1 tıklandı",Toast.LENGTH_LONG).show();
        }else if(view.getId() == R.id.btn2){
            Toast.makeText(getApplicationContext(),"Buton2 tıklandı",Toast.LENGTH_LONG).show();
        }else if(view.getId() == R.id.btn3){
            Toast.makeText(getApplicationContext(),"Buton3 tıklandı",Toast.LENGTH_LONG).show();
        }
    }

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btn1);
        btn2 = (Button)findViewById(R.id.btn2);
        btn3 = (Button)findViewById(R.id.btn3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);



    }
}
