package com.example.darkd.ceub_potos.staticDataClases;

import com.example.darkd.ceub_potos.clases.Bancos;
import com.example.darkd.ceub_potos.clases.CentrosSalud;

import java.util.ArrayList;

public class BancosData {
    private static ArrayList<Bancos> bancos = new ArrayList<Bancos>();
    private static boolean llenadoBa = true;

    public static ArrayList<Bancos> getBancos(){
        if (llenadoBa){

            bancos.add(new Bancos(
                "Banco de Credito BCP",
                "Calle Bustillos y Ayacucho",
                "Cajero",
                -19.588973f,
                -65.754494f
            ));

            llenadoBa =false;
        }
        return bancos;
    }
}
