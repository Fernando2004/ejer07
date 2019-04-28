package com.fernandogarcia.ejer07.ejer07;

import java.util.ArrayList;

public class GestionPartidos {

    /**Doy de alta un partido nuevo a disputar*/
    public static void altaPartido() {

        Partido partido = new Partido();
        int pos = buscarPartidoFecha(partido.getFecha());
        int i = 0;

        if (pos!=-1){
            System.out.println("El partido ya existe");
        }else {
            Ejer07.listaGeneralPartidos.add(partido);
            System.out.println("El partido se ha introducido correctamente");
        }
    }

    //Llenamos la lista con nuevos partidos
    public static ArrayList<Partido> generarListaPartidos() {

        Ejer07.listaGeneralPartidos.add(new Partido("22/07/2019", Afluencia.MEDIA_AFLUENCIA,
                "F.C.BARCELONA ", "VALENCIA C.F."));
        Ejer07.listaGeneralPartidos.add(new Partido("29/09/2019", Afluencia.ALTA_AFLUENCIA,
                "REAL MADRID", "VALENCIA C.F."));
        Ejer07.listaGeneralPartidos.add(new Partido("15/05/2019", Afluencia.ALTA_AFLUENCIA,
                "REAL MADRID", "F.C.BARCELONA"));
        Ejer07.listaGeneralPartidos.add(new Partido("20/10/2019", Afluencia.BAJA_AFLUENCIA,
                "REAL SOCIEDAD", "SEVILLA"));
        return Ejer07.listaGeneralPartidos;
    }

    /**Lista todos los partidos*/
    public static void listarPartidos() {
        //esta vacio por que lista es publica
        if (Ejer07.listaGeneralPartidos.isEmpty()) {
            System.out.println("La lista esta vacia");
        }else {

            for (Partido p : Ejer07.listaGeneralPartidos) {
                System.out.println(p.toString());
            }
        }
    }
    /**Selecciono el partido segun su fecha*/
    public static int buscarPartidoFecha(String fecha){
        int pos = -1;
        int i = 0;
        while (i < Ejer07.listaGeneralPartidos.size() && pos == -1){
            if (fecha.equals(Ejer07.listaGeneralPartidos.get(i).getFecha())) {
                pos = i;
            }
            i++;
        }
        return pos;
    }
    /**Busco la zona del partido */
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
    /**Metodo para realizar el sorteo*/
    public static int sorteo() {
        int resultado;
        //Creo otro bombo nuevo para el sorteo y utilizo la misma llista
        Bombo bomboSorteo=new Bombo();
        resultado=bomboSorteo.numeroSorteoEntrada();
        return resultado;
    }
}
