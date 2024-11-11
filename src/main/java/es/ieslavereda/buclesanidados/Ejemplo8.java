package es.ieslavereda.buclesanidados;

public class Ejemplo8 {


    public static void main(String[] args) {

        /* 4

        ******* 0 7  -> 4
         *****  1 5  -> 3
          ***   2 3  -> 2
           *    3 1

         */

        int num = 4;

        for(int b=0,a=num*2-1;a>=1;b++,a-=2){

            for(int i=0;i<b;i++)
                System.out.print(" ");

            for(int i=0;i<a;i++)
                System.out.print("*");

            System.out.println();
        }
    }
}
