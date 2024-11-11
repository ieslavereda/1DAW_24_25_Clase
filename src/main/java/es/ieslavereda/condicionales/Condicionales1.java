package es.ieslavereda.condicionales;

public class Condicionales1 {

    public static void main(String[] args) {


        /*
        if(<exp booleana>){

            sentecias

        }
        */

        int edad=25;

        if(edad>=18) {

            System.out.println("Es mayor de edad");
        }

        System.out.println("Adios");


        int num=0;

        if(num>=0) {
            System.out.println("Positivo");
        }


        String texto = "Camion";

        char caracter1 = texto.charAt(0);
        char caracter2 = texto.toUpperCase().charAt(0);

        if(caracter1 == caracter2){
            System.out.println("Mayuscula");
        }


        if(texto.charAt(0)>=65 && texto.charAt(0)<='Z'){
            System.out.println("Mayuscula");
        }

        if(Character.isUpperCase(texto.charAt(0))){
            System.out.println("Mayuscula");

        }


    }
}
