package com.example.darkd.ceub_potos.Fragments;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.darkd.ceub_potos.R;
import com.example.darkd.ceub_potos.adapters.AdapterBancos;
import com.example.darkd.ceub_potos.clases.Bancos;
import com.example.darkd.ceub_potos.staticDataClases.BancosData;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDataBancos extends Fragment {

    private ArrayList<Bancos> arBancos;
    private AdapterBancos adBancos;
    private ListView lstbancos;

    public FragmentDataBancos() {
        // Required empty public constructor
        this.arBancos = BancosData.getBancos();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_data_bancos, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e("aqui",arBancos.size()+"");
        adBancos = new AdapterBancos(getActivity(),arBancos);
        lstbancos = view.findViewById(R.id.listbancos);
        lstbancos.setAdapter(adBancos);
    }
}
