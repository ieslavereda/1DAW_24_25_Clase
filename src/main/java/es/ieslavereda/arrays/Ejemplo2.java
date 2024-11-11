package es.ieslavereda.arrays;

public class Ejemplo2 {

    public static void main(String[] args) {

        int[] numeros = new int[10];

        for(int i=0;i<numeros.length;i++) {
            numeros[i] = i + 1;
        }

        for(int i=0;i<numeros.length;i++)
            System.out.println(numeros[i]);

    }
}
