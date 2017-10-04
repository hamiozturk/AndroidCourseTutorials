package com.google.imageviewornegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnKedi,btnKopek,btnKus,btnTimsah;
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
            case R.id.btnKus:
                ivResim.setImageResource(R.drawable.kus);
                break;
            case R.id.btnTimsah:
                ivResim.setImageResource(R.drawable.timsah);
                break;
        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKedi = (Button)findViewById(R.id.btnKedi);
        btnKopek = (Button)findViewById(R.id.btnKopek);
        btnKus = (Button)findViewById(R.id.btnKus);
        btnTimsah = (Button)findViewById(R.id.btnTimsah);

        btnKedi.setOnClickListener(this);
        btnKopek.setOnClickListener(this);
        btnKus.setOnClickListener(this);
        btnTimsah.setOnClickListener(this);

        ivResim = (ImageView)findViewById(R.id.ivResim);



    }
}
