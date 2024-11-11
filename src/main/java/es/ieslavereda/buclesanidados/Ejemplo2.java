package es.ieslavereda.buclesanidados;

import es.ieslavereda.Entrada;

public class Ejemplo2 {

    public static void main(String[] args) {

        int cantidad = Entrada.getEntero();
        String texto="";



        for(int j=0;j<cantidad;j++){
            texto="";
            for(int i=0;i<cantidad;i++) {
                texto += "* ";
            }

            System.out.println(texto);
        }


    }
}
