package com.fernandogarcia.ejer07.ejer07;

public class EntradaNormal extends Entrada{


    private int nSorteo;

    public EntradaNormal() {
        super();
    }



    public EntradaNormal(Partido partido, Zona zona, int nFila, int nAsiento, int nSorteo) {
        super(partido, zona, nFila, nAsiento);
        this.nSorteo = nSorteo;
    }

    public int getnSorteo() {
        return nSorteo;
    }

    @Override
    public String toString() {
        return "------------------------\n" +
                "EntradaNormal\n" +
                super.toString()+
                "\nNúmero de Sorteo= " + nSorteo;
    }
}
