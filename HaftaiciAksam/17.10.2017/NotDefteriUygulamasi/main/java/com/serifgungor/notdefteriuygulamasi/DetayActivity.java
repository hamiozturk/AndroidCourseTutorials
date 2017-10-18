package com.serifgungor.notdefteriuygulamasi;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DetayActivity extends AppCompatActivity {

    public void notGuncelle(String dbName,int notId,String baslik, String icerik, String tarih){
        SQLiteDatabase db = openOrCreateDatabase(dbName,MODE_PRIVATE,null);
        db.execSQL("update Notlar set Baslik = '"+baslik+"', Icerik = '"+icerik+"', Tarih='"+tarih+"' where id = "+notId);
    }



    Button btnGuncelleDetay;
    EditText etGuncelleBaslik,etGuncelleTarih,etGuncelleNot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detay);

        String gelenDeger = getIntent().getStringExtra("islem");
        final Not not = (Not)getIntent().getSerializableExtra("veri");

        btnGuncelleDetay = (Button)findViewById(R.id.btnGuncelleDetay);
        etGuncelleBaslik = (EditText)findViewById(R.id.etGuncelleBaslik);
        etGuncelleNot = (EditText)findViewById(R.id.etGuncelleNot);
        etGuncelleTarih = (EditText)findViewById(R.id.etGuncelleTarih);

        etGuncelleTarih.setText(not.getTarih());
        etGuncelleNot.setText(not.getIcerik());
        etGuncelleBaslik.setText(not.getBaslik());

        if("goruntule".equals(gelenDeger)){
            this.setTitle("Not Görüntüleme");
            //etGuncelleBaslik.setEnabled(false);
            //etGuncelleNot.setEnabled(false);
            //etGuncelleTarih.setEnabled(false);
            btnGuncelleDetay.setVisibility(View.INVISIBLE); //Butonu gizledik
        }else if("guncelle".equals(gelenDeger)){
            this.setTitle("Not Güncelleme");
        }

        btnGuncelleDetay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notGuncelle(
                        "myDB",
                        not.getNotId(),
                        etGuncelleBaslik.getText().toString(),
                        etGuncelleNot.getText().toString(),
                        etGuncelleTarih.getText().toString()
                );
                Intent intent=new Intent();
                intent.putExtra("not",not);
                setResult(20,intent);
                finish();
            }
        });




    }
}
