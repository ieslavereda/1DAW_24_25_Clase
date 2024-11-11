package es.ieslavereda.arrays;

import java.util.Scanner;

public class Ejemplo1 {

    public static void main(String[] args) {


        int[] numeros = new int[3];



        int[][] numeros3 = new int[3][3];
        int[][] numeros4 = new int[][]{
                {1,4,5},
                {1,7,3},
                {23,4,6,5}
        };

        String[] cabecera = new String[]{"DNI","NOMBRE","APELLIDOS"};

        int[] numeros2 = new int[]{1,5,2,7,89};


        for(int i=0;i<numeros2.length;i++){
            System.out.println(numeros2[i]);
        }






//        System.out.println(numeros[1]);
//        numeros[1]=100;
//        System.out.println(numeros[1]);



    }
}
