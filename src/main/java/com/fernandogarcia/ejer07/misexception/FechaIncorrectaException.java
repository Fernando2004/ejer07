package com.fernandogarcia.ejer07.misexception;

public class FechaIncorrectaException extends IllegalArgumentException{

    public FechaIncorrectaException(){

        super();
    }
    public FechaIncorrectaException(String msg){


        super(msg);
    }
}