package es.ieslavereda.condicionales;

import es.ieslavereda.Entrada;

public class Condicionales6 {

    public static void main(String[] args) {

        System.out.println("Introduce un numero");
        int num = Entrada.getEntero();

        switch (num){

            case 0:
                System.out.println("Es cero");
                break;
            case 1:
                System.out.println("Es uno");
                break;

            case 2:
                System.out.println("Es dos");
                break;

            default:
                System.out.println("Es otro numero");



        }


    }
}
