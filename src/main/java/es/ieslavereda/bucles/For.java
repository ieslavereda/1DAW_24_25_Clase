package es.ieslavereda.bucles;

public class For {

    public static void main(String[] args) {

        /*

        for( <inicializacion> ; <condicion> ; <incremento> ){

            <sentencias a repetir>

        }

         */


//        for(int i=1;i<=10;i++) {
//            System.out.println(i);
//        }
//
//        for(int i=10;i>0;i--) {
//            System.out.println(i);
//        }

//        for(int i=10,j=1;i>0;i--,j++) {
//            System.out.println(i + "  " + j);
//        }
//
//
//        for(int i=1;i<=10;i+=2) {
//
//            System.out.println(i);
//
//        }

        String texto = "Hola Mundo";

//        for(int i=0;i<=texto.length()-1;i++) {
//            System.out.println(texto.charAt(i));
//        }
//
//        for(int i=texto.length()-1;i>=0;i--) {
//            System.out.print(texto.charAt(i));
//        }
//        System.out.println();

        texto = "HOla Mundo";
        for (int i = 0; i <= texto.length() - 1; i++) {

            char letra = texto.toLowerCase().charAt(i);
            if (
                    letra == 'a' ||
                    letra == 'e' ||
                    letra == 'i' ||
                    letra == 'o' ||
                    letra == 'u'
            )
                System.out.print(texto.charAt(i));

        }


        // odnuM aloH

        System.out.println();
        texto = "En un Lugar De la MANcha";
        System.out.println(texto);
        String aux = "";

        for(int i=0;i<texto.length();i++){

            char letra = texto.charAt(i);

            if(letra == texto.toLowerCase().charAt(i))
                aux = aux + String.valueOf(letra).toUpperCase();
            else
                aux+=String.valueOf(letra).toLowerCase();

        }

        System.out.println(aux);


    }

}
