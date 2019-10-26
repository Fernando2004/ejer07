package com.fernandogarcia.ejer07.ejer07;

import com.fernandogarcia.ejer07.utils.Lib;
import com.fernandogarcia.ejer07.utils.Log;
import java.util.ArrayList;
import java.util.InputMismatchException;
import static com.fernandogarcia.ejer07.utils.Lib.lector;

public class Ejer07 {

    public static ArrayList<Partido> listaGeneralPartidos = new ArrayList<>();

    public static void principal() {

        //Estos los gernero para verlos para tener algunos datos
        GestionPartidos.generarListaPartidos();
        //vemos los creados
        GestionPartidos.listarPartidos();

        //Rellenamos los arrays zonas 
        
        
        //cambios para hacer los commit de hoy
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
                        lector.nextLine();
                        switch (opcVenta) {
                            case 1:
                                GestionEntradas.ventaEntradas();
                                Lib.pausa();
                                break;
                            case 2:

                                GestionEntradas.devolucionEntrada();
                                Lib.pausa();
                                break;
                            case 3:
                                GestionPartidos.listarPartidos();
                                System.out.println("Indica la fecha del partido a ver sus asientos ");
                                String fechaPartidoOcupados= lector.nextLine();

                                Log.i("Las localidades ocupadas del partido son: "+GestionEntradas.asientosOcupados(fechaPartidoOcupados));
                                Lib.pausa();
                                break;
                            case 4:

                                GestionPartidos.listarPartidos();
                                System.out.println("Indica la fecha del partido a ver sus asientos ");
                                String fechaPartidoLibres= lector.nextLine();
                                Log.d("Las localidades libres del partido son: "+GestionEntradas.asientosLibres(fechaPartidoLibres));
                                Lib.pausa();
                                break;
                            case 5:
                                //Listo algunos partidos
                                GestionPartidos.listarPartidos();
                                //Selecciono el partido para ver la recaudacion
                                System.out.println("Indica la fecha del partido el cual ver su recaudación ");
                                String fechaPartido= Lib.lector.nextLine();
                                int pos=GestionPartidos.buscarPartidoFecha(fechaPartido);
                                if (pos==-1){
                                    System.out.println("Patido no encontrado");
                                }
                                else {
                                    //me traigo el partido
                                    Partido partido=listaGeneralPartidos.get(pos);
                                    System.out.println("La recaudacion total del partido elegido es: "+
                                            GestionEntradas.recaudacionPartido(partido));
                                }
                                Lib.pausa();
                                break;
                            case 0:
                                System.out.println("Menu inicial");
                                break;
                        }
                    } while (opcVenta != 0);

                    break;
                case 3:
                    //Genero el sorteo del partido para entradas normales
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


