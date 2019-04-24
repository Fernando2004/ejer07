package com.fernandogarcia.ejer07.misexception;

public class DniIncorrectoException extends IllegalArgumentException{

    public DniIncorrectoException(){

        super();
    }

    public DniIncorrectoException(String msg){

        super(msg);
    }
}
