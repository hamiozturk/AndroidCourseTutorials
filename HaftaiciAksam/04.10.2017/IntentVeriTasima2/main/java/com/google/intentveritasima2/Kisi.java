package com.google.intentveritasima2;

import java.io.Serializable;

/**
 * Created by user on 4.10.2017.
 */

public class Kisi implements Serializable {

    private String isim;
    private int yas;

    public Kisi(String isim, int yas) {
        this.isim = isim;
        this.yas = yas;
    }

    public String getIsim() {

        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }
}
