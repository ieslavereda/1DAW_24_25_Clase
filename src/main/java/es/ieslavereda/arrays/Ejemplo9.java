package es.ieslavereda.arrays;

import java.util.Arrays;

public class Ejemplo9 {

    public static void main(String[] args) {


        int[] numeros1 = new int[]{5,69,7,6,2,0};
        int[] numeros2 = new int[]{1,8,99,74,5,83,2,6};

        Arrays.sort(numeros1);
        Arrays.sort(numeros2);

        int[] numeros3 = joinSorted(numeros1,numeros2);


        System.out.println(Arrays.toString(numeros1));
        System.out.println(Arrays.toString(numeros2));
        System.out.println(Arrays.toString(numeros3));

        int[] numeros4 = Arrays.copyOfRange(numeros3,3,6);
        System.out.println(Arrays.toString(numeros4));

        numeros4 = addTail(100,numeros4);
        System.out.println(Arrays.toString(numeros4));



    }

    public static int[] joinSorted(int[] numeros1, int[] numeros2) {

        int[] numeros3 = new int[numeros1.length+ numeros2.length];

        int i=0;
        int j=0;
        int k=0;

        while (i<numeros1.length && j< numeros2.length){

            if(numeros1[i]<numeros2[j])
                numeros3[k++]=numeros1[i++];
            else
                numeros3[k++]=numeros2[j++];

        }

//        System.arraycopy(numeros1,i,numeros3,k,numeros1.length-i);
//        System.arraycopy(numeros2,j,numeros3,k,numeros2.length-j);


        for(int l=i;l< numeros1.length;l++)
            numeros3[k++]=numeros1[l];


        for(;j< numeros2.length;j++)
            numeros3[k++]=numeros2[j];

        return numeros3;
    }


    public static int[] addTail(int elemento, int[] array){

//        int[] resultado = new int[array.length+1];
//
//        for(int i=0;i<array.length;i++)
//            resultado[i]=array[i];

        int[] resultado = Arrays.copyOf(array,array.length+1);

        resultado[array.length]=elemento;

        return resultado;

    }

    public static int[] addHead(int elemento, int[] array){
        return null;
    }




}
