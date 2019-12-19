package com.example.asus.designpatternproject.Models;

public class MTelefon {
    private String islemci2;
    private String ram2;
    private String kamera2;
    private String boyut2;
    private String isletimSis2;
    private String batarya2;
    private String hafiza2;

    public MTelefon(String islemci2, String kamera2) {
        this.islemci2 = islemci2;
        this.kamera2 = kamera2;
    }

    public MTelefon(String islemci2, String ram2, String kamera2, String boyut2, String isletimSis2, String batarya2, String hafiza2) {
        this.islemci2 = islemci2;
        this.ram2 = ram2;
        this.kamera2 = kamera2;
        this.boyut2 = boyut2;
        this.isletimSis2 = isletimSis2;
        this.batarya2 = batarya2;
        this.hafiza2 = hafiza2;
    }

    public String getIslemci2() {
        return islemci2;
    }

    public void setIslemci2(String islemci2) {
        this.islemci2 = islemci2;
    }

    public String getRam2() {
        return ram2;
    }

    public void setRam2(String ram2) {
        this.ram2 = ram2;
    }

    public String getKamera2() {
        return kamera2;
    }

    public void setKamera2(String kamera2) {
        this.kamera2 = kamera2;
    }

    public String getBoyut2() {
        return boyut2;
    }

    public void setBoyut2(String boyut2) {
        this.boyut2 = boyut2;
    }

    public String getIsletimSis2() {
        return isletimSis2;
    }

    public void setIsletimSis2(String isletimSis2) {
        this.isletimSis2 = isletimSis2;
    }

    public String getBatarya2() {
        return batarya2;
    }

    public void setBatarya2(String batarya2) {
        this.batarya2 = batarya2;
    }

    public String getHafiza2() {
        return hafiza2;
    }

    public void setHafiza2(String hafiza2) {
        this.hafiza2 = hafiza2;
    }
}
