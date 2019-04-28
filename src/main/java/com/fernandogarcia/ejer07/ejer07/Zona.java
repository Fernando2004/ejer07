package com.fernandogarcia.ejer07.ejer07;

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
    //Setters y Getters
    public int getnZona() {
        return nZona;
    }

    public Entrada[][] getArrayAsientos() {
        return arrayAsientos;
    }

    public int getLibres() {
        return libres;
    }

    public double getPrecioBase() {
        return precioBase;
    }
    /**Muestro la informacion de la zona*/
    @Override
    public String toString() {
       return "\nZona= " + nZona +
              "\nAsientos libres = " + libres;
    }
    /**Muestro la informacion de la entrada del cliente*/
    public String toStringEntrada() {
       return "\nNumero de Zona= " + nZona;
    }
    /**Liberamso el asiento de la entrada devuelta*/
    public void liberarAsiento(int nFila,int nAsiento){
        arrayAsientos[nFila][nAsiento]=null;
         libres++;
    }
    /**Asigno un numero de asiento a la entrada*/
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
        //Disminullen los asientos libres
        this.libres--;

        return asiento;
    }
}
