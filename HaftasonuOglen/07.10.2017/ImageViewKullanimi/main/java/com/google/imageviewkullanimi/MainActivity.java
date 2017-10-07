package com.google.imageviewkullanimi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnKedi,btnKopek,btnKurt,btnKuzu;
    ImageView ivResim;

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnKedi:
                ivResim.setImageResource(R.drawable.kedi);
                break;
            case R.id.btnKopek:
                ivResim.setImageResource(R.drawable.kopek);
                break;
            case R.id.btnKurt:
                ivResim.setImageResource(R.drawable.kurt);
                break;
            case R.id.btnKuzu:
                ivResim.setImageResource(R.drawable.kuzu);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivResim = (ImageView)findViewById(R.id.resim);
        btnKedi = (Button)findViewById(R.id.btnKedi);
        btnKopek = (Button)findViewById(R.id.btnKopek);
        btnKurt = (Button)findViewById(R.id.btnKurt);
        btnKuzu = (Button)findViewById(R.id.btnKuzu);

        btnKedi.setOnClickListener(this);
        btnKurt.setOnClickListener(this);
        btnKopek.setOnClickListener(this);
        btnKuzu.setOnClickListener(this);
    }


}
