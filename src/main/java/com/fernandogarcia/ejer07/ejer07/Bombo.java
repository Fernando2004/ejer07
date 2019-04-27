package com.fernandogarcia.ejer07.ejer07;

import com.fernandogarcia.ejer07.utils.Lib;

import java.util.ArrayList;

public class Bombo {

    private ArrayList<Integer> listaNumeros=new ArrayList<Integer>();

    public Bombo() {
        for (int i=1;i<=6000;i++){
            listaNumeros.add(i);
        }
    }

    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public int numeroSorteo(){
        int aleat= Lib.aleatorio(1,listaNumeros.size());
        listaNumeros.remove(aleat);
        return aleat;
    }
}
