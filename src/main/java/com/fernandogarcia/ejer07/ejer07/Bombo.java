package com.fernandogarcia.ejer07.ejer07;

import com.fernandogarcia.ejer07.utils.Lib;

import java.util.ArrayList;

public class Bombo {

    /**con la listaNumeros cogemos los numeros y los entregamos con la entrada
     * y con listaSorteo cogemos solo la combinacion ganadora*/
    private ArrayList<Integer> listaNumeros=new ArrayList<Integer>();
    private ArrayList<Integer> listaSorteo=new ArrayList<Integer>();

    /**Llenamos la lista menos los que son de tipo vip*/
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
        listaSorteo.remove(aleat);
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
