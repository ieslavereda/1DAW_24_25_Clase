package es.ieslavereda;

import java.util.Scanner;

public class Entrada {

    private static Scanner scanner = new Scanner(System.in);

    public static String getTexto(String texto){
        scanner = new Scanner(System.in);

        System.out.println(texto);
        return scanner.nextLine();
    }

    public static String getTexto(){
        scanner = new Scanner(System.in);

        return scanner.nextLine();
    }



    public static int getEntero(){
        scanner = new Scanner(System.in);

        while(!scanner.hasNextInt()) {
            scanner.nextLine();
            System.out.println("Debes introducir un numero entero.");
        }

        return scanner.nextInt();

    }

    public static int getEntero(String texto){

        System.out.println(texto);

        return getEntero();

    }

    public static float getDecimal(){
        scanner = new Scanner(System.in);
        while (!scanner.hasNextFloat()) {
            scanner.nextLine();
            System.out.println("Debes introducir un decimal.");
        }

        return scanner.nextFloat();
    }


}
