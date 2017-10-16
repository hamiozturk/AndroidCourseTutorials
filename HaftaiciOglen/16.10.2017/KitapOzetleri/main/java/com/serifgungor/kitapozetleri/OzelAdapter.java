package com.serifgungor.kitapozetleri;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by user on 16.10.2017.
 */

public class OzelAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<KitapOzetleri> myList;
    Context context;
    KitapOzetleri kitapOzetleri;

    //CUSTOM LİSTVİEW ADAPTER

    public OzelAdapter(Activity activity, List<KitapOzetleri> kitapOzetleri){
        this.layoutInflater =
                (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.myList = kitapOzetleri;
        context = activity;
    }

    @Override
    public int getCount() {
        return myList.size();
    }

    @Override
    public Object getItem(int i) {
        return myList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        context = viewGroup.getContext();
        View satirGorunumu = layoutInflater.inflate(R.layout.listview_satir_gorunumu,null);

        TextView tvBaslik = (TextView)satirGorunumu.findViewById(R.id.tvBaslik);
        TextView tvYazar = (TextView)satirGorunumu.findViewById(R.id.tvYazar);
        TextView tvSayfaSayisi = (TextView)satirGorunumu.findViewById(R.id.tvSayfaSayisi);
        TextView tvYayinEvi = (TextView)satirGorunumu.findViewById(R.id.tvYayinEvi);
        TextView tvTur = (TextView)satirGorunumu.findViewById(R.id.tvTur);
        ImageView ivResim = (ImageView)satirGorunumu.findViewById(R.id.imageView);
        // listview_satir_gorunumu.xml'deki tüm nesnelerimizin referanslarını tanımladık.

        kitapOzetleri = myList.get(i);
        tvBaslik.setText(kitapOzetleri.getKitapAdi());
        tvYazar.setText(kitapOzetleri.getYazarAdSoyad());
        tvSayfaSayisi.setText(""+kitapOzetleri.getSayfaSayisi());
        tvYayinEvi.setText(kitapOzetleri.getYayinEvi());
        tvTur.setText(kitapOzetleri.getTur());

        int id = context.getApplicationContext().getResources()
                .getIdentifier(kitapOzetleri.getResim(),"drawable",context.getPackageName());
        /*
        R.id. dedikten sonra herhangi bir integer değişken ile birleştirme işlemi yapamayız.
        Kaynak klasörler içerisinde R.drawable. dediğimde bana resim dosyalarının ismi
        dönmekte. getIdentifier metodu sayesinde Resource file'ı belirtilen ve
        paketi belirtilen konumda, String olarak dosya ismini arıyor ve bulduğunda,
        R.drawable.resim1 gibi bize integer olarak Referans adresini dönüyor.

        Aksi durumda resmin referans id'sine doğrudan string ile erişemez ve tanımlayamazdık.

        */

        ivResim.setImageResource(id);

        satirGorunumu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(
                        context,
                        kitapOzetleri.getKitapAdi(),
                        Toast.LENGTH_LONG
                ).show();
            }
        });

        return satirGorunumu;
    }
}
