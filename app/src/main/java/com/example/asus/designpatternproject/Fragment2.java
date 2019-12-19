package com.example.asus.designpatternproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {
    TextView F2islemci,F2ram,F2kamera,F2boyut,F2isletim,F2batarya,F2hafiza;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment2,container,false);
        Bundle bundle=getArguments();
        F2islemci=view.findViewById(R.id.islemciTelFrag);
        F2ram=view.findViewById(R.id.ramTelFrag);
        F2kamera=view.findViewById(R.id.kameraTelFrag);
        F2boyut=view.findViewById(R.id.boyutTelFrag);
        F2isletim=view.findViewById(R.id.isletimTelFrag);
        F2batarya=view.findViewById(R.id.bataryaTelFrag);
        F2hafiza=view.findViewById(R.id.hafizaTelFrag);

        if(bundle!=null){
            F2islemci.setText(F2islemci.getText()+bundle.getString("islemci2"));
            F2ram.setText(F2ram.getText()+bundle.getString("ram2"));
            F2kamera.setText(F2kamera.getText()+bundle.getString("kamera2"));
            F2boyut.setText(F2boyut.getText()+bundle.getString("boyut2"));
            F2isletim.setText(F2isletim.getText()+bundle.getString("isletim2"));
            F2batarya.setText(F2batarya.getText()+bundle.getString("batarya"));
            F2hafiza.setText(F2hafiza.getText()+bundle.getString("hafiza2"));
        }

        return view;
    }
}
