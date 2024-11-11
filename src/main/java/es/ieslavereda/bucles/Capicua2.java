package es.ieslavereda.bucles;

import es.ieslavereda.Entrada;

public class Capicua2 {


    public static void main(String[] args) {

        System.out.println("Introduce un numero");
        int num = Entrada.getEntero();

        String numAsString = String.valueOf(num);


        // 765467
        int i=-1;
        int j=numAsString.length();

        do{

            i++;
            j--;

            System.out.println(i+" "+j);

        }while (numAsString.charAt(i)==numAsString.charAt(j)&&i<j);

        if(i<j)
            System.out.println("NO CAPICUA");
        else
            System.out.println("CAPICUA");




    }
}
