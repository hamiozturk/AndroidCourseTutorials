package com.serifgungor.yemektarifleriapp.Model;

/**
 * Created by user on 21.10.2017.
 */

public class Tur {
    private int id;
    private String baslik;
    private String resim;

    public Tur() {
    }

    public Tur(int id, String baslik, String resim) {
        this.id = id;
        this.baslik = baslik;
        this.resim = resim;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }
}
