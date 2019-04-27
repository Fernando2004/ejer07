package com.fernandogarcia.ejer07.ejer07;

import java.util.Arrays;

import static com.fernandogarcia.ejer07.utils.Lib.mostrarMatriz;

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
    private int regFila=1;
    private int regAsiento=1;


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

    public int getRegFila() {
        return regFila;
    }

    public void setRegFila(int regFila) {
        this.regFila = regFila;
    }

    public int getRegAsiento() {
        return regAsiento;
    }

    public void setRegAsiento(int regAsiento) {
        this.regAsiento = regAsiento;
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


    public int[] asignarAsientoEntrada() {
        int[] asiento = new int[2];


        asiento[0] = regFila;
        asiento[1] = regAsiento;

        if(regAsiento==100){
            regAsiento=1;
            regFila++;
        }else {
            regAsiento++;
        }
        regAsiento++;
        this.libres--;

        return asiento;
    }

}
