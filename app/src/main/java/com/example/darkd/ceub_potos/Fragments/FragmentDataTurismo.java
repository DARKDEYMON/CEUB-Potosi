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
import com.example.darkd.ceub_potos.adapters.AdapterEntretenimiento;
import com.example.darkd.ceub_potos.adapters.AdapterRestaurantes;
import com.example.darkd.ceub_potos.adapters.AdapterTurismo;
import com.example.darkd.ceub_potos.clases.Restaurantes;
import com.example.darkd.ceub_potos.clases.Turismo;
import com.example.darkd.ceub_potos.staticDataClases.TurismoData;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDataTurismo extends Fragment {

    private ArrayList<Turismo> arTurismo;
    private AdapterTurismo adTurismo;
    private ListView lstTurismo;

    public FragmentDataTurismo() {
        // Required empty public constructor
        arTurismo = TurismoData.getTurismoData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_data_turismo, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        adTurismo = new AdapterTurismo(getActivity(),arTurismo);
        lstTurismo = (ListView)view.findViewById(R.id.listaturismo);
        lstTurismo.setAdapter(adTurismo);
    }
}