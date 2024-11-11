package es.ieslavereda.ejercicios;

public class Ejercicio1 {

    public static void main(String[] args){

        String texto;
        String texto1;
        String texto2;

        texto = "En un lugar de la Mancha ....";

        System.out.println(texto.charAt(2));

        texto1 = new String("arbol");
        texto2 = "arbol";

        System.out.println(texto2.compareToIgnoreCase(texto1));

        System.out.println(texto1.concat(texto));
        System.out.println(texto1+texto);

        System.out.println(texto.contains("lugar"));

        System.out.println(texto.endsWith(".."));

        System.out.println(texto1.equals(texto2));

        System.out.println(texto1 == texto2);

        //System.out.println(texto1 == texto1);

        texto1 = texto2;
        System.out.println(texto1 == texto2);

        System.out.println(texto.indexOf('Ñ'));

        System.out.println(texto.indexOf('l')); // 6
        System.out.println(texto.indexOf('l',7)); // 15
        System.out.println(texto.indexOf('l',16)); // -1

        System.out.println(texto.isEmpty()); // false
        System.out.println("".isEmpty()); // true

        System.out.println(texto1.charAt(texto1.length()-1));

        System.out.println(texto.replaceFirst("a","e"));
        System.out.println(texto.replaceAll("a","o"));

        System.out.println(texto.substring(4));
        System.out.println(texto.substring(4,7));

        System.out.println("   En un lugar de la Mancha      ".trim());

        System.out.println(String.valueOf(4.5)+1);

        System.out.println(Math.pow(2,8));

        System.out.println(Math.random());

    }

}
