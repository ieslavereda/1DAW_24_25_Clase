package es.ieslavereda.buclesanidados;

public class Examen2324E3 {
    /*

    1111
    0222
    0033
    0004


       0 1 2 3

 f=1   1 1 1 1
 f=2   2 2 2 2
 f=3   3 3 3 3
 f=4   4 4 4 4

     */


    public static void main(String[] args) {

        for (int fila = 1,b=0; fila <= 4; b++,fila++) {

            for(int i=0;i<b;i++)
                System.out.print(0);

            for(int i=0;i<4-fila+1;i++)
                System.out.print(fila);

            System.out.println();

        }

//        for(int i=0;i<4;i++)
//            System.out.print(2);
//        System.out.println();
//
//        for(int i=0;i<4;i++)
//            System.out.print(3);
//        System.out.println();


    }

}
