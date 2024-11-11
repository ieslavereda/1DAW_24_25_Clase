package es.ieslavereda.arrays;

import es.ieslavereda.Entrada;

public class Ejemplo3 {

    public static void main(String[] args) {

        String[] nombres;
        int cantidad;

        cantidad = Entrada.getEntero("Cuantos nombres deseas almacenar?:");
        nombres = new String[cantidad];

        for(int i=0;i<nombres.length;i++)
           nombres[i] = Entrada.getTexto("Introduce el nombre para la " +(i+1)+" persona");

        for(int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);
        }

    }
}
