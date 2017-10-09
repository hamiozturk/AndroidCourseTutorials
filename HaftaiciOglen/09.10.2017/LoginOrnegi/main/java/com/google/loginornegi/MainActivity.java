package com.google.loginornegi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etEmail,etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etEmail = (EditText)findViewById(R.id.etEmail);
        etPassword = (EditText)findViewById(R.id.etPassword);
        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if("a@b.c".equals(etEmail.getText().toString())
                                && "1234".equals(etPassword.getText().toString())
                ){

                    startActivity(new Intent(MainActivity.this,SecondActivity.class));

                }else{

                    Toast.makeText(
                            getApplicationContext(),
                            "HATALI GİRİŞ",
                            Toast.LENGTH_LONG
                    ).show();

                }


            }
        });
    }
}
