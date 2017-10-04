package com.google.proje2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnTikla;
    EditText etUsername,etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTikla = (Button)findViewById(R.id.btnTikla);
        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword = (EditText)findViewById(R.id.etPassword);


        btnTikla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if("root".equals(etUsername.getText().toString()) && "1234".equals(etPassword.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Hoşgeldiniz",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Kullanıcı adı veya şifre hatalı",Toast.LENGTH_LONG).show();
                }



            }
        });

    }
}
