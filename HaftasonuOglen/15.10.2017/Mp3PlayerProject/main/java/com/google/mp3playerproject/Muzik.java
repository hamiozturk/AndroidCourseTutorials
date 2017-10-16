package com.google.mp3playerproject;

public class Muzik {

    private String muzikAdi;
    private String muzikUrl;
    private int muzikResourceUri;
    private String sanatciAdSoyad;
    private String album;
    private int muzikId;
    private String tur;

    public int getMuzikId() {
        return muzikId;
    }

    public void setMuzikId(int muzikId) {
        this.muzikId = muzikId;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public String toString() {
        return muzikAdi;
    }

    public Muzik() {
    }

    public Muzik(String muzikAdi, String muzikUrl, int muzikResourceUri, String sanatciAdSoyad, String album, int muzikId) {
        this.muzikAdi = muzikAdi;
        this.muzikUrl = muzikUrl;
        this.sanatciAdSoyad = sanatciAdSoyad;
        this.album = album;
        this.muzikResourceUri = muzikResourceUri;
        this.muzikId = muzikId;
    }

    public int getMuzikResourceUri() {
        return muzikResourceUri;
    }

    public void setMuzikResourceUri(int muzikResourceUri) {
        this.muzikResourceUri = muzikResourceUri;
    }

    public String getMuzikAdi() {
        return muzikAdi;
    }

    public void setMuzikAdi(String muzikAdi) {
        this.muzikAdi = muzikAdi;
    }

    public String getMuzikUrl() {
        return muzikUrl;
    }

    public void setMuzikUrl(String muzikUrl) {
        this.muzikUrl = muzikUrl;
    }

    public String getSanatciAdSoyad() {
        return sanatciAdSoyad;
    }

    public void setSanatciAdSoyad(String sanatciAdSoyad) {
        this.sanatciAdSoyad = sanatciAdSoyad;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }






}
