package gok.selin.fici;

import java.util.ArrayList;

/**
 * Created by Selin on 11.03.2018.
 */

public class TarifModel {
    String tarifAdi;
    String hazirlamaSuresi;
    int kisiSayisi;
    String malzemeler;
    String yapilisi;
    int logoId;

    public TarifModel(){}

    public TarifModel(String tarifAdi, String hazirlamaSuresi, int kisiSayisi, String malzemeler, String yapilisi, int logoId) {
        this.tarifAdi = tarifAdi;
        this.hazirlamaSuresi = hazirlamaSuresi;
        this.kisiSayisi = kisiSayisi;
        this.malzemeler = malzemeler;
        this.yapilisi = yapilisi;
        this.logoId = logoId;
}

    public String getTarifAdi() {
        return tarifAdi;
    }

    public void setTarifAdi(String tarifAdi) {
        this.tarifAdi = tarifAdi;
    }

    public String getHazirlamaSuresi() {
        return hazirlamaSuresi;
    }

    public void setHazirlamaSuresi(String hazirlamaSuresi) {
        this.hazirlamaSuresi = hazirlamaSuresi;
    }

    public int getKisiSayisi() {
        return kisiSayisi;
    }

    public void setKisiSayisi(int kisiSayisi) {
        this.kisiSayisi = kisiSayisi;
    }

    public String getMalzemeler() {
        return malzemeler;
    }

    public void setMalzemeler(String malzemeler) {
        this.malzemeler = malzemeler;
    }

    public String getYapilisi() {
        return yapilisi;
    }

    public void setYapilisi(String yapilisi) {
        this.yapilisi = yapilisi;
    }

    public int getLogoId() {
        return logoId;
    }

    public void setLogoId(int logoId) {
        this.logoId = logoId;
    }
}
