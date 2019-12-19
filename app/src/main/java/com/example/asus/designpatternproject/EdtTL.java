package com.example.asus.designpatternproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.asus.designpatternproject.Database.DatabaseHelper;

public class EdtTL extends AppCompatActivity {
     TextView textView;
    Button butonTel;
    EditText islemciTel,ramTel,kameraTel,boyutTel,isletimTel,bataryaTel,hafizaTel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        textView=findViewById(R.id.textTel);

        islemciTel=findViewById(R.id.islemciTel);
        ramTel=findViewById(R.id.ramTel);
        kameraTel=findViewById(R.id.kameraTel);
        boyutTel=findViewById(R.id.boyutTel);
        isletimTel=findViewById(R.id.isletimTel);
        bataryaTel=findViewById(R.id.bataryaTel);
        hafizaTel=findViewById(R.id.hafizaTel);
        butonTel=findViewById(R.id.butonEditTel);

        if(Main2Activity.bir.isChecked()){
            textView.setText("IPHONE ÖZELLİKLERİNİZ");
        }
        else if(Main2Activity.iki.isChecked()){
            textView.setText("SAMSUNG ÖZELLİKLERİNİZ");
        }
        else if(Main2Activity.uc.isChecked()){
            textView.setText("HUAWEI ÖZELLİKLERİNİZ");
        }
        butonTel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DatabaseHelper database=new DatabaseHelper(EdtTL.this);
                database.VeriEkleTel(islemciTel.getText().toString(),ramTel.getText().toString(),kameraTel.getText().toString(),boyutTel.getText().toString(),isletimTel.getText().toString(),bataryaTel.getText().toString(),hafizaTel.getText().toString());
                Intent intent=new Intent(getApplicationContext(),Liste2.class);
                startActivity(intent);
            }
        });
    }
}
