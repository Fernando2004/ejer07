package com.fernandogarcia.ejer07.ejer07;

import com.fernandogarcia.ejer07.utils.Lib;

import java.util.InputMismatchException;

import static com.fernandogarcia.ejer07.utils.Lib.lector;

public class Ejer07 {

    public static final int NUM_ZONAS = 24;

    Zona[] arrayZonas = new Zona[NUM_ZONAS];

    public static void principal() {

        int opcion;

        do {
            opcion = menuPrincipal();
            switch (opcion) {
                case 1:
                    System.out.println("--------20---------");
                    //nuevoPaciente();
                    break;
                case 2:
                    //atenderPaciente();
                    break;
                case 3:
                    //consultas();
                    break;
                case 4:
                    //altaMedica();
                    break;
                case 0:
                    System.out.println("Hasta pronto");
                    break;
            }
        } while (opcion != 0);

    }
    //--------------------Menus------------------------
    public static int menuPrincipal() {
        int opcion = -1;
        do {
            Lib.limpiarPantalla();
            System.out.println("************************");
            System.out.println("*-------- MENU --------*");
            System.out.println("***********************");
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("-----------------------");
            System.out.println("0. Salir\n");
            System.out.print("Elija una opción: ");
            try {
                opcion = Lib.leerOpcionMenu();

            } catch (InputMismatchException e) {
            }
            lector.nextLine();
            if (opcion < 0 || opcion > 6) {
                System.out.println("Elija una opción del menú [0-6]");
            }
        } while (opcion < 0 || opcion > 6);
        return opcion;
    }


}


