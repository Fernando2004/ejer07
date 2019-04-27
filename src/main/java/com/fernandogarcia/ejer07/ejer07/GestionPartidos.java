package com.fernandogarcia.ejer07.ejer07;

import java.util.ArrayList;

import static com.fernandogarcia.ejer07.ejer07.Ejer07.listaGeneralPartidos;
import static com.fernandogarcia.ejer07.ejer07.GestionEntradas.arrayZonasVip;

public class GestionPartidos {


    public static void altaPartido() {

        Partido partido = new Partido();
        int pos = buscarPartidoFecha(partido.getFecha());
        int i = 0;

        if (pos!=-1){
            System.out.println("El partido ya existe");
        }else {
            listaGeneralPartidos.add(partido);
            System.out.println("El partido introducido correctamente");
        }
    }


    //Llenamos la lista con nuevos partidos
    public static ArrayList<Partido> generarListaPartidos() {

        listaGeneralPartidos.add(new Partido("22/07/2019", Afluencia.MEDIA_AFLUENCIA,
                "F.C.BARCELONA ", "VALENCIA C.F."));
        listaGeneralPartidos.add(new Partido("29/09/2019", Afluencia.ALTA_AFLUENCIA,
                "REAL MADRID", "VALENCIA C.F."));
        listaGeneralPartidos.add(new Partido("15/05/2019", Afluencia.ALTA_AFLUENCIA,
                "REAL MADRID", "F.C.BARCELONA"));
        listaGeneralPartidos.add(new Partido("20/10/2019", Afluencia.BAJA_AFLUENCIA,
                "REAL SOCIEDAD", "SEVILLA"));

        return listaGeneralPartidos;
    }

    /**Lista todos los partidos*/
    public static void listarPartidos() {
        //esta vacio por que lista es publica
        if (listaGeneralPartidos.isEmpty()) {
            System.out.println("La lista esta vacia");
        }else {

            for (Partido p : listaGeneralPartidos) {
                System.out.println(p.toString());
            }
        }
    }
    /**Selecciono el partido segun su fecha*/
    public static int buscarPartidoFecha(String fecha){
        int pos = -1;
        int i = 0;
        while (i < listaGeneralPartidos.size() && pos == -1){
            if (fecha.equals(listaGeneralPartidos.get(i).getFecha())) {
                pos = i;
            }
            i++;
        }
        return pos;
    }

    public static int buscarPartidoZona(int nZona,Zona[] arrayZonas){
        int pos = -1;
        int i = 0;
        while (i <arrayZonas.length && pos == -1){
            if ((arrayZonas[i]!=null)&&(arrayZonas[i].getnZona()==nZona)) {
                pos = i;
            }
            i++;
        }
        return pos;
    }







}
