package com.serifgungor.kitapozetleri;

/**
 * Created by user on 16.10.2017.
 */

public class KitapOzetleri {

    private int id;
    private int sayfaSayisi;
    private int puan;
    private String kitapAdi;
    private String yazarAdSoyad;
    private String yayinEvi;
    private String resim;
    private String tur;
    private String ozet;
    private String dil;
    private String basimTarihi;

    public KitapOzetleri() {
    }

    public KitapOzetleri(int id,int sayfaSayisi, int puan, String kitapAdi, String yazarAdSoyad, String yayinEvi, String resim, String tur, String ozet, String dil, String basimTarihi) {
        this.id = id;
        this.sayfaSayisi = sayfaSayisi;
        this.puan = puan;
        this.kitapAdi = kitapAdi;
        this.yazarAdSoyad = yazarAdSoyad;
        this.yayinEvi = yayinEvi;
        this.resim = resim;
        this.tur = tur;
        this.ozet = ozet;
        this.dil = dil;
        this.basimTarihi = basimTarihi;
    }


    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSayfaSayisi() {
        return sayfaSayisi;
    }

    public void setSayfaSayisi(int sayfaSayisi) {
        this.sayfaSayisi = sayfaSayisi;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getYazarAdSoyad() {
        return yazarAdSoyad;
    }

    public void setYazarAdSoyad(String yazarAdSoyad) {
        this.yazarAdSoyad = yazarAdSoyad;
    }

    public String getYayinEvi() {
        return yayinEvi;
    }

    public void setYayinEvi(String yayinEvi) {
        this.yayinEvi = yayinEvi;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getOzet() {
        return ozet;
    }

    public void setOzet(String ozet) {
        this.ozet = ozet;
    }

    public String getDil() {
        return dil;
    }

    public void setDil(String dil) {
        this.dil = dil;
    }

    public String getBasimTarihi() {
        return basimTarihi;
    }

    public void setBasimTarihi(String basimTarihi) {
        this.basimTarihi = basimTarihi;
    }
}
