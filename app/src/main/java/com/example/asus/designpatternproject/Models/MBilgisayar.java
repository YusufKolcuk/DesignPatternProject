package com.example.asus.designpatternproject.Models;

public class MBilgisayar {

    private String islemci;
    private String ram;
    private String ekran;
    private String boyut;
    private String isletimSis;
    private String hafizaTip;
    private String hafiza;

    public MBilgisayar(String islemci, String ekran) {
        this.islemci = islemci;
        this.ekran = ekran;
    }

    public MBilgisayar(String islemci, String ram, String ekran, String boyut, String isletimSis, String hafizaTip, String hafiza) {
        this.islemci = islemci;
        this.ram = ram;
        this.ekran = ekran;
        this.boyut = boyut;
        this.isletimSis = isletimSis;
        this.hafizaTip = hafizaTip;
        this.hafiza = hafiza;
    }



    public String getIslemci() {
        return islemci;
    }

    public void setIslemci(String islemci) {
        this.islemci = islemci;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getEkran() {
        return ekran;
    }

    public void setEkran(String ekran) {
        this.ekran = ekran;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public String getIsletimSis() {
        return isletimSis;
    }

    public void setIsletimSis(String isletimSis) {
        this.isletimSis = isletimSis;
    }

    public String getHafizaTip() {
        return hafizaTip;
    }

    public void setHafizaTip(String hafizaTip) {
        this.hafizaTip = hafizaTip;
    }

    public String getHafiza() {
        return hafiza;
    }

    public void setHafiza(String hafiza) {
        this.hafiza = hafiza;
    }
}
