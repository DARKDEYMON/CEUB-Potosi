package com.example.darkd.ceub_potos.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.darkd.ceub_potos.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentMain extends Fragment implements View.OnClickListener {


    public FragmentMain() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ((LinearLayout)view.findViewById(R.id.hotelesin)).setOnClickListener(this);
        ((LinearLayout)view.findViewById(R.id.restaurantesin)).setOnClickListener(this);
        ((LinearLayout)view.findViewById(R.id.centrossaludin)).setOnClickListener(this);
        ((LinearLayout)view.findViewById(R.id.bancosin)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int i = v.getId();
        switch (i){
            case R.id.hotelesin:
                FragmentDataHoteles nextFrag= new FragmentDataHoteles();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contenedor, nextFrag)
                        .addToBackStack(null)
                        .commit();
                break;
            case R.id.restaurantesin:
                FragmentDataRestaurantes nextFrag1= new FragmentDataRestaurantes();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contenedor, nextFrag1)
                        .addToBackStack(null)
                        .commit();
                break;
            case R.id.centrossaludin:
                FragmentDataCentrosSalud nextFrag2= new FragmentDataCentrosSalud();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contenedor, nextFrag2)
                        .addToBackStack(null)
                        .commit();
                break;
            case R.id.bancosin:
                Log.e("aqui","bancos");
                FragmentDataBancos nextFrag3= new FragmentDataBancos();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.contenedor, nextFrag3)
                        .addToBackStack(null)
                        .commit();
                break;
            case R.id.turismoin:

                break;
            case R.id.entretenimiento:

                break;
        }
    }
}
