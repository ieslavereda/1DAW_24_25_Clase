package es.ieslavereda.condicionales;

import es.ieslavereda.Entrada;

public class Condicionales3 {

    public static void main(String[] args) {

        int num1;
        int num2;


        System.out.print("Ingrese el primer numero: ");
        num1 = Entrada.getEntero();

        System.out.println("Ingresa el segundo numero:");
        num2 = Entrada.getEntero();

        if (num1 > num2) {
            System.out.println("El mayor es " + num1);
        } else if(num1==num2){
            System.out.println("Los dos numero son iguales");
        } else {
            System.out.println("El mayor es " + num2);
        }



    }

}
