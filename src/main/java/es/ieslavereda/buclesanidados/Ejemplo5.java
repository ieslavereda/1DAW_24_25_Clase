package es.ieslavereda.buclesanidados;

import es.ieslavereda.Entrada;

public class Ejemplo5 {

    /*

    ***
     **
      *

        *
       **
      ***

       *
      ***
     *****

     *****
      ***
       *


       *
      ***
     *****
      ***
       *


     */

    public static void main(String[] args) {

        int num = Entrada.getEntero();
        String texto;


       for(int b=0,a=num;a>0;b++,a--){

           // " "
           texto="";
           for(int i=0;i<b;i++)
               texto+=" ";

           // "*"
           for(int i=0;i<a;i++)
               texto+="*";

           System.out.println(texto);

       }

    }
}
