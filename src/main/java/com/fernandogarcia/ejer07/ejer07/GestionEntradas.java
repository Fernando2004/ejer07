package com.fernandogarcia.ejer07.ejer07;

import java.util.ArrayList;

public class GestionEntradas {

    public static final int NUM_ZONAS_VIP = 4;
    public static final int NUM_ZONAS_NORMAL = 20;



    public static Zona[] arrayZonasVip = new Zona[NUM_ZONAS_VIP];
    public static Zona[] arrayZonasNormal = new Zona[NUM_ZONAS_NORMAL];



    public static void anyadirZonasArray(){
        for (int i=0;i<arrayZonasVip.length;i++){
            arrayZonasVip[i]=new Zona(Zona.PRECIO_VIP);
        }
        for (int i=0;i<arrayZonasNormal.length;i++){
            arrayZonasNormal[i]=new Zona(Zona.PRECIO_NORMAL);
        }
    }




}



