package com.google.sharedpreferenceornegi;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;
    Button btn;
    SharedPreferences myPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText)findViewById(R.id.etEmail);
        btn = (Button)findViewById(R.id.btnKaydet);

        myPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        et.setText(myPreferences.getString("email",""));
        /*
         myPreference ile doğrudan değerleri get edebiliriz.

         get metotları bizden key ve nullable value(varsayılan değer) ister.
         Eğer değer boş ise hata vermez, bizim yazmış olduğumuz değer gösterilir.

         SharedPreference bize şu kolaylığı sağlar;
         Uygulama içerisinde bir değişiklik yapıp,
         (Örneğin edittext içerisine değer girdik, bu değer uygulama kapanıp tekrar açılınca
         silinmesin de, en son ne yazmış isem o değer gözüksün istiyorsam) tekrar açtığımda
         verilerin son halini görebilirim.

         Uygulama içerisinde bu veriler, uygulama paket kaynağı içerisinde saklanır.
         Verileri uygulamayı silmediğim süre boyunca yada uygulama verilerini temizlemediğim
         süre boyunca saklayabilirim.


          */

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                Shared Preference Editör ile; SharedPref. içine veri eklenebilir, silinebilir

                SharedPreferences nesnesi ile var olan değerleri okuyabiliriz.
                 */
                SharedPreferences.Editor spe = myPreferences.edit();
                spe.putString("email",et.getText().toString());
                spe.commit(); //Tüm değişiklikleri kaydet
            }
        });






    }
}
