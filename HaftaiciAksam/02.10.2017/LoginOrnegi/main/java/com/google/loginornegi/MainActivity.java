package com.google.loginornegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText etUsername,etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button)findViewById(R.id.button);
        etUsername = (EditText)findViewById(R.id.etUsername);
        etPassword = (EditText)findViewById(R.id.etPassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if("root".equals(etUsername.getText().toString())
                && "1234".equals(etPassword.getText().toString())){
                    Toast.makeText(getApplicationContext(),"Hoşgeldin",Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Güle güle",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
