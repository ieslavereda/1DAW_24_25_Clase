package es.ieslavereda.bucles;

import es.ieslavereda.Entrada;

public class DoWhile {


    public static void main(String[] args) {
        
        int num;
        System.out.println("Introduce un numero:");
        do {

            num = Entrada.getEntero();

            if (num < 1 || num > 4)
                System.out.println("Solo entre 1 y 4. Vuelve a intentarlo:");

        }while (num < 1 || num > 4);

        System.out.println(num);

    }
}
