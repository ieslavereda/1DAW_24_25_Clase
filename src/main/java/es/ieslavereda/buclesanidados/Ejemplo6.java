package es.ieslavereda.buclesanidados;

public class Ejemplo6 {

    /*

       *  2 1
      **  1 2
     ***  0 3

     */

    public static void main(String[] args) {

        int num=3;

        for(int b=num-1,a=1;a<=num;b--,a++){

            for(int i=0;i<b;i++)
                System.out.print(" ");

            for(int i=0;i<a;i++)
                System.out.print("*");

            System.out.println();


        }


    }
}
