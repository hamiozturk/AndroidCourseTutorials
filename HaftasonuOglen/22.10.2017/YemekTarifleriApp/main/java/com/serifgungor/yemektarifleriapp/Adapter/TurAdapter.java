package com.serifgungor.yemektarifleriapp.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.serifgungor.yemektarifleriapp.Model.Tur;
import com.serifgungor.yemektarifleriapp.R;
import com.serifgungor.yemektarifleriapp.YemekActivity;

import java.util.ArrayList;

/**
 * Created by user on 21.10.2017.
 */

public class TurAdapter extends BaseAdapter {
    LayoutInflater layoutInflater;
    Context context;
    ArrayList<Tur> yemekTurleri = new ArrayList<>();

    public TurAdapter(Activity activity, ArrayList<Tur> yemekTurleri){
        this.layoutInflater =
                (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.context = activity;
        this.yemekTurleri = yemekTurleri;
    }

    @Override
    public int getCount() {
        return yemekTurleri.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        context = viewGroup.getContext();
        View gridGorunumu =
                layoutInflater.inflate(R.layout.ozellestirilmis_gridview_gorunumu,null);

        ImageView ivResim = (ImageView)gridGorunumu.findViewById(R.id.ivResim);
        TextView tvBaslik = (TextView)gridGorunumu.findViewById(R.id.textView);

        int refId = context.getApplicationContext().getResources().getIdentifier(
                yemekTurleri.get(i).getResim(),"drawable",context.getPackageName()
        );

        ivResim.setImageResource(refId);
        tvBaslik.setText(yemekTurleri.get(i).getBaslik());

        gridGorunumu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(
                            context,yemekTurleri.get(i).getBaslik(),Toast.LENGTH_LONG
                    ).show();
                    Intent intent = new Intent(context, YemekActivity.class);
                    intent.putExtra("turId",yemekTurleri.get(i).getId());
                    context.startActivity(intent);
                }
        });


        return gridGorunumu;
    }
}
