package es.ieslavereda.arrays;

import es.ieslavereda.Entrada;

public class Ejemplo6 {


    public static void main(String[] args) {


        int[] numeros = new int[100];
        int valor;
        int posicion;

        fill(numeros);

        valor = Entrada.getEntero("Dame el valor a buscar:");

        show(numeros);

        posicion = find(valor, numeros);

        if (posicion == -1)
            System.out.println("No esta el elemento");
        else
            System.out.println("El elemento esta en la posicion " + posicion);


    }

    public static void fill(int[] numeros) {

        for (int i = 0; i < numeros.length; i++)
            numeros[i] = getRandom(0, 200);

    }


    public static int find(int numero, int[] array) {

        if (array == null || array.length == 0) return -1;

        int posicion = 0;
        boolean encontrado = false;

        do {

            if (array[posicion] == numero)
                encontrado = true;
            else
                posicion++;

        } while (!encontrado && posicion < array.length);

        if (encontrado)
            return posicion;
        else
            return -1;

    }

    public static int getRandom(int inf, int sup) {
        return (int) (Math.random() * (sup - inf + 1) + inf);
    }

    public static void show(int[] array) {

        for (int i = 0; i < array.length; i++)
            System.out.println(i + " -> " + array[i]);

    }


}
