package com.example.darkd.ceub_potos.staticDataClases;

import com.example.darkd.ceub_potos.clases.Hoteles;
import com.example.darkd.ceub_potos.clases.LugaresEvento;

import java.util.ArrayList;

public class LugaresEventoData {
    private static ArrayList<LugaresEvento> lugaresEvento = new ArrayList<LugaresEvento>();
    private static boolean llenadole = true;

    public static ArrayList<LugaresEvento> getLugaresEvento(){

        if(llenadole){
            lugaresEvento.add(new LugaresEvento(
                    "Auditoria",
                    -19.584728f,
                    -65.756612f
            ));
            lugaresEvento.add(new LugaresEvento(
                    "Paraninfo",
                    -19.583974f,
                    -65.757305f
            ));
            lugaresEvento.add(new LugaresEvento(
                    "Economia",
                    -19.570548f,
                    -65.760901f
            ));
            lugaresEvento.add(new LugaresEvento(
                    "Trabajo Social",
                    -19.583607f,
                    -65.758820f
            ));
            llenadole= false;
        }
        return lugaresEvento;
    }
}
