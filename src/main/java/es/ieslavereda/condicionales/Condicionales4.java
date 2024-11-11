package es.ieslavereda.condicionales;

import es.ieslavereda.Entrada;

public class Condicionales4 {

    public static void main(String[] args) {

        String texto;
        int num1;
        int num2;
        int num3;

        System.out.println("Introduce un texto");
        texto= Entrada.getTexto();

        System.out.println("Introduce un primer numero");
        num1= Entrada.getEntero();

        System.out.println("Introduce un segundo numero");
        num2= Entrada.getEntero();

        if(num1<0)
            num1=0;
        else if(num1>texto.length())
            num1=texto.length();


        if(num2>texto.length())
            num2=texto.length();
        else if(num2<0)
            num2=0;


        if(num1>num2){
            num3=num2;
            num2=num1;
            num1=num3;
        }


        System.out.println(num1+" "+num2);

        System.out.println(texto.substring(num1,num2));

    }
}
