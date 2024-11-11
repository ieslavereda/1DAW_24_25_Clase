package es.ieslavereda.method;

import es.ieslavereda.Entrada;

public class Ejercicio6 {

    public static void main(String[] args) {

        int num;

        System.out.println("Introduce un numero");
        num = Entrada.getEntero();


        if(dimeSigno(num)==-1)
            System.out.println("Negativo");
        else if(dimeSigno(num)==1)
            System.out.println("Positivo");
        else
            System.out.println("Cero");

    }


    public static int dimeSigno(int a){

        if(a==0)
            return 0;
        else if(a>0)
            return 1;
        else
            return -1;

    }
}
