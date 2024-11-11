package es.ieslavereda.cuaderno.bloque2;

import es.ieslavereda.Entrada;

public class E2 {

    public static void main(String[] args) {


        int num;

        System.out.println("Introduce un numero");
        num = Entrada.getEntero();

        while (num!=0){

            if(num>0)
                System.out.println("Positivo");
            else
                System.out.println("Negativo");

            System.out.println("Introduce un numero");
            num = Entrada.getEntero();
        }



    }
}
