package com.fernandogarcia.ejer07.ejer07;

import com.fernandogarcia.ejer07.utils.Lib;

public class GestionEntradas {

    public static final int NUM_ZONAS_VIP = 4;
    public static final int NUM_ZONAS_NORMAL = 20;


    public static Zona[] arrayZonasVip = new Zona[NUM_ZONAS_VIP];
    public static Zona[] arrayZonasNormal = new Zona[NUM_ZONAS_NORMAL];

    //Este bombo se crea una sola vez
    public static Bombo bombo=new Bombo();

    public GestionEntradas() {
    }

    public static Zona[] getArrayZonasVip() {
        return arrayZonasVip;
    }

    public static void setArrayZonasVip(Zona[] arrayZonasVip) {
        GestionEntradas.arrayZonasVip = arrayZonasVip;
    }

    public static Zona[] getArrayZonasNormal() {
        return arrayZonasNormal;
    }

    public static void setArrayZonasNormal(Zona[] arrayZonasNormal) {
        GestionEntradas.arrayZonasNormal = arrayZonasNormal;
    }

    public static void anyadirZonasArray() {
        for (int i = 0; i < arrayZonasVip.length; i++) {
            arrayZonasVip[i] = new Zona(Zona.PRECIO_VIP);
        }
        for (int i = 0; i < arrayZonasNormal.length; i++) {
            arrayZonasNormal[i] = new Zona(Zona.PRECIO_NORMAL);
        }
    }

/**Realiza venta entrada vip y normal*/
    public static void ventaEntradas() {
        System.out.println("------Indica la zona del estadio--------");
        int zonaEst=0;
        zonaEst=zonaEstadio();

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
                    Lib.listarArray(arrayZonasVip);

                    //Corregir
                    System.out.println("Indica lugar de la zona vip (1,2,3,4)");
                    //utilizo la variable zonaEst
                    int idZona = Lib.lector.nextInt();


                    //Buscamos la idZona y la controlamos en cada array
                    int posZona = GestionPartidos.buscarPartidoZona(idZona,arrayZonasVip);
                    if (posZona == -1) {
                        System.out.println("No tememos zonas con ese numero");
                    } else {
                        //Guardo la posicion donde esta la zona seleccionado
                        Zona zona = arrayZonasVip[posZona];
                        if (zona.getLibres() == 0) {
                            System.out.println("Elija otra zona esta completa");
                        } else {

                            int[] asiento = zona.asignarAsientoEntrada();

                            Entrada entradaVip = new EntradaVip(partido, zona, asiento[0], asiento[1], Lib.crearClave());
                            zona.getArrayAsientos()[entradaVip.getnFila()][entradaVip.getnAsiento()] = entradaVip;

                            System.out.println(entradaVip.toString());
                        }
                    }
                } else {//entradaNormal
                    //---------------------------------------------
                    //Bamos a zonas
                    Lib.listarArray(arrayZonasNormal);
                    //corregir
                    System.out.println("Indica el lugar de la zona normal (1 al 20)");
                    int idZona = Lib.lector.nextInt();

                    //Buscamos la idZona y la controlamos
                    int posZona = GestionPartidos.buscarPartidoZona(idZona,arrayZonasNormal);
                    if (posZona == -1) {
                        System.out.println("No tememos zonas con ese numero");
                    } else {
                        //Guardo la posicion donde esta la zona seleccionado
                        Zona zona = arrayZonasNormal[posZona];
                        if (zona.getLibres() == 0) {
                            System.out.println("Elija otra zona esta completa");
                        } else {

                            int[] asiento = zona.asignarAsientoEntrada();

                            Entrada entradaNormal = new EntradaNormal(partido, zona, asiento[0], asiento[1],bombo.numeroSorteoEntrada());
                            zona.getArrayAsientos()[entradaNormal.getnFila()][entradaNormal.getnAsiento()] = entradaNormal;

                            System.out.println(entradaNormal.toString());
                        }
                    }
                }
            }
        }else {
            System.out.println("opcion incorrecta");
        }

    }
    /**Elimino la entrada devuelta pasandole su identificador*/
    public static void devolucionEntrada(Object[]array,int id) {
        int pos=-1;

        for (int i = 0; i < array.length; i++) {
            //si la i del array no es nula y es igual al id que te digo
            /*if ((array[i]!=null)&&(array[i].getArrayVip[i]==id)) {
                //me lo borras
                array[i]=null;
                System.out.println("Se elimino la entrada correctamente");
                //
                pos=i;
                break;
            }*/
            //Aumento las plazas libres metemos el numero en el bombo

        }
        if (pos==-1)
            System.out.println("Entrada no encontrada ");
    }


    //Gestiono las zonas
    public static int zonaEstadio() {
        int opcion = 0;
            System.out.println("1-Fondo Norte");
            System.out.println("2-Fondo Sur");
            System.out.println("3-Tribuna");
            System.out.println("4-Lateral");
            System.out.println("0-Zona seleccionada");

            opcion = Lib.lector.nextInt();
            //para despues de guardar un valor numerico un nextLine();
            Lib.lector.nextLine();
            switch (opcion) {
                case 1: System.out.println("A seleccionado el Fondo Norte");
                        System.out.println("--------------------------");

                    break;
                case 2: System.out.println("A seleccionado el Fondo Sur");
                        System.out.println("--------------------------");

                    break;
                case 3: System.out.println("A seleccionado la Tribuna");
                        System.out.println("--------------------------");

                    break;
                case 4: System.out.println("A seleccionado el Lateral");
                        System.out.println("--------------------------");

                    break;
                case 0: System.out.println("Seleccion correcta");
                        System.out.println("--------------------------");

                    break;
                default:
                    System.out.println("Introduce una opcion valida");
                    //System.out.println("--------------------------");

            }
    return opcion;
    }
}

