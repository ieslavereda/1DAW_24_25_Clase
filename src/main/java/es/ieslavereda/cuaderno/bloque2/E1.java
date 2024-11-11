package es.ieslavereda.cuaderno.bloque2;

import es.ieslavereda.Entrada;

public class E1 {

    public static void main(String[] args) {


        int num;

        do {

            System.out.println("Introduce un numero: ");

            num = Entrada.getEntero();


            if (num >= 0)
                System.out.println(Math.pow(num, 2));

        }while (num >= 0);



    }
}
