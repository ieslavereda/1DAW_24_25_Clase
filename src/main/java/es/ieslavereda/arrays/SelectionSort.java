package es.ieslavereda.arrays;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {


        int[] numeros = new int[]{-5, 3, 7, 7, 0, -3, 15};
        int aux;
        int posMenor;

        System.out.println(Arrays.toString(numeros));

        for(int pos=0;pos < numeros.length-1;pos++){

            posMenor = menor(numeros,pos);

            aux=numeros[pos];
            numeros[pos]=numeros[posMenor];
            numeros[posMenor]=aux;


            System.out.println(Arrays.toString(numeros));

        }





    }


    private static int menor(int[] array,int begin){

        int posicionMenor=begin;

        for(int i=begin+1;i< array.length;i++){

            if(array[i]<array[posicionMenor])
                posicionMenor=i;

        }

        return posicionMenor;
    }

}
