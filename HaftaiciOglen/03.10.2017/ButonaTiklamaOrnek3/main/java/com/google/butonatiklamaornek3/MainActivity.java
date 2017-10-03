package com.google.butonatiklamaornek3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3;

    public class myClickListener implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.button:
                    Toast.makeText(getApplicationContext(),"Buton1'den tıklandı",Toast.LENGTH_LONG).show();
                    break;
                case R.id.button2:
                    Toast.makeText(getApplicationContext(),"Buton2'den tıklandı",Toast.LENGTH_LONG).show();
                    break;
                case R.id.button3:
                    Toast.makeText(getApplicationContext(),"Buton3'den tıklandı",Toast.LENGTH_LONG).show();
                    break;
            }
        }
    }

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
