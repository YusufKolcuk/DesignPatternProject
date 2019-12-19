package com.example.asus.designpatternproject.Fabrika;

import com.example.asus.designpatternproject.Main2Activity;

public class Telefon implements ITeknobel {
    @Override
    public void urunYarat() {
        Main2Activity.text.setText("Telefon Markaları");
        Main2Activity.bir.setText("IPHONE");
        Main2Activity.iki.setText("SAMSUNG");
        Main2Activity.uc.setText("HUAWEI");
    }
}
