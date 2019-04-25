package com.fernandogarcia.ejer07.ejer07;

import java.util.Arrays;

import static com.fernandogarcia.ejer07.utils.Lib.mostrarMatriz;

public  class Zona {

    public static int auto=0;
    public static int libres=300;
    public static final int NUM_FILAS=3;
    public static final int NUM_ASIENTOS=100;
    public static final double PRECIO_VIP=80;
    public static final double PRECIO_NORMAL=40;

    protected int nZona;
    protected Entrada[][] arrayAsientos;
    protected double precioBase;


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
                    "\nprecio= " +precioBase;
    }

    /**
     * Rellenamos el array doble con numeros del 0 al
     */
    public  void numeraSilla(int[][] array) {

        int num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = num++;
            }
        }
        mostrarMatriz(array);
    }

    //public void reservarAsiento(){
    // }
}
