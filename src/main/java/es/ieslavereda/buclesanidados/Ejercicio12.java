package es.ieslavereda.buclesanidados;

public class Ejercicio12 {

    /*
             col
          1 2 3 4 5

fila=1    1 0 0 0 0
fila=2    0 2 0 0 0
fila=3    0 0 3 0 0
fila=4    0 0 0 4 0
fila=5    0 0 0 0 5

     */

    public static void main(String[] args) {

        int num = 5;

        for (int fila = 1; fila <= num; fila++) {
            for (int col = 1; col <= num; col++)
                if (fila != col)
                    System.out.print(0);
                else
                    System.out.print(fila);

            System.out.println();
        }

    }
}
