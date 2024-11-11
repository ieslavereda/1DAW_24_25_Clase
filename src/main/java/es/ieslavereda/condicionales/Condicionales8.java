package es.ieslavereda.condicionales;

import es.ieslavereda.Entrada;

public class Condicionales8 {

    public static void main(String[] args) {

        System.out.println("Introduce un numero");
        int num = Entrada.getEntero();

        switch ( num%2 ){
            case 0:
                System.out.println("PAR");
                break;
            default:
                System.out.println("IMPAR");
        }

    }
}
