package com.example.darkd.ceub_potos.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.darkd.ceub_potos.R;
import com.example.darkd.ceub_potos.clases.Hoteles;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class AdapterHoteles extends BaseAdapter {

    private Context context;
    private ArrayList<Hoteles> aHoteles;

    public AdapterHoteles(Context context, ArrayList<Hoteles> aHoteles) {
        this.context = context;
        this.aHoteles = aHoteles;
    }

    @Override
    public int getCount() {
        return aHoteles.size();
    }

    @Override
    public Object getItem(int position) {
        return aHoteles.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater layout = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layout.inflate(R.layout.adapter_item_hoteles,parent,false);

        Hoteles ho =aHoteles.get(position);
        ImageView i = (ImageView) view.findViewById(R.id.image);
        Log.e("Aqui",ho.getImagen().toString());
        Picasso.with(context).load(ho.getImagen().toString()).into(i);

        ((TextView)view.findViewById(R.id.titulo)).setText(ho.getNombre());
        ((TextView)view.findViewById(R.id.telefono)).setText(ho.getTelefono());
        return view;
    }
}