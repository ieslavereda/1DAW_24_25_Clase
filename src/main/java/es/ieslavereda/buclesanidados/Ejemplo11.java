package es.ieslavereda.buclesanidados;

import es.ieslavereda.Entrada;

public class Ejemplo11 {


    public static void main(String[] args) {

        int n = Entrada.getEntero();
        int cantidad=0;

        for(int num=1;num<=n;num++) {


            if (esPrimo(num)) {
                cantidad++;
                System.out.println(num + " es primo");
            }

        }
        System.out.println("Hay " + cantidad + " numeros primos.");

    }

    public static boolean esPrimo(int num){

        int i = 2;
        boolean esPrimo = true;


        while (i < num && esPrimo) {
            if (num % i == 0)
                esPrimo = false;

            i++;
        }


        return esPrimo;
    }

}










