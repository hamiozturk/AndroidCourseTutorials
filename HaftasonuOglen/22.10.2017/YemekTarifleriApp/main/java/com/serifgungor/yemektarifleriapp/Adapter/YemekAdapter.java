package com.serifgungor.yemektarifleriapp.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.serifgungor.yemektarifleriapp.Model.Yemek;
import com.serifgungor.yemektarifleriapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by user on 21.10.2017.
 */

public class YemekAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    Context context;
    ArrayList<Yemek> yemekler;


    public  YemekAdapter(Activity activity, ArrayList<Yemek> yemekler){
        this.layoutInflater
                = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.yemekler = yemekler;
        context = activity;
    }


    @Override
    public int getCount() {
        return yemekler.size();
    }

    @Override
    public Object getItem(int i) {
        return yemekler.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        context = viewGroup.getContext();
        View listViewGorunumu =
                layoutInflater.inflate(R.layout.ozellestirilmis_listview_gorunumu,null);

        TextView tvBaslik = (TextView)listViewGorunumu.findViewById(R.id.tvYemekIsim);
        TextView tvHazirlamaSuresi = (TextView)listViewGorunumu.findViewById(R.id.txtHazirlamaSuresi);
        TextView tvPisirmeSuresi = (TextView)listViewGorunumu.findViewById(R.id.txtPisirmeSuresi);
        TextView tvKisiSayisi = (TextView)listViewGorunumu.findViewById(R.id.txtKisiSayisi);
        ImageView ivYemekResim = (ImageView)listViewGorunumu.findViewById(R.id.ivYemekResim);

        int refId = context.getApplicationContext().getResources().getIdentifier(
                yemekler.get(i).getResim(),"drawable",context.getPackageName()
        );
        ivYemekResim.setImageResource(refId);
        tvBaslik.setText(yemekler.get(i).getIsim());
        tvHazirlamaSuresi.setText(""+yemekler.get(i).getHazirlamaSuresi());
        tvPisirmeSuresi.setText(""+yemekler.get(i).getPisirmeSuresi());
        tvKisiSayisi.setText(""+yemekler.get(i).getKacKisilik());

        listViewGorunumu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // YemekDetayActivity

            }
        });



        return listViewGorunumu;
    }
}
