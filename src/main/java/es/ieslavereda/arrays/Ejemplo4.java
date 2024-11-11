package es.ieslavereda.arrays;

import es.ieslavereda.Entrada;

public class Ejemplo4 {

    /*
       0       1
    ----------------
    | Sr | Joaquin |
    ----------------
    | Sra | Luisa  |
    ----------------

     */

    public static void main(String[] args) {

        String[][] personas;
        int cantidadPersonas;

        cantidadPersonas = Entrada.getEntero("Cuantas personas quieres almacenar?:");
        personas = new String[cantidadPersonas][2];

        for(int fila = 0;fila<personas.length;fila++){

            String tratamiento = Entrada.getTexto("Sr o Sra");
            String nombre = Entrada.getTexto("Como se llama " + tratamiento +" ?");

            personas[fila][0] = tratamiento;
            personas[fila][1] = nombre;

        }

        for(int fila = 0;fila<personas.length;fila++){

            System.out.println(personas[fila][0] + " -> " +personas[fila][1]);

        }

    }

}
