package com.fernandogarcia.ejer07.utils;

import com.fernandogarcia.ejer07.ejer07.Entrada;
import com.fernandogarcia.ejer07.misexception.NumerosNegativoException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Lib {

    public static Scanner lector = new Scanner(System.in);
    public static Random rd = new Random();


    public static void limpiarPantalla() {
        System.out.print("\u001B[H\u001B[2J");
        System.out.flush();
    }

    public static void pausa() {
        System.out.println("Pulsa INTRO para continuar...");
        lector.nextLine();
    }

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

    //UUID (Unique Universal Identifier)
    //-------------------Metodos-----------------------
    public static String crearClave() {
        String clave = UUID.randomUUID().toString().toUpperCase().substring(0, 6);
        return clave;
    }

    //Este no lo hace bien

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

    /**Elimino la entrada devuelta pasandole su identificador*/
    public static void eliminaEntrada(Entrada[]clase,int id) {
        int pos=-1;
        for (int i = 0; i < clase.length; i++) {
            //si la i del array no es nula y es igual al id que te digo
            if ((clase[i]!=null)&&(clase[i].getId()==id)) {
                //me lo borras
                clase[i]=null;
                System.out.println("Se elimino la entrada correctamente");
                //
                pos=i;
                break;
            }
        }
        if (pos==-1)
            System.out.println("Entrada no encontrada ");
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



}