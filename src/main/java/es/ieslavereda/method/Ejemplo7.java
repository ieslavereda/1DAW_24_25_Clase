package es.ieslavereda.method;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Ejemplo7 {
    /*
               b a
        *      3 1
       ***     2 3
      *****    1 5
     *******   0 7

     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        char letra = sc.nextLine().charAt(0);

        System.out.println("Introduce el tamaño");
        int cantidad = sc.nextInt();

        dibujaTriangulo(cantidad,letra);

    }

    public static void dibujaTriangulo(int cantidad,char caracter){
        for(int b=cantidad-1,a=1;b>=0;b--,a+=2){
            dibuja(b,' ');
            dibujaConSalto(a,caracter);
        }
    }

    public static void dibuja(int cantidad,char caracter){
        for(int i=0;i<cantidad;i++)
            System.out.print(caracter);
    }
    public static void dibujaConSalto(int cantidad,char caracter){
        dibuja(cantidad,caracter);
        System.out.println();
    }
}
