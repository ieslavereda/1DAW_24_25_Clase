package es.ieslavereda.cuaderno.bloque2;

import es.ieslavereda.Entrada;

public class E3 {

    public static void main(String[] args) {


        int cantidad = 0;
        int aux;


        do {

            System.out.println("Introduce un numero");
            aux = Entrada.getEntero();
            if (aux >= 0)
                cantidad++;

        }while (aux>=0);


        System.out.println("Has introducido " + cantidad + " numeros.");


    }
}
