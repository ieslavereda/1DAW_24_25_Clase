package es.ieslavereda.arrays;

import es.ieslavereda.Entrada;

public class Ejercicio2 {

    public static void main(String[] args) {

        int[] numeros = new int[10];

        rellenar(numeros);

        show(numeros);

        System.out.println("La suma es : " + obtenerSuma(numeros));

        int[] minMax = obtenerMaximoMinimo(numeros);
        System.out.println("El minimo "+minMax[0]+" y el maximo es "+ minMax[1]);


    }

    private static void show(int[] numeros) {

        for(int i=0;i<numeros.length;i++){
            System.out.print(numeros[i] +" ");
        }
        System.out.println();

    }

    public static void rellenar(int[] numeros){
        for(int i=0;i<numeros.length;i++){
            numeros[i] = Entrada.getEntero("Valor para la posicion " + i);
        }

    }

    public static int obtenerSuma(int[] numeros){

        int suma = 0;

        for(int i=0;i<numeros.length;i++)
            suma+=numeros[i];

        return suma;

    }

    public static int[] obtenerMaximoMinimo(int[] numeros){

        int max = numeros[0];
        int min = numeros[0];

        for(int i=1;i<numeros.length;i++){
            max = Math.max(max,numeros[i]);
            min = Math.min(min,numeros[i]);
        }


        return new int[]{min,max};

    }

    public static int[] obtenerSumaPositivosNegativos(int numeros){

        return null;

    }
//
//    public static int obtenerMedia(int[] numeros){
//
//    }





}
