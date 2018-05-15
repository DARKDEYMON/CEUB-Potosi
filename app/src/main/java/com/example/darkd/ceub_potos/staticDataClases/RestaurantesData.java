package com.example.darkd.ceub_potos.staticDataClases;

import com.example.darkd.ceub_potos.clases.Restaurantes;

import java.util.ArrayList;

public class RestaurantesData {
    private static ArrayList<Restaurantes> restaurantes = new ArrayList<Restaurantes>();
    private static boolean llenadores = true;
    public  static ArrayList<Restaurantes> getRestaurantesData(){

        if(llenadores){
            restaurantes.add(new Restaurantes(
                    "Picanteria Doña Irene",
                    "Oteros #108",
                    "74225022",
                    "https://lh3.googleusercontent.com/WcYtPxxZl6S4CgmXIGsMPh4iqnyCz-ctlrXqR3CRulgsvLIplN0PFnZWV2LodSC5OMqphO-VmyP5nTF1HyPR-K5opz9mOVMcICWeMuPizDKvMfpMDoZKi5LfOElpV147-oP6_zNXmA=w2400",
                    -19.577740f,
                    -65.763511f
            ));
            llenadores =false;
        }
        return restaurantes;
    }
}
