package com.example.asus.designpatternproject.Fabrika;

import com.example.asus.designpatternproject.Main2Activity;

public class Bilgisayar implements ITeknobel {
    @Override
    public void urunYarat() {
        Main2Activity.text.setText("Bilgisayar Markaları");
        Main2Activity.bir.setText("MACBOOK");
        Main2Activity.iki.setText("ASUS");
        Main2Activity.uc.setText("LENOVA");
    }
}
