package com.fernandogarcia.ejer07.ejer07;

import com.fernandogarcia.ejer07.utils.Lib;

public class GestionEntradas {

    public static final int NUM_ZONAS_VIP = 4;
    public static final int NUM_ZONAS_NORMAL = 20;



    public static Zona[] arrayZonasVip = new Zona[NUM_ZONAS_VIP];
    public static Zona[] arrayZonasNormal = new Zona[NUM_ZONAS_NORMAL];



    public static void anyadirZonasArray(){
        for (int i=0;i<arrayZonasVip.length;i++){
            arrayZonasVip[i]=new Zona(Zona.PRECIO_VIP);
        }
        for (int i=0;i<arrayZonasNormal.length;i++){
            arrayZonasNormal[i]=new Zona(Zona.PRECIO_NORMAL);
        }
    }


    public static void ventaEntradas() {


        System.out.println("Indica el tipo de entrada");
        System.out.println("1.Entrada vip");
        System.out.println("2.Entrada Normal");
        int opc= Lib.lector.nextInt();

        if (opc==1){
            boolean fechaCorrecta=false;
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
            }while (!fechaCorrecta);
            //Creo un buscaPartidos por fecha
           int  pos=GestionPartidos.buscarPartidoFecha(fecha);
           //Controlo que exista el partido con la fecha tal
           if(pos==-1){
               System.out.println("No tememos partidos con esa fecha");
           }else {
               //Guardo la posicion donde esta el partido seleccionado
               Partido partido=Ejer07.listaGeneralPartidos.get(pos);

               //---------------------------------------------
               //Bamos a zonas ahora
               Lib.listarArray(arrayZonasVip);
               System.out.println("Indica la zona del estadio");
               int idZona=Lib.lector.nextInt();

               //Buscamos la idZona y la controlamos


           }



            EntradaVip entradaVip=new EntradaVip();
        }else if(opc==2){
            EntradaNormal entradaNormal=new EntradaNormal();
        }
        else {
            System.out.println("Indica una opcion correcta");
        }




    }
}



