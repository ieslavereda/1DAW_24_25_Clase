package es.ieslavereda.condicionales;

import es.ieslavereda.Entrada;

public class Condicionales5 {

    public static void main(String[] args) {


        System.out.println("Introduce un texto");
        String texto = Entrada.getTexto();

        if( ! texto.isEmpty()) {

            char letra = texto.toLowerCase().charAt(0);

            if(
                    letra == 'a' ||
                    letra == 'e' ||
                    letra == 'i' ||
                    letra == 'o' ||
                    letra == 'u'
            ){

                System.out.println("Comienza por vocal");

            } else if(letra=='ñ') {

                System.out.println("Empieza or consonate");

            } else if(letra<'a' || letra>'z'){

                System.out.println("No es una letra");

            } else

                System.out.println("Comienza por consonante");

        } else
            System.out.println("El texto esta vacio");

    }


}
