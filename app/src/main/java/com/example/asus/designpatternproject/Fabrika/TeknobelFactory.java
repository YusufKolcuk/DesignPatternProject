package com.example.asus.designpatternproject.Fabrika;

public class TeknobelFactory {
    public static ITeknobel createTekno(EnumTelBil telBil){
        if(EnumTelBil.Bilgisayar==telBil){
            return new Bilgisayar();
        }
        else if(EnumTelBil.Telefon==telBil){
            return new Telefon();
        }
        else{
            return null;
        }

    }
}
