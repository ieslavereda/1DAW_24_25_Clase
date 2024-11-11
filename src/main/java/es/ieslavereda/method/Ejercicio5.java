package es.ieslavereda.method;

import es.ieslavereda.Entrada;

public class Ejercicio5 {


    public static void main(String[] args) {

        int edad;

        System.out.println("Introduce tu edad:");
        edad= Entrada.getEntero();

        if(esMayorEdad(edad))
            System.out.println("Mayor de edad");
        else
            System.out.println("Menor de edad");


    }




    public static boolean esMayorEdad(int a){

        if(a>=18)
            return true;
        else
            return false;

    }
}
