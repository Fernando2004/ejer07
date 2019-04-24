package com.fernandogarcia.ejer07.utils;

import com.fernandogarcia.ejer07.ejer07.Zona;
import com.fernandogarcia.ejer07.misexception.NumerosNegativoException;

import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class Lib {

    public static Scanner lector = new Scanner(System.in);
    public static Random rd =new Random();


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
    public static String crearClave(){
        String clave=UUID.randomUUID().toString().toUpperCase().substring(0,6);
     return clave;
    }

    /**Cambia el Precio*/
    public static double cambiaPrecio(double porcentaje){

        double precioBase=350;
        double cambio=precioBase*porcentaje/100;

        return cambio;
    }
    /**No retorna el valor maximo del array doble*/
    public static  int arrayMax (int[][] array){

        int max=Integer.MIN_VALUE;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                if (array[i][j] >max){
                    max=array[i][j];
                }
            }
        }
        return max;
    }
    /**Rellenamos el array doble con numeros del 0 al 99*/
    public static void rellenaArrayNum (int[][] array) {

        int num=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = num++;
            }
        }
        mostrarArray(array);
    }

    /**Rellenamos el array doble*/
    public static void rellenaArray (int[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = rd.nextInt(9 - 0 + 1) + 0;
            }
        }
        mostrarArray(array);
    }
    /**Muestra el contenido del array doble*/
    public static void mostrarArray(int[][] array){
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]+",");
            }
            System.out.println();
        }
    }








}

