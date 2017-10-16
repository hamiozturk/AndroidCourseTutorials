package com.google.mp3playerproject;

public class Muzik {

    private String muzikAdi;
    private String muzikUrl;
    private int muzikResourceUri;
    private String sanatciAdSoyad;
    private String album;

    @Override
    public String toString() {
        return muzikAdi;
    }

    public Muzik() {
    }

    public Muzik(String muzikAdi, String muzikUrl, int muzikResourceUri, String sanatciAdSoyad, String album) {
        this.muzikAdi = muzikAdi;
        this.muzikUrl = muzikUrl;
        this.sanatciAdSoyad = sanatciAdSoyad;
        this.album = album;
        this.muzikResourceUri = muzikResourceUri;
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
