package com.example.darkd.ceub_potos.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.darkd.ceub_potos.R;
import com.example.darkd.ceub_potos.StaticData;
import com.example.darkd.ceub_potos.clases.Bancos;
import com.example.darkd.ceub_potos.clases.CentrosSalud;
import com.example.darkd.ceub_potos.staticDataClases.BancosData;
import com.example.darkd.ceub_potos.staticDataClases.CentroSaludData;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMapsBancos extends Fragment implements OnMapReadyCallback {


    public FragmentMapsBancos() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_maps_bancos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment map =(SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        map.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(StaticData.LATITUD,StaticData.ALTURA));
        for(Bancos dat: BancosData.getBancos()){
            map.addMarker(new MarkerOptions().title(dat.getNombre()).snippet("Tipo: "+dat.getTipo()).position(dat.getUbicacion()));
        }
    }
}
