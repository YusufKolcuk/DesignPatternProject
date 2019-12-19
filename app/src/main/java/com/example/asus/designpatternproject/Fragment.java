package com.example.asus.designpatternproject;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment extends android.support.v4.app.Fragment {
    TextView Fislemci,Fram,Fekran,Fboyut,Fisletim,Fhafizatip,Fhafiza;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment,container,false);
        Bundle bundle=getArguments();
        Fislemci=view.findViewById(R.id.islemciPcFrag);
        Fram=view.findViewById(R.id.ramPcFrag);
        Fekran=view.findViewById(R.id.ekranPcFrag);
        Fboyut=view.findViewById(R.id.boyutPcFrag);
        Fisletim=view.findViewById(R.id.isletimPcFrag);
        Fhafizatip=view.findViewById(R.id.hafizaTipPcFrag);
        Fhafiza=view.findViewById(R.id.hafizaPcFrag);

        if(bundle!=null){
            Fislemci.setText(Fislemci.getText()+bundle.getString("islemci"));
            Fram.setText(Fram.getText()+bundle.getString("ram"));
            Fekran.setText(Fekran.getText()+bundle.getString("ekran"));
            Fboyut.setText(Fboyut.getText()+bundle.getString("boyut"));
            Fisletim.setText(Fisletim.getText()+bundle.getString("isletim"));
            Fhafizatip.setText(Fhafizatip.getText()+bundle.getString("hafizaTip"));
            Fhafiza.setText(Fhafiza.getText()+bundle.getString("hafiza"));
        }

        return view;
    }



}
