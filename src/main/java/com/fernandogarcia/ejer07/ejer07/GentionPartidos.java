package com.fernandogarcia.ejer07.ejer07;

import java.util.ArrayList;

import static com.fernandogarcia.ejer07.ejer07.Ejer07.listaGeneralPartidos;

public class GentionPartidos {


    public static void altaPartido(){
        Partido partido=new Partido();
        int pos=-1;
        for (Partido p:listaGeneralPartidos) {
            if (partido.getFecha().equals(p.getFecha())){
                pos=listaGeneralPartidos.indexOf(p);
                break;
            }
            if (pos!=1){
                System.out.println("El partido ya existe");
            }else {
                listaGeneralPartidos.add(partido);
                System.out.println("Pattido incluido carrectamente");
            }
        }
    }


    //Llenamos la lista con nuevos partidos
    public static ArrayList<Partido> generarListaPartidos() {

        listaGeneralPartidos.add(new Partido("22/07/2019", Afluencia.MEDIA_AFLUENCIA,
                "BARCELONA C.F.", "VALENCIA"));
        listaGeneralPartidos.add(new Partido("29/09/2019", Afluencia.ALTA_AFLUENCIA,
                "REAL MADRID", "VALENCIA"));
        listaGeneralPartidos.add(new Partido("15/05/2019", Afluencia.ALTA_AFLUENCIA,
                "REAL MADRID", "BARCELONA"));
        listaGeneralPartidos.add(new Partido("20/10/2019", Afluencia.BAJA_AFLUENCIA,
                "REAL SOCIEDAD", "SEVILLA"));

        return listaGeneralPartidos;
    }

    /**Lista todos los partidos*/
    public static void listaPartidos() {
        //esta vacio por que lista es publica

        if (listaGeneralPartidos.isEmpty()) {
            System.out.println("La lista esta vacia");
        }else {

            for (Partido p : listaGeneralPartidos) {
                System.out.println(p.toString());
            }
        }
    }









}
