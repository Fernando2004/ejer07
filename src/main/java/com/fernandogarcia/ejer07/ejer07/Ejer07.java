package com.fernandogarcia.ejer07.ejer07;

import com.fernandogarcia.ejer07.utils.Lib;
import java.util.InputMismatchException;
import static com.fernandogarcia.ejer07.utils.Lib.lector;

public class Ejer07 {

    public static void principal() {

        //Rellenamos los arrays zonas


        int opcion;

        do {
            opcion = menuPrincipal();
            switch (opcion) {
                case 1:

                    //Dar de alta un partido nuevo
                    Lib.pausa();
                    break;
                case 2:
                    //----------Menu de venta de entradas---------------
                    int opcion1;

                    do {
                        opcion1 = menuVenta();
                        switch (opcion) {
                            case 1:
                                //selecciono el partido listar
                                Lib.pausa();
                                break;
                            case 2:
                                Lib.pausa();
                                break;
                            case 3:
                                Lib.pausa();
                                break;
                            case 4:
                                Lib.pausa();
                                break;
                            case 5:
                                Lib.pausa();
                                break;
                            case 0:
                                System.out.println("Hasta pronto");
                                break;
                        }
                    } while (opcion1 != 0);
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
            System.out.println("*-------- MENU --------*");
            System.out.println("1. Partido nuevo");
            System.out.println("2. Gestion de Entradas");
            System.out.println("-----------------------");
            System.out.println("0. Salir\n");
            System.out.print("Elija una opción: ");
            try {
                opcion = Lib.leerOpcionMenu();

            } catch (InputMismatchException e) {
            }
            //lector.nextLine();
            if (opcion < 0 || opcion > 2) {
                System.out.println("Elija una opción del menú [0-2]");
            }
        } while (opcion < 0 || opcion > 2);
        return opcion;
    }
    //--------------------------------------------------------------------
    public static int menuVenta() {
        int opcion = -1;
        do {
            Lib.limpiarPantalla();
            System.out.println("*---------VENTA --------*");
            System.out.println("1. Venta de entradas");
            System.out.println("2. Devolucion de entradas");
            System.out.println("3. Lista de localidades ocupadas");
            System.out.println("4. Lista de localidades libres");
            System.out.println("5. Muestra la recaudacion del partido");
            System.out.println("0. Menu de inicio\n");
            System.out.print("Elija una opción: ");
            try {
                opcion = Lib.leerOpcionMenu();

            } catch (InputMismatchException e) {
            }
            //lector.nextLine();
            if (opcion < 0 || opcion > 5) {
                System.out.println("Elija una opción del menú [0-5]");
            }
        } while (opcion < 0 || opcion > 5);
        return opcion;
    }

}


