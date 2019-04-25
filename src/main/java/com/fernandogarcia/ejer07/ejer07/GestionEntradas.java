package com.fernandogarcia.ejer07.ejer07;

import java.util.ArrayList;

public class GestionEntradas {

    public static final int NUM_ZONAS_VIP = 4;
    public static final int NUM_ZONAS_NORMAL = 20;

    public static ArrayList<Partido> listaGeneralPartidos = new ArrayList<>();

    public static Zona[] arrayZonasVip = new Zona[NUM_ZONAS_VIP];
    public static Zona[] arrayZonasNormal = new Zona[NUM_ZONAS_NORMAL];

    public static void anyadirPartidosLista() {

        Partido p1 = new Partido("25/05/2019", Afluencia.BAJA_AFLUENCIA,"BETIS", "LEVANTE");
        Partido p2 = new Partido("22/07/2019", Afluencia.MEDIA_AFLUENCIA,"BARCELONA C.F.", "VALENCIA");
        Partido p3 = new Partido("29/09/2019", Afluencia.ALTA_AFLUENCIA,"REAL MADRID", "VALENCIA");
        Partido p4 = new Partido("15/05/2019", Afluencia.ALTA_AFLUENCIA, "REAL MADRID", "BARCELONA");
        Partido p5 = new Partido("20/10/2019", Afluencia.BAJA_AFLUENCIA, "REAL SOCIEDAD", "SEVILLA");

        listaGeneralPartidos.add(p1);
        listaGeneralPartidos.add(p2);
        listaGeneralPartidos.add(p3);
        listaGeneralPartidos.add(p4);
        listaGeneralPartidos.add(p5);
    }

    public static void anyadirZonasArray(){
        for (int i=0;i<arrayZonasVip.length;i++){
            arrayZonasVip[i]=new Zona(Zona.PRECIO_VIP);
        }
        for (int i=0;i<arrayZonasNormal.length;i++){
            arrayZonasNormal[i]=new Zona(Zona.PRECIO_NORMAL);
        }
    }



}



