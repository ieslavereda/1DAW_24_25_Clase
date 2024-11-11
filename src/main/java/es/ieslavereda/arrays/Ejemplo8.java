package es.ieslavereda.arrays;

import java.util.Arrays;

import static es.ieslavereda.arrays.Ejemplo6.show;

public class Ejemplo8 {

    public static void main(String[] args) {


        int[] numeros1 = new int[]{5,69,7,6,2,0};
        int[] numeros2 = new int[]{1,8,99,74,5,83,2,6};


        //Arrays.sort(numeros1);

        System.out.println(Arrays.toString(numeros1));

        System.out.println(Arrays.binarySearch(numeros1,0));

//        int[] numeros3 = joingArrays(numeros1,numeros2);
//
//
//        showArray(numeros3);

    }

    private static void showArray(int[] numeros3) {


        for (int numero : numeros3)
            System.out.println(numero);



    }

    public static int[] joingArrays(int[] numeros1, int[] numeros2) {


        int[] array = new int[numeros1.length+numeros2.length];

//        for(int i=0;i<numeros1.length;i++)
//            array[i]=numeros1[i];
//
//        for(int i=0;i<numeros2.length;i++)
//            array[numeros1.length+i]=numeros2[i];

//        int pos=0;
//        for(int i=numeros1.length;i<array.length;i++)
//            array[i]=numeros2[pos++];

        System.arraycopy(numeros1,0,array,0,numeros1.length);
        System.arraycopy(numeros2,0,array,numeros1.length,numeros2.length);

        return array;
    }
}



