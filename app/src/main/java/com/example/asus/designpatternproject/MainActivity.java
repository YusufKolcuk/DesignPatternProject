package com.example.asus.designpatternproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.asus.designpatternproject.Fabrika.EnumTelBil;
import com.example.asus.designpatternproject.Fabrika.ITeknobel;
import com.example.asus.designpatternproject.Fabrika.TeknobelFactory;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    static RadioButton pc,tel;
    Button buton;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.radioGroup);
        pc=findViewById(R.id.Bilgisayar);
        tel=findViewById(R.id.Telefon);
        buton=findViewById(R.id.buton);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);

            }
        });
    }



}
