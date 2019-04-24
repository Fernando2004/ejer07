package com.fernandogarcia.ejer07.ejer07;

public class EntradaVip extends Entrada{

    public int autonum=0;

    protected int nAsiento=++autonum;



    public EntradaVip() {
        super();
    }

    public EntradaVip(int id, String nombrePartido, String zonaEstadio, int filaZona, int numeroAsiento) {
        super(id, nombrePartido, zonaEstadio, filaZona, numeroAsiento);
    }
}
