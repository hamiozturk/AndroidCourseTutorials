package com.google.ilkproje;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends Activity {

    Button btnTikla;
    EditText etAd,etSoyad,etSonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTikla = (Button)findViewById(R.id.btnTikla);
        etAd = (EditText)findViewById(R.id.etAd);
        etSoyad = (EditText)findViewById(R.id.etSoyad);
        etSonuc = (EditText)findViewById(R.id.etSonuc);


        btnTikla.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               String ad = etAd.getText().toString();
               //getText.toString() ile EditText nesnesi içerisindeki yazısı yakaladık.
               String soyad = etSoyad.getText().toString();

               etSonuc.setText(ad+" "+soyad);
               //setText ile edittext nesnemiz içerisine yazı gönderdik.


           }
        });




        /*

        setContentView içerisine R.layout.activity_main diyerek;

        R -> Resource(Kaynak) içerisinde,
        layout -> Layout klasörü içerisinde,
        activity_main -> activity_main ismindeki .xml dosyasını tanımlıyoruz.

         */





    }

}
