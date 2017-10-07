package com.google.aramasmsemailornegi;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AramaActivity extends AppCompatActivity {

    EditText etTelefonNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arama);

        etTelefonNo = (EditText)findViewById(R.id.etTelNo);
    }

    public void btnAramaYap(View v){
        Intent i;
        Uri number = Uri.parse("tel:"+etTelefonNo.getText().toString());
        i = new Intent(Intent.ACTION_DIAL,number);
        startActivityForResult(i,1);
    }
    public void btnAramaYap2(View v){
        Intent i;
        Uri number = Uri.parse("tel:"+etTelefonNo.getText().toString());
        i = new Intent(Intent.ACTION_DIAL,number);
        startActivityForResult(i,2);
        //startActivity ile aynı işlemi yapar
        //ayrıca Sonuç döndürmek amacıyla da kullanılır.
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case 1:
                Log.d("Log","btnAramaYap'tan geldim");
                Log.d("Log",""+resultCode);
                break;
            case 2:
                Log.d("Log","btnAramaYap2'den geldim");
                Log.d("Log",""+resultCode);
                break;
        }
    }
}
