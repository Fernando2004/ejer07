package com.fernandogarcia.ejer07.ejer07;

import java.util.Arrays;

public  class Zona {

    public static int auto=0;
    public static final int NUM_FILAS=3;
    public static final int NUM_ASIENTOS=100;


    protected int nZona;
    protected int[][] arrayAsientos;
    protected double precio;

    public Zona() {
        this.nZona=++auto;
        this.arrayAsientos =new int[NUM_FILAS][NUM_ASIENTOS];
        this.precio=precio;
    }



    public int getnZona() {
        return nZona;
    }

    public int[][] getArrayAsientos() {
        return arrayAsientos;
    }

    public void setArrayAsientos(int[][] arrayAsientos) {
        this.arrayAsientos = arrayAsientos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
       String cadena="\nZona= " + nZona +
                     "\narrayAsientos= " + Arrays.toString(arrayAsientos);
                    if (arrayAsientos==null){
                        cadena=cadena+"\nAsiento disponible ";
                    }else{
                        cadena=cadena+"\nAsiento no disponible ";
                    }
                    return cadena+
                    "\nprecio= " +precio;
    }
}
