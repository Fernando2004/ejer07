package com.fernandogarcia.ejer07.ejer07;

import com.fernandogarcia.ejer07.utils.Lib;

public class Ejer07 {


    public static void principal() {
        //menu principal

        System.out.println("Hola");
        System.out.println(Lib.crearClave());


        }

    private int menuPrincipal () {
        int opcion = -1;
        do {


        } while (opcion < 0 || opcion > 5);
        return opcion;
    }





}
