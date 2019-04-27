package com.fernandogarcia.ejer07.ejer07;

import com.fernandogarcia.ejer07.utils.Lib;

import java.util.ArrayList;

public class Bombo {

    private ArrayList<Integer> listaNumeros=new ArrayList<Integer>();
    private ArrayList<Integer> listaSorteo=new ArrayList<Integer>();

    /**Llenamos la lista*/
    public Bombo() {
        for (int i=1;i<=6000;i++){

            listaNumeros.add(i);
            //Lleno la listaSorteo
            listaSorteo.add(i);
        }
    }
    /**Saco los numeros de forma aleatoria para cada entrada*/
    public int numeroSorteoEntrada(){
        int aleat= Lib.aleatorio(1,listaNumeros.size());
        listaNumeros.remove(aleat);
        return aleat;
    }
    /**Saco un numero de forma aleatoria para el sorteo*/
    public int numeroGanador(){
        int aleat= Lib.aleatorio(1,listaSorteo.size());
        listaNumeros.remove(aleat);
        return aleat;
    }

    //setters y getters
    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }


}
