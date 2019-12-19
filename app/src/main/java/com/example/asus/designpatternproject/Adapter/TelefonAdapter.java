package com.example.asus.designpatternproject.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.asus.designpatternproject.Models.MTelefon;
import com.example.asus.designpatternproject.R;

import java.util.List;

public class TelefonAdapter extends BaseAdapter {
    Context context;
    List<MTelefon> list;
    TextView islemci,kamera;

    public TelefonAdapter(Context context, List<MTelefon> list) {
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
        kamera=convertView.findViewById(R.id.ekranlay);

        islemci.setText(list.get(position).getIslemci2());
        kamera.setText(list.get(position).getKamera2());

        return convertView;
    }
}
