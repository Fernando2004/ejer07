package com.fernandogarcia.ejer07.ejer07;

import com.fernandogarcia.ejer07.utils.Lib;
import java.util.InputMismatchException;
import static com.fernandogarcia.ejer07.utils.Lib.lector;

public class Ejer07 {

    public static final int NUM_ZONAS_VIP = 4;
    public static final int NUM_ZONAS_NORMAL = 20;

    public static Zona[] arrayZonasVip = new Zona[NUM_ZONAS_VIP];
    public static Zona[] arrayZonasNormal = new Zona[NUM_ZONAS_NORMAL];

    public static int[][] arraySillas =new int[3][100];

    public static void principal() {


        int opcion;

        do {
            opcion = menuPrincipal();
            switch (opcion) {
                case 1:
                    //Seleccionamos el partido

                    Lib.pausa();
                    break;
                case 2:
                    //Lib.rellenaArrayDobleConClaveTaquilla(arraySillas);

                    //Lib.rellenaArrayNumSilla(arraySillas);

                    //Cuando selecciono el partido salta el menu de ventas

                    //----------Menu de venta de entradas---------------
                    int opcion1;

                    do {
                        opcion1 = menuSecundario();
                        switch (opcion) {
                            case 1:
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
    public static int menuSecundario() {
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


