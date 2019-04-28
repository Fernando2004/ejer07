package com.fernandogarcia.ejer07.ejer07;

import com.fernandogarcia.ejer07.utils.Lib;
import java.util.ArrayList;

public class GestionEntradas {

    public static final int AFORO_TOTAL=7200;

    //Creo una lista de entradas vendidas para agilizar las consultas
    public static ArrayList<Entrada>listaEntradasVendidas=new ArrayList<Entrada>();

    //Este bombo se crea una sola vez
    public static Bombo bomboEntradas=new Bombo();


    public GestionEntradas() {
    }


/**Realiza venta entrada vip y normal*/
    public static void ventaEntradas() {

        System.out.println("Indica el tipo de entrada");
        System.out.println("1.Entrada vip");
        System.out.println("2.Entrada Normal");
        int opc = Lib.lector.nextInt();
        Lib.lector.nextLine();
        //---------------------------
        if (opc==1||opc==2) {

            boolean fechaCorrecta = false;
            //Listo los partidos
            GestionPartidos.listarPartidos();
            //Selecciono partido indicando la fecha que juega
            String fecha;
            do {
                System.out.println("Indica la fecha del partido a ver");
                fecha = Lib.lector.nextLine();
                //Controlo que la fecha este bien
                fechaCorrecta = Lib.isFechaCorrecta(fecha);
                if (!fechaCorrecta) {
                    System.out.println("La fecha no existe ");
                }
            } while (!fechaCorrecta);
            //Creo un buscaPartidos por fecha
            int pos = GestionPartidos.buscarPartidoFecha(fecha);
            //Controlo que exista el partido con la fecha tal
            if (pos == -1) {
                System.out.println("No tememos partidos con esa fecha");
            } else {
                //Guardo la posicion donde esta el partido seleccionado
                Partido partido = Ejer07.listaGeneralPartidos.get(pos);

                if (opc == 1) {//entradaVip

                    //---------------------------------------------
                    //Bamos a zonas
                    Lib.listarArray(Partido.arrayZonasVip);
                    System.out.println("Indica la zona del estadio");
                    int idZona = Lib.lector.nextInt();

                    //Buscamos la idZona y la controlamos en cada array
                    int posZona = GestionPartidos.buscarPartidoZona(idZona,Partido.arrayZonasVip);
                    if (posZona == -1) {
                        System.out.println("No tememos zonas con ese numero");
                    } else {
                        //Guardo la posicion donde esta la zona seleccionado
                        Zona zona = Partido.arrayZonasVip[posZona];
                        if (zona.getLibres() == 0) {
                            System.out.println("Elija otra zona esta completa");
                        } else {

                            int[] asiento = zona.asignarAsientoEntrada();

                            Entrada entradaVip = new EntradaVip(partido, zona, asiento[0], asiento[1], Lib.crearClave());
                            zona.getArrayAsientos()[entradaVip.getnFila()][entradaVip.getnAsiento()] = entradaVip;
                            listaEntradasVendidas.add(entradaVip);
                            System.out.println(entradaVip.toString());
                        }
                    }
                } else {//entradaNormal
                    //---------------------------------------------
                    //Bamos a zonas
                    Lib.listarArray(Partido.arrayZonasNormal);
                    System.out.println("Indica la zona del estadio");
                    int idZona = Lib.lector.nextInt();

                    //Buscamos la idZona y la controlamos
                    int posZona = GestionPartidos.buscarPartidoZona(idZona,Partido.arrayZonasNormal);
                    if (posZona == -1) {
                        System.out.println("No tememos zonas con ese numero");
                    } else {
                        //Guardo la posicion donde esta la zona seleccionado
                        Zona zona = Partido.arrayZonasNormal[posZona];
                        if (zona.getLibres() == 0) {
                            System.out.println("Elija otra zona esta completa");
                        } else {

                            int[] asiento = zona.asignarAsientoEntrada();

                            Entrada entradaNormal = new EntradaNormal(partido, zona, asiento[0], asiento[1],bomboEntradas.numeroSorteoEntrada());
                            zona.getArrayAsientos()[entradaNormal.getnFila()][entradaNormal.getnAsiento()] = entradaNormal;
                            //Despues de venderla la guardo en la lista
                            listaEntradasVendidas.add(entradaNormal);
                            System.out.println(entradaNormal.toString());
                        }
                    }
                }
            }
        }else {
            System.out.println("opcion incorrecta");
        }

    }
    /**Elimino la entrada devuelta pasandole su identificador y retorno el Nºsorteo*/
    public static void devolucionEntrada() {

        System.out.println("Indica el id de la entrada");
        int idEntrada = Lib.lector.nextInt();
        Lib.lector.nextLine();
        //me guardo la pos y miro que exista
        int pos=buscarEntradaId(idEntrada);

        if (pos!=-1){

            //Ahora traigo la entrada y la guardo
            Entrada entradaDevolver=listaEntradasVendidas.get(pos);
            //la elimino con su posicion
            listaEntradasVendidas.remove(pos);
            //devolvemos desde su zona con el metodo y sus dos parametros
            entradaDevolver.getZona().liberarAsiento(entradaDevolver.getnFila(),entradaDevolver.getnAsiento());
            //devolver nº al bombo con la entradas normales
            if (entradaDevolver instanceof EntradaNormal) {

                bomboEntradas.getListaNumeros().add(((EntradaNormal) entradaDevolver).getnSorteo());
            }
            System.out.println("Entrada devuelta correctamente");
        }
        else {
            System.out.println("Entrada no encontrada");
        }

    }
    /**busco la posicion de la entrada con su id*/
    private static int buscarEntradaId(int idEntrada) {
        int pos=-1;
        int i=0;
        while (i<listaEntradasVendidas.size()&& pos==-1){
            if (listaEntradasVendidas.get(i).getId()==idEntrada){
                pos=i;
            }
            i++;
        }
        return pos;
    }
    /**Muestra los asientos ocupados de cada partido*/
    public static int asientosOcupados() {

        return listaEntradasVendidas.size();
    }
    /**Muestra los asientos libres de cada partido*/
    public static int asientosLibres() {

        return AFORO_TOTAL-listaEntradasVendidas.size();
    }

    /**Muestra la recaudacion de cada partido*/
    public static double recaudacionPartido(Partido partido) {
        double recaudacion=0;
        for (Entrada e:listaEntradasVendidas) {
            if (e.getPartido().getFecha().equals(partido.getFecha())){
                recaudacion=recaudacion+e.getPrecioEntrada();
            }
        }
        return recaudacion;
    }
}

