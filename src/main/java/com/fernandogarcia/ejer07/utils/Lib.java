package com.fernandogarcia.ejer07.utils;

import com.fernandogarcia.ejer07.misexception.NumerosNegativoException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Lib {

    public static Scanner lector = new Scanner(System.in);
    public static Random rd = new Random();

    /**Limpio la pantalla*/
    public static void limpiarPantalla() {
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
    }
    /**Muestro mensaje pulse intro*/
    public static void pausa() {
        System.out.println("Pulsa INTRO para continuar...");
        lector.nextLine();
    }
    /**Genero aleatorios indicando un maximo y un minimo*/
    public static int aleatorio(int min,int max) {
        Random rd = new Random();
        return rd.nextInt(max-min+1)-min;
    }

    /**
     * Nos muestra la exception creada
     */
    public static int leerOpcionMenu() throws NumerosNegativoException , InputMismatchException {
        int opc = lector.nextInt();
        if (opc < 0) {
            throw new NumerosNegativoException("Se tiene que introducir un valor positivo");
        }
        return opc;
    }
    /**controlo las fechas entradas con String*/
    public static boolean isFechaCorrecta(String fechaString){
        boolean fechaCorrecta=true;
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        try {
            formater.parse(fechaString);
        }
        catch (ParseException e ){
            fechaCorrecta=false;
        }
        return fechaCorrecta;
    }
    //UUID (Unique Universal Identifier)
    //-------------------Metodos-----------------------
    /**genero una clave alfanumerica para las taquillas*/
    public static String crearClave() {
        String clave = UUID.randomUUID().toString().toUpperCase().substring(0, 6);
        return clave;
    }
    /**Muestro cualquier lista que le pase */
    public static void  listarArray(Object[] array){
        int cont=0;
        for (int i=0;i<array.length;i++){

            if (array[i]!=null){
                System.out.println(array[i].toString());
            }
            cont++;
        }
        if(cont==0){
            System.out.println("No se encontraron elementos");
        }
    }
}