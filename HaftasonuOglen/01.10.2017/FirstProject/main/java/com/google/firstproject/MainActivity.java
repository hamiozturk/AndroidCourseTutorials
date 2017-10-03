package com.google.firstproject;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {


    Button btnTikla;
    EditText etAd,etSoyad,etSonuc;
    String adSoyad = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnTikla = (Button) findViewById(R.id.btnTikla);
        etAd = (EditText) findViewById(R.id.etAd);
        etSoyad = (EditText) findViewById(R.id.etSoyad);
        etSonuc = (EditText) findViewById(R.id.etSonuc);

        btnTikla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adSoyad = etAd.getText().toString() + " " + etSoyad.getText().toString();
                etSonuc.setText(adSoyad);
            }
        });


        /*
            İçerisinde bulunduğumuz Activity bir layout'a bağlanmak zorunludur.

             Herhangi bir Activity, setContentView metodu içerisine

             R.layout. şeklinde bir layout dosya ismi yazılarak bağlanır.
             Örneğin: R.layout.activity_main yazdığımızda;
             R -> (Resources(Kaynaklar) içerisinde)
             layout -> layout klasörü içerisinde
             activity_main -> activity_main ismindeki bir layout sayfasını belirtiriz.

             belirttiğimiz sayfa ismi layoutlar içerisine eklenmesi zorunludur.

             Layout dosyalarının içerikleri XML formatta tanımlanır

         */

        String str = "Hello";


        Log.d("Log","BU BİR DEBUG LOG'UDUR.");
        Log.e("Error","BİR HATA OLUŞTU");
        Log.i("Bilgilendirme","BU BİR BİLGİLENDİRME MESAJIDIR.");





    }


}
