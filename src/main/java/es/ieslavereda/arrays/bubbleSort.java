package es.ieslavereda.arrays;

import java.util.Arrays;

public class bubbleSort {

    public static void main(String[] args) {

        String[] numeros = new String[]{"arbol","zorro","camion","bicicleta","monopatin"};
        String aux;

        System.out.println(Arrays.toString(numeros));

        for(int j=0;j< numeros.length;j++) {
            for (int i = 0; i < numeros.length - 1; i++) {
                if (numeros[i].compareTo(numeros[i + 1])>0) {
                    aux = numeros[i + 1];
                    numeros[i + 1] = numeros[i];
                    numeros[i] = aux;
                }
            }
            System.out.println(Arrays.toString(numeros));
        }



    }
}
