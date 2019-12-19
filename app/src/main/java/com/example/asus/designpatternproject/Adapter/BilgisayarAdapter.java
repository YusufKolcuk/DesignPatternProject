package com.example.asus.designpatternproject.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.asus.designpatternproject.Models.MBilgisayar;
import com.example.asus.designpatternproject.R;

import java.util.List;

public class BilgisayarAdapter extends BaseAdapter {
    Context context;
    List<MBilgisayar> list;
    TextView islemci,ekran;

    public BilgisayarAdapter(Context context, List<MBilgisayar> list) {
        this.context = context;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=LayoutInflater.from(context).inflate(R.layout.layout,parent,false);

        islemci=convertView.findViewById(R.id.islemcilay);
        ekran=convertView.findViewById(R.id.ekranlay);

        islemci.setText(islemci.getText()+list.get(position).getIslemci());
        ekran.setText(ekran.getText()+list.get(position).getEkran());

        return convertView;    }
}
