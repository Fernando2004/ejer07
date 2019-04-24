package com.fernandogarcia.ejer07.utils;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Lib {

    public static Scanner lector = new Scanner(System.in);


    public static void limpiarPantalla() {
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
    }

    public static void pausa() {
        System.out.println("Pulsa INTRO para continuar...");
        lector.nextLine();
    }

    public static int aleatorio() {
        Random rd = new Random();
        return rd.nextInt();
    }


    //UUID (Unique Universal Identifier)
    //-------------------Metodos-----------------------
    public static String crearClave(){
        String clave=UUID.randomUUID().toString().toUpperCase().substring(0,6);
     return clave;
    }






}

