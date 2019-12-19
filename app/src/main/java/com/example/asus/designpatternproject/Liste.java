package com.example.asus.designpatternproject;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.asus.designpatternproject.Adapter.BilgisayarAdapter;
import com.example.asus.designpatternproject.Database.DatabaseHelper;
import com.example.asus.designpatternproject.Models.MBilgisayar;

import java.util.ArrayList;
import java.util.List;

public class Liste extends AppCompatActivity {
    ListView listem;
    List<MBilgisayar> list;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste);
        listem=findViewById(R.id.listem);
        fragmentManager=getSupportFragmentManager();
        DatabaseHelper db=new DatabaseHelper(Liste.this);
        list=new ArrayList<>();
        list=db.veriListele();
        BilgisayarAdapter bilgisayarAdapter=new BilgisayarAdapter(Liste.this,list);
        listem.setAdapter(bilgisayarAdapter);

        listem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle=new Bundle();
                // String deneme=String.valueOf(parent.getItemAtPosition(position));
                String islemciq,ramq,ekranq,boyutq,isletimq,hafizaTipq,hafizaq;
                // Log.e("rewq",list.get(position).getIslemci());
                islemciq=list.get(position).getIslemci();
                ramq=list.get(position).getRam();
                ekranq=list.get(position).getEkran();
                boyutq=list.get(position).getBoyut();
                isletimq=list.get(position).getIsletimSis();
                hafizaTipq=list.get(position).getHafizaTip();
                hafizaq=list.get(position).getHafiza();

                bundle.putString("islemci",islemciq);
                bundle.putString("ram",ramq);
                bundle.putString("ekran",ekranq);
                bundle.putString("boyut",boyutq);
                bundle.putString("isletim",isletimq);
                bundle.putString("hafizaTip",hafizaTipq);
                bundle.putString("hafiza",hafizaq);

                Fragment fragment=new Fragment();
                fragment.setArguments(bundle);
                FragmentTransaction transaction=fragmentManager.beginTransaction();
                transaction.add(R.id.frame,fragment,"fragment");
                transaction.commit();
            }
        });
    }
}
