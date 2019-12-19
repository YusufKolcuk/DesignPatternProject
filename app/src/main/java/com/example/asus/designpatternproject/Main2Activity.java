package com.example.asus.designpatternproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.designpatternproject.Database.DatabaseHelper;
import com.example.asus.designpatternproject.Fabrika.EnumTelBil;
import com.example.asus.designpatternproject.Fabrika.ITeknobel;
import com.example.asus.designpatternproject.Fabrika.TeknobelFactory;

public class Main2Activity extends AppCompatActivity {
    public static TextView text;
    public static RadioButton bir,iki,uc;
    Button buton,listele,urunYolla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        buton=findViewById(R.id.butonUrun);
        listele=findViewById(R.id.butonListele);
        urunYolla=findViewById(R.id.UrunYolla);
        text=findViewById(R.id.text2);
        bir=findViewById(R.id.bir);
        iki=findViewById(R.id.iki);
        uc=findViewById(R.id.uc);
        {
            if (MainActivity.pc.isChecked()) {
                ITeknobel bilgisayar = TeknobelFactory.createTekno(EnumTelBil.Bilgisayar);
                bilgisayar.urunYarat();

            }
            if (MainActivity.tel.isChecked()) {
                ITeknobel telefon = TeknobelFactory.createTekno(EnumTelBil.Telefon);
                telefon.urunYarat();
            }
        }
        UrunSayfasi();
        listele();
        urunYolla();




    }
    public void UrunSayfasi(){
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bir.getText().equals("MACBOOK")||iki.getText().equals("ASUS")||uc.getText().equals("LENOVA")){
                    Intent intent=new Intent(getApplicationContext(),EdtPC.class);
                    startActivity(intent);
                }
                else if(bir.getText().equals("IPHONE")||iki.getText().equals("SAMSUNG")||uc.getText().equals("HUAWEI")){
                    Intent intent=new Intent(getApplicationContext(),EdtTL.class);
                    startActivity(intent);
                }
            }
        });

    }
    public void listele(){
        listele.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(bir.getText().equals("MACBOOK")||iki.getText().equals("ASUS")||uc.getText().equals("LENOVA")){
                    Intent intent=new Intent(getApplicationContext(),Liste.class);
                    startActivity(intent);
                }
                else if(bir.getText().equals("IPHONE")||iki.getText().equals("SAMSUNG")||uc.getText().equals("HUAWEI")){
                    Intent intent=new Intent(getApplicationContext(),Liste2.class);
                    startActivity(intent);
                }
            }
        });
    }

    public void urunYolla(){
        urunYolla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  DatabaseHelper databaseHelper=new DatabaseHelper(Main2Activity.this);
                if(bir.getText().equals("MACBOOK")||iki.getText().equals("ASUS")||uc.getText().equals("LENOVA")){
                    DataSingleton.dataCreate().getData(Main2Activity.this).veriSilPc();
                    Toast.makeText(getApplicationContext(),"Ürünler Alıcılarına Yollandı",Toast.LENGTH_LONG).show();
                }
                else if(bir.getText().equals("IPHONE")||iki.getText().equals("SAMSUNG")||uc.getText().equals("HUAWEI")){
                    DataSingleton.dataCreate().getData(Main2Activity.this).veriSilTel();
                    Toast.makeText(getApplicationContext(),"Ürünler Alıcılarına Yollandı",Toast.LENGTH_LONG).show();
                }
            }
        });

    }

}
