package com.example.darkd.ceub_potos.Fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.darkd.ceub_potos.R;
import com.example.darkd.ceub_potos.adapters.AdapterCentroSalud;
import com.example.darkd.ceub_potos.adapters.AdapterRestaurantes;
import com.example.darkd.ceub_potos.clases.CentrosSalud;
import com.example.darkd.ceub_potos.clases.Restaurantes;
import com.example.darkd.ceub_potos.staticDataClases.CentroSaludData;

import java.util.ArrayList;


public class FragmentDataCentrosSalud extends Fragment {

    private ArrayList<CentrosSalud> arCentroSalud;
    private AdapterCentroSalud adCentroSalud;
    private ListView lstCentroSalud;

    public FragmentDataCentrosSalud() {
        this.arCentroSalud = CentroSaludData.getCentroSaludData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_data_centros_salud, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adCentroSalud = new AdapterCentroSalud(getActivity(),arCentroSalud);
        lstCentroSalud = view.findViewById(R.id.listcentrosalud);
        lstCentroSalud.setAdapter(adCentroSalud);

    }
}