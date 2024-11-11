package es.ieslavereda.buclesanidados;

import es.ieslavereda.Entrada;

public class Ejemplo4 {
    public static void main(String[] args) {

        String texto;
        int cantida = Entrada.getEntero();


        for(int j=cantida;j>0;j--) {
            texto = "";
            for (int i = 0; i < j; i++)
                texto += "*";
            System.out.println(texto);
        }

    }
}
