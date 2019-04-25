package com.fernandogarcia.ejer07.ejer07;

public abstract class Entrada {


    public static int auto=0;

    protected int id;
    protected Partido partido;
    protected Zona zona;
    protected int nFila;
    protected int nAsiento;

    //constructores

    public Entrada() {
    }

    public Entrada(Partido partido, Zona zona, int nFila, int nAsiento) {
        this.partido = partido;
        this.zona = zona;
        this.nFila = nFila;
        this.nAsiento = nAsiento;

    }

    public int getId() {
        return id;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public int getnFila() {
        return nFila;
    }

    public void setnFila(int nFila) {
        this.nFila = nFila;
    }

    public int getnAsiento() {
        return nAsiento;
    }

    public void setnAsiento(int nAsiento) {
        this.nAsiento = nAsiento;
    }

    @Override
    public String toString() {
        return "Entrada\n" +
                "\nid= " + id +
                "\npartido= " + partido +
                "\nzona= " + zona +
                "\nFila= " + nFila +
                "\nAsiento= " + nAsiento;
    }
}
