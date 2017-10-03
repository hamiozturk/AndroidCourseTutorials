package com.google.imageviewornegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

    ImageView ivResim;
    Button btnKedi,btnKopek,btnKus,btnTimsah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivResim = (ImageView)findViewById(R.id.ivResim);
        btnKedi = (Button)findViewById(R.id.btnKedi);
        btnKopek = (Button)findViewById(R.id.btnKopek);
        btnKus = (Button)findViewById(R.id.btnKus);
        btnTimsah = (Button)findViewById(R.id.btnTimsah);

        btnTimsah.setOnClickListener(this);
        btnKus.setOnClickListener(this);
        btnKopek.setOnClickListener(this);
        btnKedi.setOnClickListener(this);

    }
}
