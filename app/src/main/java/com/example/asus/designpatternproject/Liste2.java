package com.example.asus.designpatternproject;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import com.example.asus.designpatternproject.Adapter.TelefonAdapter;
import com.example.asus.designpatternproject.Database.DatabaseHelper;
import com.example.asus.designpatternproject.Models.MTelefon;

import java.util.ArrayList;
import java.util.List;

public class Liste2 extends AppCompatActivity {
    ListView listem;
    List<MTelefon> list;
    FragmentManager fragmentManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste2);
        listem=findViewById(R.id.listem2);
        fragmentManager=getSupportFragmentManager();
        DatabaseHelper db=new DatabaseHelper(Liste2.this);
        list=new ArrayList<>();
        list=db.veriListeleTel();
        TelefonAdapter telefonAdapter=new TelefonAdapter(Liste2.this,list);
        listem.setAdapter(telefonAdapter);

        listem.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Bundle bundle=new Bundle();
                String islemciq2,ramq2,kameraq2,boyutq2,isletimq2,bataryaq2,hafizaq2;
                islemciq2=list.get(position).getIslemci2();
                ramq2=list.get(position).getRam2();
                kameraq2=list.get(position).getKamera2();
                boyutq2=list.get(position).getBoyut2();
                isletimq2=list.get(position).getIsletimSis2();
                bataryaq2=list.get(position).getBatarya2();
                hafizaq2=list.get(position).getHafiza2();

                bundle.putString("islemci2",islemciq2);
                bundle.putString("ram2",ramq2);
                bundle.putString("kamera2",kameraq2);
                bundle.putString("boyut2",boyutq2);
                bundle.putString("isletim2",isletimq2);
                bundle.putString("batarya2",bataryaq2);
                bundle.putString("hafiza2",hafizaq2);

                Fragment2 fragment=new Fragment2();
                fragment.setArguments(bundle);
                FragmentTransaction transaction=fragmentManager.beginTransaction();
                transaction.add(R.id.frame2,fragment,"fragment2");
                transaction.commit();

            }
        });
    }
}
