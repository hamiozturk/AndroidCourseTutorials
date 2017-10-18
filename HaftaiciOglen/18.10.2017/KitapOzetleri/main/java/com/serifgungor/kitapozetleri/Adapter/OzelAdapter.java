package com.serifgungor.kitapozetleri.Adapter;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.serifgungor.kitapozetleri.KitapOzetleri;
import com.serifgungor.kitapozetleri.OzetGuncelleActivity;
import com.serifgungor.kitapozetleri.R;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
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

    public static Bitmap getBitmapFromURL(String src) {
        try {
            URL url = new URL(src);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
            return myBitmap;
        } catch (IOException e) {
            // Log exception
            return null;
        }
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

        /*
        int id = context.getApplicationContext().getResources()
                .getIdentifier(kitapOzetleri.getResim(),"drawable",context.getPackageName());

        R.id. dedikten sonra herhangi bir integer değişken ile birleştirme işlemi yapamayız.
        Kaynak klasörler içerisinde R.drawable. dediğimde bana resim dosyalarının ismi
        dönmekte. getIdentifier metodu sayesinde Resource file'ı belirtilen ve
        paketi belirtilen konumda, String olarak dosya ismini arıyor ve bulduğunda,
        R.drawable.resim1 gibi bize integer olarak Referans adresini dönüyor.

        Aksi durumda resmin referans id'sine doğrudan string ile erişemez ve tanımlayamazdık.

        */

        try{
            ivResim.setImageBitmap(getBitmapFromURL(kitapOzetleri.getResim()));
        }catch (Exception e){

        }


        satirGorunumu.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(final View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(view.getContext());
                builder.setTitle("İşlem seçiniz");
                builder.setMessage("Lütfen işlemi seçiniz");
                builder.setNegativeButton("Düzenle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(view.getContext(), OzetGuncelleActivity.class);
                        intent.putExtra("islem","guncelle");
                        intent.putExtra("id",kitapOzetleri.getId());
                        view.getContext().startActivity(intent);

                    }
                });
                builder.setPositiveButton("Görüntüle", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(view.getContext(), OzetGuncelleActivity.class);
                        intent.putExtra("islem","goruntule");
                        intent.putExtra("id",kitapOzetleri.getId());
                        view.getContext().startActivity(intent);
                    }
                });
                builder.create();
                builder.show();




                return false;
            }
        });

        return satirGorunumu;
    }
}
