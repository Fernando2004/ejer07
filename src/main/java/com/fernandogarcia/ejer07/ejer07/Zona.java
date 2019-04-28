package com.fernandogarcia.ejer07.ejer07;

import com.fernandogarcia.ejer07.utils.Lib;

import java.util.Arrays;


public  class Zona {

    public static int auto=0;


    public static final int NUM_FILAS=3;
    public static final int NUM_ASIENTOS=100;
    public static final double PRECIO_VIP=80;
    public static final double PRECIO_NORMAL=40;

    private int nZona;
    private Entrada[][] arrayAsientos;//arrayAsientos[0]
    private double precioBase;
    private int libres=300;



    public Zona(double precio) {
        this.nZona=++auto;
        this.arrayAsientos =new Entrada[NUM_FILAS][NUM_ASIENTOS];
        this.precioBase=precio;
    }

    public int getnZona() {
        return nZona;
    }

    public Entrada[][] getArrayAsientos() {
        return arrayAsientos;
    }

    public void setArrayAsientos(Entrada[][] arrayAsientos) {
        this.arrayAsientos = arrayAsientos;
    }

    public double getPrecio() {
        return precioBase;
    }

    public void setPrecio(double precio) {
        this.precioBase = precio;
    }

    public int getLibres() {
        return libres;
    }

    public void setLibres(int libres) {
        this.libres = libres;
    }



    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    @Override
    public String toString() {
       return "\nZona= " + nZona +
              "\nAsientos libres = " + libres;

    }
    public String toStringEntrada() {
       return "\nNumero de Zona= " + nZona;

    }

public void liberarAsiento(int nFila,int nAsiento){

        arrayAsientos[nFila][nAsiento]=null;
         libres++;
}

    public int[] asignarAsientoEntrada() {
        int[] asiento = new int[2];

        int i=0;
        int j=0;
        while (i<arrayAsientos.length && arrayAsientos[i][j]!=null){
            while (j<arrayAsientos[0].length && arrayAsientos[i][j]!=null){
                j++;
            }
            i++;
        }
        asiento[0] = i;
        asiento[1] = j;


        this.libres--;

        return asiento;
    }





}
