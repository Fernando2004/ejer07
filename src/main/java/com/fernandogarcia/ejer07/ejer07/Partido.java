package com.fernandogarcia.ejer07.ejer07;


import com.fernandogarcia.ejer07.misexception.FechaIncorrectaException;
import com.fernandogarcia.ejer07.utils.Lib;

import static com.fernandogarcia.ejer07.utils.Lib.lector;

public class Partido {


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
        boolean fechaCorrecta=false;
        System.out.println("----------PARTIDO DEL DIA---------------");
        do {
            System.out.println("Introduce la fecha del partido");
            this.fecha = lector.nextLine();
            this.fecha = lector.nextLine();
            try {
                if (!Lib.isFechaCorrecta(fecha)) {
                    throw new FechaIncorrectaException("La fecha es incorrecta recuerde (dd/MM/yyyy)");
                }
                else {
                    fechaCorrecta=true;
                }
            } catch (FechaIncorrectaException e) {
                System.out.println(e.getMessage());
            }
        }while (!fechaCorrecta);
        //this.fecha = lector.nextLine();
        //Meter el swhit con el enum
        System.out.println("Indica la afluencia del partido");
        System.out.println("1. ALTA AFLUENCIA");
        System.out.println("2. MEDIA AFLUENCIA");
        System.out.println("3. BAJA AFLUENCIA");
        int opc = lector.nextInt();
        do {
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

    @Override
    public String toString() {
        return "Partido\n" +
                "\nfecha= " + fecha +
                "\nafluencia= " + afluencia +
                "\nnombreEquipoLocal= " + nombreEquipoLocal +
                "\nnombreEquipoVisitante= " + nombreEquipoVisitante;
    }




}