package com.google.startactivityforresult_cameraornegi;

import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView photo;
    Button btn;

    @Override
    public void onClick(View view) {
        Intent i = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(i,100);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        try{
            if (requestCode==100){
                Bitmap image = (Bitmap)data.getExtras().get("data");
                photo.setImageBitmap(image);
            }else if (resultCode == RESULT_CANCELED){
                Toast.makeText(
                        this,
                        "Kamera desteklenmiyor yada işlemi iptal ettiniz",
                        Toast.LENGTH_SHORT
                ).show();
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button)findViewById(R.id.button);
        photo = (ImageView)findViewById(R.id.imageView);
        btn.setOnClickListener(this);


    }
}
