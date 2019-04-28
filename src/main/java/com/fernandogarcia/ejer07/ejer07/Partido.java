package com.fernandogarcia.ejer07.ejer07;

import java.util.InputMismatchException;
import static com.fernandogarcia.ejer07.utils.Lib.isFechaCorrecta;
import static com.fernandogarcia.ejer07.utils.Lib.lector;

public class Partido {

    public static final int NUM_ZONAS_VIP = 4;
    public static final int NUM_ZONAS_NORMAL = 20;

    public static Zona[] arrayZonasVip = new Zona[NUM_ZONAS_VIP];
    public static Zona[] arrayZonasNormal = new Zona[NUM_ZONAS_NORMAL];

    private String fecha;
    private Afluencia afluencia;
    private String nombreEquipoLocal;
    private String nombreEquipoVisitante;


    public Partido(String fecha, Afluencia afluencia, String nombreEquipoLocal, String nombreEquipoVisitante) {
        this.fecha = fecha;
        this.afluencia = afluencia;
        this.nombreEquipoLocal = nombreEquipoLocal;
        this.nombreEquipoVisitante = nombreEquipoVisitante;
    }

    public Partido() {

        int opc=-1;
        boolean fechaCorrecta=false;

        System.out.println("----------PARTIDO DEL DIA---------------");
        do {
            System.out.println("Introduce la fecha del partido");
            this.fecha = lector.nextLine();
            fechaCorrecta=isFechaCorrecta(fecha);
            if (!fechaCorrecta){
                System.out.println("La fecha es incorrecta");
            }
        }while (!fechaCorrecta);
        //Meter el swhit con el enum
        do{
            System.out.println("Indica la afluencia del partido");
            System.out.println("1. ALTA AFLUENCIA");
            System.out.println("2. MEDIA AFLUENCIA");
            System.out.println("3. BAJA AFLUENCIA");
            try {
                opc = lector.nextInt();
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }
            if (opc < 0 || opc > 3) {
                System.out.println("Elija una opción del menú [0-3]");
            }
                switch (opc) {
                    case 1:
                        this.afluencia = Afluencia.ALTA_AFLUENCIA;
                        break;
                    case 2:
                        this.afluencia = Afluencia.MEDIA_AFLUENCIA;
                    case 3:
                        this.afluencia = Afluencia.BAJA_AFLUENCIA;
                        break;
                    default:
                        System.out.println("Introduce una opcion valida");
                }
            } while (afluencia == null);
        lector.nextLine();
        System.out.println("Indica el nombre del equipo local");
        this.nombreEquipoLocal = lector.nextLine();
        System.out.println("Indica el nombre del equipo visitante");
        this.nombreEquipoVisitante = lector.nextLine();
    }

    public static Zona[] getArrayZonasVip() {
        return arrayZonasVip;
    }

    public static void setArrayZonasVip(Zona[] arrayZonasVip) {
        arrayZonasVip = arrayZonasVip;
    }

    public static Zona[] getArrayZonasNormal() {
        return arrayZonasNormal;
    }

    public static void setArrayZonasNormal(Zona[] arrayZonasNormal) {
        arrayZonasNormal = arrayZonasNormal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Afluencia getAfluencia() {
        return afluencia;
    }

    public void setAfluencia(Afluencia afluencia) {
        this.afluencia = afluencia;
    }

    public String getNombreEquipoLocal() {
        return nombreEquipoLocal;
    }

    public void setNombreEquipoLocal(String nombreEquipoLocal) {
        this.nombreEquipoLocal = nombreEquipoLocal;
    }

    public String getNombreEquipoVisitante() {
        return nombreEquipoVisitante;
    }

    public void setNombreEquipoVisitante(String nombreEquipoVisitante) {
        this.nombreEquipoVisitante = nombreEquipoVisitante;
    }
    /**Muestro la informacion de la entrada*/
    @Override
    public String toString() {
        return "\n----Partido por disputar----" +
                "\nfecha= " + fecha +
                "\nafluencia= " + afluencia +
                "\nnombreEquipoLocal= " + nombreEquipoLocal +
                "\nnombreEquipoVisitante= " + nombreEquipoVisitante;

    }
    /**Muestro la entrada que se llevara el cliente*/
    public String toStringEntrada() {
        return
                "\nfecha= " + fecha +
                "\nnombreEquipoLocal= " + nombreEquipoLocal +
                "\nnombreEquipoVisitante= " + nombreEquipoVisitante;
    }
    /**añadimos una zona a las entradas vip y normal*/
    public static void anyadirZonasArray() {
        for (int i = 0; i < arrayZonasVip.length; i++) {
            arrayZonasVip[i] = new Zona(Zona.PRECIO_VIP);
        }
        for (int i = 0; i < arrayZonasNormal.length; i++) {
            arrayZonasNormal[i] = new Zona(Zona.PRECIO_NORMAL);
        }
    }
}