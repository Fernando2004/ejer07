package com.fernandogarcia.ejer07.ejer07;

public abstract class Entrada {



    public int autonum=0;

    protected int id=++autonum;
    protected String nombrePartido;
    protected String zonaEstadio;
    protected int filaZona;
    protected int numeroAsiento;

    //constructores


    public Entrada() {
    }

    public Entrada(int id, String nombrePartido, String zonaEstadio, int filaZona, int numeroAsiento) {
        this.id = id;
        this.nombrePartido = nombrePartido;
        this.zonaEstadio = zonaEstadio;
        this.filaZona = filaZona;
        this.numeroAsiento = numeroAsiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePartido() {
        return nombrePartido;
    }

    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public String getZonaEstadio() {
        return zonaEstadio;
    }

    public void setZonaEstadio(String zonaEstadio) {
        this.zonaEstadio = zonaEstadio;
    }

    public int getFilaZona() {
        return filaZona;
    }

    public void setFilaZona(int filaZona) {
        this.filaZona = filaZona;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "id=" + id +
                ", nombrePartido='" + nombrePartido + '\'' +
                ", zonaEstadio='" + zonaEstadio + '\'' +
                ", filaZona=" + filaZona +
                ", numeroAsiento=" + numeroAsiento +
                '}';
    }
}
