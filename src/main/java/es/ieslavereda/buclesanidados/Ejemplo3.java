package es.ieslavereda.buclesanidados;

import es.ieslavereda.Entrada;

public class Ejemplo3 {

    public static void main(String[] args) {

        String texto;
        int num = Entrada.getEntero();

        texto="";
        for(int i=0;i<num;i++)
            texto+="*";
        System.out.println(texto);

        for(int j=0;j<num-2;j++) {
            texto = "*";

            // Pintare " "
            for (int i = 0; i < num - 2; i++)
                texto += " ";

            texto += "*";

            System.out.println(texto);
        }

        texto="";
        for(int i=0;i<num;i++)
            texto+="*";
        System.out.println(texto);

    }
}
