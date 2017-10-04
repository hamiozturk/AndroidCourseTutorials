package com.google.butonatiklamaornek3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;

    public class myClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view) {

            switch (view.getId()){
                case R.id.button:
                    break;
                case R.id.button2:
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
        btn1.setOnClickListener(new myClickListener());
        btn2.setOnClickListener(new myClickListener());

    }
}
