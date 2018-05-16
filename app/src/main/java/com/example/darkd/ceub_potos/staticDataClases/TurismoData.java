package com.example.darkd.ceub_potos.staticDataClases;

import com.example.darkd.ceub_potos.clases.Turismo;

import java.util.ArrayList;

public class TurismoData {
    private static ArrayList<Turismo> turismo = new ArrayList<Turismo>();
    private static boolean llenadortu = true;

    public static ArrayList<Turismo> getTurismoData(){
        if(llenadortu){

            turismo.add(new Turismo(
                "Casa Nacional de Moneda",
                "La Casa Nacional de Moneda de Bolivia, conocida también como la Real Casa de Moneda o simplemente como la Casa Nacional de Moneda, se encuentra en la ciudad de Potosí, fundada en 1572 por el virrey Francisco de Toledo.\n" +
                        "En los años cuarenta del siglo XX, el Gobierno de Bolivia mediante un Decreto Supremo del 5 de octubre de 1940, entregaba la antigua Real Casa de Moneda de Potosí a la Sociedad Geográfica y de Historia \"Potosí\" para su administración y organización de un museo y archivo histórico. En la actualidad este repositorío cultural se ha convertido en un centro museológico y documental muy conocido a nivel nacional e internacional.\n",
                "Hoyos",
                "https://www.eldeber.com.bo/__export/1508356605303/sites/eldeber/img/2017/10/18/casa_de_la_moneda_0.jpg_1775534641.jpg",
                -19.588905f,
                -65.754258f
            ));

            llenadortu = false;
        }
        return turismo;
    }
}
