package com.serifgungor.yemektarifleriapp.Model;

/**
 * Created by user on 21.10.2017.
 */

public class Yemek {
    private int id;
    private int kacKisilik;
    private int pisirmeSuresi;
    private int hazirlamaSuresi;
    private int kalori;
    private String resim;
    private int turId;
    private String isim;
    private String yapilisi;
    private String[] malzemeler;

    public Yemek() {
    }

    public Yemek(int id, int kacKisilik, int pisirmeSuresi, int hazirlamaSuresi, int kalori, String resim, int turId, String isim, String yapilisi, String[] malzemeler) {
        this.id = id;
        this.kacKisilik = kacKisilik;
        this.pisirmeSuresi = pisirmeSuresi;
        this.hazirlamaSuresi = hazirlamaSuresi;
        this.kalori = kalori;
        this.resim = resim;
        this.turId = turId;
        this.isim = isim;
        this.yapilisi = yapilisi;
        this.malzemeler = malzemeler;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getKacKisilik() {
        return kacKisilik;
    }

    public void setKacKisilik(int kacKisilik) {
        this.kacKisilik = kacKisilik;
    }

    public int getPisirmeSuresi() {
        return pisirmeSuresi;
    }

    public void setPisirmeSuresi(int pisirmeSuresi) {
        this.pisirmeSuresi = pisirmeSuresi;
    }

    public int getHazirlamaSuresi() {
        return hazirlamaSuresi;
    }

    public void setHazirlamaSuresi(int hazirlamaSuresi) {
        this.hazirlamaSuresi = hazirlamaSuresi;
    }

    public int getKalori() {
        return kalori;
    }

    public void setKalori(int kalori) {
        this.kalori = kalori;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }

    public int getTurId() {
        return turId;
    }

    public void setTurId(int turId) {
        this.turId = turId;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getYapilisi() {
        return yapilisi;
    }

    public void setYapilisi(String yapilisi) {
        this.yapilisi = yapilisi;
    }

    public String[] getMalzemeler() {
        return malzemeler;
    }

    public void setMalzemeler(String[] malzemeler) {
        this.malzemeler = malzemeler;
    }
}
