package es.ieslavereda.condicionales;

import es.ieslavereda.Entrada;

public class Ejercicio1 {

    public static void main(String[] args) {

        System.out.println("Introduce un numero");
        int num= Entrada.getEntero();


        if(num > 2 && num < 5)
            System.out.println("Hola");
        else if(num >7 && num <10)
            System.out.println("Adios");
        else
            System.out.println("Bye!!!");


        switch (num){

            case 3:
            case 4:
                System.out.println("Hola");
                break;
            case 8:
            case 9:
                System.out.println("Adios");
                break;
            default:
                System.out.println("Bye!!!");
                
        }



    }


}
