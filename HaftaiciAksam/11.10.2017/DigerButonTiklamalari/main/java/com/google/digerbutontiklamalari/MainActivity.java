package com.google.digerbutontiklamalari;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button btnNormalTiklama,btnDokunma,btnUzunBasilma;
    ToggleButton tb;
    Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNormalTiklama = (Button)findViewById(R.id.btnNormalTiklama);
        btnDokunma = (Button)findViewById(R.id.btnDokunma);
        btnUzunBasilma = (Button)findViewById(R.id.btnUzunBasilma);
        tb = (ToggleButton)findViewById(R.id.toggleButton);
        sw = (Switch)findViewById(R.id.switch1);

        btnNormalTiklama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        getApplicationContext(),
                        "Normal tıklama",
                        Toast.LENGTH_SHORT
                ).show();
            }
        });

        btnDokunma.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){
                    Log.d("Log","Butona dokunuyorsunuz");
                }else{
                    Log.d("Log","Butona dokunma bırakıldı");
                }
                return true;
            }
        });

        btnUzunBasilma.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Log.d("Log","UZUN BASILMA İŞLEMİ GERÇEKLEŞTİ");

                if(view.isInTouchMode()){
               //     Log.d("Log","Basılı tutma işlemi gerçekleşti");
                }
                return true;
            }
        });

        tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    Log.d("Log","ToggleButton Checked");
                    sw.setChecked(true);
                }else{
                    Log.d("Log","ToggleButton Unchecked");
                    sw.setChecked(false);
                }
            }
        });

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){
                    Log.d("Log","Switch Checked");
                    tb.setChecked(true);
                }else{
                    Log.d("Log","Switch Unchecked");
                    tb.setChecked(false);
                }
            }
        });





    }
}
