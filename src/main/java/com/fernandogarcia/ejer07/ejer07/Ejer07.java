package com.fernandogarcia.ejer07.ejer07;

import com.fernandogarcia.ejer07.utils.Lib;

import java.util.ArrayList;
import java.util.InputMismatchException;

import static com.fernandogarcia.ejer07.utils.Lib.lector;

public class Ejer07 {

    public static ArrayList<Partido> listaGeneralPartidos = new ArrayList<>();


    public static void principal() {

        GestionPartidos.generarListaPartidos();
        //GestionPartidos.listaPartidos();

        //Rellenamos los arrays zonas
        int opcion;

        do {
            opcion = menuPrincipal();
            switch (opcion) {
                case 1:
                    System.out.println("--------------------------------------");
                    GestionPartidos.altaPartido();
                    Lib.pausa();
                    break;
                case 2:
                    //----------Menu de venta de entradas---------------
                    int opcVenta;
                    do {
                        opcVenta = menuVenta();
                        switch (opcVenta) {
                            case 1:
                                GestionEntradas.ventaEntradas();
                                Lib.pausa();
                                break;
                            case 2:

                                //GestionEntrada.devolucioEntradas();
                                Lib.pausa();
                                break;
                            case 3:

                                //asientosOcupados();
                                Lib.pausa();
                                break;
                            case 4:

                                //asientosLibres();
                                Lib.pausa();
                                break;
                            case 5:

                                //recaudacionPartido();
                                Lib.pausa();
                                break;
                            case 0:
                                System.out.println("Hasta pronto");
                                break;
                        }
                    } while (opcVenta != 0);
                case 3:
                    System.out.println("El numero ganador en este partido es: "+GestionPartidos.sorteo());
                    Lib.pausa();
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
            System.out.println("3. ------Sorteo-------");
            System.out.println("-----------------------");
            System.out.println("0. Salir\n");
            System.out.print("Elija una opción: ");
            try {
                opcion = lector.nextInt();

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
            lector.nextLine();
            if (opcion < 0 || opcion > 3) {
                System.out.println("Elija una opción del menú [0-3]");
            }
        } while (opcion < 0 || opcion > 3);
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


