package es.ieslavereda.condicionales;

import es.ieslavereda.Entrada;

public class Condicionales7 {
    public static void main(String[] args) {

        System.out.println("Introduce un texto");
        String texto = Entrada.getTexto();

        char letra = texto.toLowerCase().charAt(0);

        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es una vocal");
                break;
            default:
                System.out.println("Es una consonante");


        }


    }
}
