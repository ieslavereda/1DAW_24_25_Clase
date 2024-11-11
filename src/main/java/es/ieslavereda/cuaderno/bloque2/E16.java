package es.ieslavereda.cuaderno.bloque2;

import es.ieslavereda.Entrada;

public class E16 {

    public static void main(String[] args) {

        int num;

        do {
            System.out.println("Introduce un numero entre el 0 y el 10.");
            num = Entrada.getEntero();
            if (num < 0 || num > 10)
                System.out.println("Solo valores entre [0,10]");
        }while (num < 0 || num > 10);



        for(int i=0;i<=10;i++)
            System.out.println(num + " x " + i +" = " + (num*i));




    }
}
