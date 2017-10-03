package com.google.onbackpressed_ornegi;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onBackPressed() {

        /*new AlertDialog.Builder(this)
                .setTitle("Çıkış")
                .setMessage("Uygulamadan çıkmak istiyor musunuz ?")
                .setNegativeButton(android.R.string.no,null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.super.onBackPressed();
                    }
                }).create().show();
                */

        AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setTitle("Çıkış");
        adb.setMessage("Uygulamadan çıkmak istiyor musunuz ?");
        adb.setNegativeButton(android.R.string.no,null);
        adb.setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.super.onBackPressed();
            }
        });
        adb.create();
        adb.show();

    }
}
