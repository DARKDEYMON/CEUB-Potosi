package com.example.darkd.ceub_potos.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.darkd.ceub_potos.R;
import com.example.darkd.ceub_potos.clases.Hoteles;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDetailHoteles extends Fragment {

    private Hoteles hotel;

    public FragmentDetailHoteles() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_detail_hoteles, container, false);

        hotel = new Gson().fromJson(getArguments().getString("hotel"),Hoteles.class);

        ImageView i = (ImageView) view.findViewById(R.id.imagen);
        Picasso.with(getContext()).load(hotel.getImagen().toString()).into(i);

        TextView t =(TextView)view.findViewById(R.id.nombre);
        t.setText(hotel.getNombre());
        return view;
    }

}
