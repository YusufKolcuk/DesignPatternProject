package com.example.asus.designpatternproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.asus.designpatternproject.Database.DatabaseHelper;

public class EdtPC extends AppCompatActivity {
    TextView textView;
    Button butonPC;
    EditText islemciPc,ramPc,ekranPc,boyutPc,isletimPc,hafizaTipPc,hafizaPc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        textView=findViewById(R.id.textPc);
        islemciPc=findViewById(R.id.islemciPc);
        ramPc=findViewById(R.id.ramPc);
        ekranPc=findViewById(R.id.ekranPc);
        boyutPc=findViewById(R.id.boyutPc);
        isletimPc=findViewById(R.id.isletimPc);
        hafizaPc=findViewById(R.id.hafizaPc);
        hafizaTipPc=findViewById(R.id.hafizaTipPc);
        butonPC=findViewById(R.id.butonEditPc);

        if(Main2Activity.bir.isChecked()){
            textView.setText("MACBOOK ÖZELLİKLERİNİZ");
        }
        else if(Main2Activity.iki.isChecked()){
            textView.setText("ASUS ÖZELLİKLERİNİZ");
        }
        else if(Main2Activity.uc.isChecked()){
            textView.setText("LENOVA ÖZELLİKLERİNİZ");
        }
        butonPC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseHelper database=new DatabaseHelper(EdtPC.this);
                database.VeriEkle(islemciPc.getText().toString(),ramPc.getText().toString(),ekranPc.getText().toString(),boyutPc.getText().toString(),isletimPc.getText().toString(),hafizaPc.getText().toString(),hafizaTipPc.getText().toString());
                Intent intent=new Intent(getApplicationContext(),Liste.class);
                startActivity(intent);
            }
        });



    }
}
