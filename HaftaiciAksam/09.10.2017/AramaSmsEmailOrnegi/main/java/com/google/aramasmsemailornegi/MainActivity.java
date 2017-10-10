package com.google.aramasmsemailornegi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnAra:
                Intent i = new Intent(MainActivity.this,AramaActivity.class);
                startActivity(i);
                break;
            case R.id.btnEmail:
                startActivity(new Intent(MainActivity.this,EmailActivity.class));
                break;
            case R.id.btnSms:
                startActivity(new Intent(MainActivity.this,SmsActivity.class));
                break;
            case R.id.btnRehber:
                startActivity(new Intent(MainActivity.this,RehberActivity.class));
                break;
        }
    }

    Button btnArama,btnSms,btnRehber,btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArama = (Button)findViewById(R.id.btnAra);
        btnSms = (Button)findViewById(R.id.btnSms);
        btnRehber = (Button)findViewById(R.id.btnRehber);
        btnEmail = (Button)findViewById(R.id.btnEmail);

        btnArama.setOnClickListener(this);
        btnRehber.setOnClickListener(this);
        btnSms.setOnClickListener(this);
        btnEmail.setOnClickListener(this);




    }
}
