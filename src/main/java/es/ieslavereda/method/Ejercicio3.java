package es.ieslavereda.method;

public class Ejercicio3 {

    public static void main(String[] args) {

        System.out.println(substring("Hola como estas",2,11));

    }


    public static String substring(String texto,int lower,int upper){

        if(lower<0) lower=0;

        if(upper>texto.length()-1) upper=texto.length();

        if(lower>upper) return "";


        String resultado="";

        for(int i=lower;i<=upper;i++)
            resultado+=texto.charAt(i);


        return resultado;
    }
}
