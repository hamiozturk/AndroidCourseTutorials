package com.serifgungor.notdefteriuygulamasi;

import java.io.Serializable;

/**
 * Created by user on 16.10.2017.
 */

public class Not implements Serializable {

    private int notId;
    private String baslik;
    private String tarih;
    private String icerik;

    public Not() {
    }

    public Not(String baslik, String tarih, String icerik) {
        this.baslik = baslik;
        this.tarih = tarih;
        this.icerik = icerik;
    }

    public int getNotId() {
        return notId;
    }

    public void setNotId(int notId) {
        this.notId = notId;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getTarih() {
        return tarih;
    }

    public void setTarih(String tarih) {
        this.tarih = tarih;
    }

    public String getIcerik() {
        return icerik;
    }

    public void setIcerik(String icerik) {
        this.icerik = icerik;
    }
}
