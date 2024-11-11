package es.ieslavereda.bucles;

import es.ieslavereda.Entrada;

public class Capicua1 {

    public static void main(String[] args) {

        System.out.println("Introduce un numero");
        int num = Entrada.getEntero();

        String numAsString = String.valueOf(num);

        // 7657  ->  7567

        String numReverse = "";

        for(int i=numAsString.length()-1;i>=0;i--)
            numReverse = numReverse + numAsString.charAt(i);

        if(numReverse.equals(numAsString))
            System.out.println("CAPICUA");
        else
            System.out.println("NO CAPICUA");

    }


}
