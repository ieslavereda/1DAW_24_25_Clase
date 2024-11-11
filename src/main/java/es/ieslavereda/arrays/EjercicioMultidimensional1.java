package es.ieslavereda.arrays;

import java.util.Scanner;

public class EjercicioMultidimensional1 {

    public static void main(String[] args) {

        String[][] notas = new String[7][5];

        notas[0][0] = "\t";
        notas[6][4] = "\t";
        notas[notas.length - 1][0] = "Media";
        notas[0][notas[0].length - 1] = "Media";


        rellenarAlumnos(notas);
        rellenarAsignaturas(notas);
        rellenarNotas(notas);
        mediaAsignatura(notas);
        mediaAlumno(notas);

        show(notas);

    }

    private static void rellenarNotas(String[][] notas) {

        for (int fila = 1; fila < notas.length - 1; fila++)
            for (int col = 1; col < notas[fila].length - 1; col++)
                notas[fila][col] = String.valueOf(getGrade());

    }

    private static void rellenarAsignaturas(String[][] notas) {

        for (int fila = 1; fila < notas.length - 1; fila++)
            notas[fila][0] = getText("Dame el nombre para la " + fila + "ª asignatura");
    }

    private static void rellenarAlumnos(String[][] notas) {

        for (int col = 1; col < notas[0].length - 1; col++)
            notas[0][col] = getText("Dame el nombre para el " + col + "º alumno");


    }

    public static void show(String[][] array) {

//        for(int fila=0;fila<array.length;fila++){
//
//            for (int col=0;col<array[fila].length;col++){
//                System.out.print(array[fila][col]+"\t");
//            }
//            System.out.println();
//
//
//        }

        for (String[] fila : array) {
            for (String value : fila)
                System.out.print(value + "\t");

            System.out.println();
        }


    }

    public static String getText(String text) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextLine();
    }

    public static float getGrade() {
        return ((int) (Math.random() * 1000)) / 100f;
    }

    public static void mediaAsignatura(String[][] notas) {

        float suma;

        for (int fila = 1; fila < notas.length - 1; fila++) {
            suma = 0;
            for (int col = 1; col < notas[fila].length - 1; col++)
                suma += Float.parseFloat(notas[fila][col]);

            notas[fila][notas[fila].length - 1] = String.valueOf(suma / (notas[fila].length - 2));
        }


    }

    public static void mediaAlumno(String[][] notas) {


        float suma;

        for(int col = 1;col< notas[0].length-1;col++) {
            suma = 0;
            for (int fila = 1; fila < notas.length - 1; fila++)
                suma += Float.parseFloat(notas[fila][col]);

            notas[notas.length - 1][col] = String.valueOf(suma / (notas.length - 2));
        }

    }

}
