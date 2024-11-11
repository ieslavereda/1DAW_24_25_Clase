package es.ieslavereda.condicionales;

import es.ieslavereda.Entrada;

public class Condicionales2 {


    public static void main(String[] args) {

        System.out.println("Introduce un numero:");

        int num = Entrada.getEntero();


        if(num%2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        System.out.println(num);

    }

}
