package com.example.darkd.ceub_potos.staticDataClases;

import com.example.darkd.ceub_potos.clases.CentrosSalud;
import com.example.darkd.ceub_potos.clases.Hoteles;

import java.util.ArrayList;

public class CentroSaludData {
    private static ArrayList<CentrosSalud> centrSalud = new ArrayList<CentrosSalud>();
    private static boolean llenadoCs = true;

    static public ArrayList<CentrosSalud> getCentroSaludData(){
        if(llenadoCs){
            centrSalud.add(new CentrosSalud(
                    "Cruz roja filial Potosí",
                    "Zona Central",
                    "",
                    -19.585701f,
                    -65.756766f
                    ));
            llenadoCs = false;
        }
        return centrSalud;
    }
}
