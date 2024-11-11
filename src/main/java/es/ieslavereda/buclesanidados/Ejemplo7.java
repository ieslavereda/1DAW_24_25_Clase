package es.ieslavereda.buclesanidados;

import org.w3c.dom.ls.LSOutput;

public class Ejemplo7 {

    /*

        *      3 1
       ***     2 3
      *****    1 5
     *******   0 7

     */

    public static void main(String[] args) {

        int num = 5;

        for(int b=num-1,a=1;b>=0;b=b-1,a=a+2){

            for(int i=0;i<b;i++) {
                System.out.print(" ");
            }

            for(int i=0;i<a;i++) {
                System.out.print("*");
            }

            System.out.println();


        }


    }

}
