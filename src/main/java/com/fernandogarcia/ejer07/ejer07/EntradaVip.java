package com.fernandogarcia.ejer07.ejer07;

import com.fernandogarcia.ejer07.utils.Lib;

public class EntradaVip extends Entrada{



    private String nTaquilla;

    public EntradaVip() {
        super();

    }

    public EntradaVip(Partido partido, Zona zona, int nFila, int nAsiento, String nTaquilla) {
        super(partido, zona, nFila, nAsiento);
        this.nTaquilla = nTaquilla;
    }

    public String getnTaquilla() {
        return nTaquilla;
    }

    @Override
    public String toString() {
        return "EntradaVip\n" +
                "\nNumero de Taquilla= " +Lib.crearClave()+
                "\nid= " + id +
                "\npartido= " + partido +
                "\nzona= " + zona +
                "\nFila= " + nFila +
                "\nAsiento= " + nAsiento;
    }
}
