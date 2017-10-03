package com.google.anonymousebuttonclickhandler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private class myClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {

            switch (view.getId()){

                case R.id.button:
                    Toast.makeText(getApplicationContext(),"Button1'den geldim",Toast.LENGTH_LONG).show();
                    break;

                case R.id.button2:
                    Toast.makeText(getApplicationContext(),"Button2'den geldim",Toast.LENGTH_LONG).show();
                    break;

                case R.id.button3:
                    Toast.makeText(getApplicationContext(),"Button3'den geldim",Toast.LENGTH_LONG).show();
                    break;

            }

        }
    }

    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.button);
        btn2 = (Button)findViewById(R.id.button2);
        btn3 = (Button)findViewById(R.id.button3);

        btn1.setOnClickListener(new myClickListener());
        btn2.setOnClickListener(new myClickListener());
        btn3.setOnClickListener(new myClickListener());
    }
}
