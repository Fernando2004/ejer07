package com.fernandogarcia.ejer07.utils;

import com.fernandogarcia.ejer07.ejer07.Entrada;
import com.fernandogarcia.ejer07.misexception.NumerosNegativoException;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

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

    public static int aleatorio() {
        Random rd = new Random();
        return rd.nextInt();
    }

    /**
     * Nos muestra la exception creada
     */
    public static int leerOpcionMenu() throws NumerosNegativoException {
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

    /**
     * Aplicamos precios
     */
    static void descuento() {
        Scanner lector = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        double precio = 0, porcentaje, descuento, articulo;

        System.out.println("Dime el precio base de la zona ");
        articulo = lector.nextDouble();
        System.out.println("Dime el descuento a aplicar en % ");
        porcentaje = lector.nextDouble();

        descuento = (articulo / 100) * porcentaje;
        precio = articulo - descuento;

        System.out.println("El descuento aplicado es de " + df.format(descuento) + " euros");
        System.out.println("El precio de la entrada con un porcentaje de " + porcentaje + " % es de " + df.format(precio) + " €");
    }

    /**
     * Cambia el Precio
     */
    public static double cambiaPrecio(double porcentaje) {

        double precioBase = 350;
        double cambio = precioBase * porcentaje / 100;

        return cambio;
    }

    /**
     * No retorna el valor maximo del array doble
     */
    public static int arrayMax(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }



    /**
     * Rellenamos el array doble con las claves de cada asiento
     */
    public static void rellenaArrayDobleConClaveTaquilla(int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                //Lo paso a String
                array[i][j] = Integer.parseInt(crearClave());
            }
        }
        mostrarMatriz(array);
    }

    /**
     * Muestra el contenido del array doble
     */
    public static void mostrarMatriz(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + ",");
            }
            System.out.println();
        }
    }
    /**comtrol de arrays*/
    /*public static void arrayExepcion(int[]array){

        int num=0;
        boolean fin=false;
        do {
            try {
                System.out.println("dime numero");
                array[num]=lector.nextInt();
                num++;

            }catch(IndexOutofBoundsExcepcion e) {
                System.out.println("te saliste del array");
                fin=true;

            }catch(InputMIsmatchException e){
                System.out.println("caracter mal introducido");
                lector.nextLine();
            }

        }while(!fin);
    }*/

    /**
     * Nos muestra la posicion
     */
    public static void posicion(char[] array) {
        System.out.println("Las posiciones del array  contienen ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    /**
     * Nos da la pos del la silla vacia
     */
    public static int seleccionaSillaVacia(Entrada[] clase) {
        int pos = -1;//si el array esta lleno nos devolvera el -1;

        for (int i = 0; i < clase.length; i++) {
            if (clase[i] == null) {
                pos = i;
                break;//al primer hueco para la busqueda;
            }
        }
        return pos;
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


}