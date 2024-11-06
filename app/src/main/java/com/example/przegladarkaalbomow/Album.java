package com.example.przegladarkaalbomow;

public class Album {
    private String wykonawca;
    private String nazwaUtworu;
    private int rok;
    private int liczbaUwtworow;
    private int pobrania;

    public Album(String wykonawca, String nazwaUtworu, int rok, int liczbaUwtworow, int pobrania) {
        this.wykonawca = wykonawca;
        this.nazwaUtworu = nazwaUtworu;
        this.rok = rok;
        this.liczbaUwtworow = liczbaUwtworow;
        this.pobrania = pobrania;
    }

    public void zwiekszPobrania(){
        pobrania++;
    }


    public String getWykonawca() {
        return wykonawca;
    }

    public String getNazwaUtworu() {
        return nazwaUtworu;
    }

    public int getRok() {
        return rok;
    }

    public int getLiczbaUwtworow() {
        return liczbaUwtworow;
    }

    public int getPobrania() {
        return pobrania;
    }
}
