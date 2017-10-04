package com.google.linearlayoutforornegi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View view) {
        Toast.makeText(
                getApplicationContext(),
                "Ben buton "+((Button)view).getText(),
                Toast.LENGTH_LONG
        ).show();
    }

    private LinearLayout linearLayout;
    private CheckBox chk;
    private Button btn;

    private void init(){
        linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        for (int i=1; i<=10; ++i){
            if(i%2==0){
                chk = new CheckBox(this);
                chk.setId(i);
                chk.setText("Seçenek "+i);
                linearLayout.addView(chk);
            }else{
                btn = new Button(this);
                btn.setId(i);
                btn.setText("Düğme "+i);
                btn.setOnClickListener(this);
                linearLayout.addView(btn);
            }
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
        setContentView(linearLayout);
        //setContentView(R.layout.activity_main);
    }
}
