package com.fernandogarcia.ejer07.misexception;

import java.util.InputMismatchException;

public class NumerosNegativoException extends InputMismatchException {

    public NumerosNegativoException(String s) {
        super(s);
    }
}