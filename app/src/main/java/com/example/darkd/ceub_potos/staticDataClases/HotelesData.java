package com.example.darkd.ceub_potos.staticDataClases;

import com.example.darkd.ceub_potos.clases.Hoteles;
import com.example.darkd.ceub_potos.clases.Restaurantes;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class HotelesData {
    private static ArrayList<Hoteles> hoteles = new ArrayList<Hoteles>();
    private static boolean llenadoho = true;

    public static ArrayList<Hoteles> getHotelesData(){

        if(llenadoho) {
            hoteles.add(new Hoteles(
                    "HOTEL COLOSO",
                    5,
                    "Calle Bolívar N° 965",
                    "(591-2) 62-22627",
                    null,
                    "info@potosihotel.com",
                    -19.587680f,
                    -65.751425f,
                    "https://lh3.googleusercontent.com/qBBo7K3vV97KSoH29WvmnjmnWgyaIAfs7VzpXIb3Wz6SRgMMYxY2xfdVFQjMAMa3lM7_uz1xuFqM5Ulnd3rjSbvK-GLxngIAJ8z4H3eI1VuNC8zKOahy0_mHgTJ35zSB68hd5N0jHg=w2400"));
            hoteles.add(new Hoteles("VALERY HOTEL",
                    4,
                    "Av. Litoral esq. Colquechaca N° 483",
                    "(591)-2-6223288",
                    null,
                    "info@valeryhotel.com",
                    -19.583097f,
                    -65.757397f,
                    "https://lh3.googleusercontent.com/ikqLzF7epFa0uA2hFOliZtNbucPtDVOMSXccBEksyTQdMCtPkzAUjuAa1XUTO_O3--_6ugU9jRwzKiluh2zTtmF3VhtFjnIye5Z7scVCZ7BXqcjD1Rn3qFdhtjgm5gVzQu8tqEr6Ww=w2400"));

            llenadoho=false;
        }
        return hoteles;
    }
}
