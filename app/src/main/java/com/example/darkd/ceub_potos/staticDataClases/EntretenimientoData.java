package com.example.darkd.ceub_potos.staticDataClases;

import com.example.darkd.ceub_potos.clases.Entretenimiento;

import java.util.ArrayList;

public class EntretenimientoData {
    private static ArrayList<Entretenimiento> entretenimiento = new ArrayList<Entretenimiento>();
    private static boolean llenadoen = true;

    public static ArrayList<Entretenimiento> getEnttetenimientoData(){
        if(llenadoen){

            entretenimiento.add(new Entretenimiento(
                "Valentinos",
                "Calle Eduardo Pérez",
                "Discoteca Karaoke",
                -19.579976f,
                -65.767188f
            ));

            llenadoen = false;
        }
        return entretenimiento;
    }
}
