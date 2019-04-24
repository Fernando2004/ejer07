package com.fernandogarcia.ejer07.utils;

public class Log {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_GREEN = "\u001B[32m";


    //Nos muestra el texto en azul
    public static void i(String msg){

        System.out.println(ANSI_BLUE+msg+ANSI_RESET);

    }

    //Nos muestra el texto en verde
    public static void d(String msg){
        System.out.println(ANSI_GREEN+msg+ANSI_RESET);

    }

}
