package com.fernandogarcia.ejer07.ejer07;

public abstract class Entrada {


    public static int auto=0;

    protected int id;
    protected Partido partido;
    protected Zona zona;
    protected int nFila;
    protected int nAsiento;
    protected double precioEntrada;

    //constructores

    public Entrada() {
    }

    public Entrada(Partido partido, Zona zona, int nFila, int nAsiento) {
        this.id=++auto;
        this.partido = partido;
        this.zona = zona;
        this.nFila = nFila;
        this.nAsiento = nAsiento;
        //Asignar predio de entrada
        Afluencia afluencia=partido.getAfluencia();
        switch (afluencia){
            case ALTA_AFLUENCIA:
                precioEntrada=zona.getPrecioBase()*1.3;
            case MEDIA_AFLUENCIA:
                precioEntrada=zona.getPrecioBase();
            case BAJA_AFLUENCIA:
                precioEntrada=zona.getPrecioBase()*0.75;
        }
    }

    public int getId() {
        return id;
    }

    public Partido getPartido() {
        return partido;
    }

    public Zona getZona() {
        return zona;
    }

    public int getnFila() {
        return nFila;
    }

    public int getnAsiento() {
        return nAsiento;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    @Override
    public String toString() {
        return
                "\nid: " + id +
                "\n--------partido---------" + partido.toStringEntrada() +
                "\n----------zona----------" + zona.toStringEntrada()+
                "\nFila= " + nFila +
                "\nAsiento= " + nAsiento+
                "\nPrecio entrada= " + precioEntrada;
    }

}
