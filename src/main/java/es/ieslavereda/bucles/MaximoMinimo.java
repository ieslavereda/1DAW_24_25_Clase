package es.ieslavereda.bucles;

import es.ieslavereda.Entrada;

public class MaximoMinimo {

    public static void main(String[] args) {

        int max;
        int min;
        int aux;

        System.out.println("Introduce un numero");
        aux= Entrada.getEntero();
        max=aux;
        min=aux;

        for(int i=0;i<4;i++) {
            System.out.println("Introduce un numero");
            aux = Entrada.getEntero();

            max  = Math.max(aux,max);
            min = Math.min(aux,min);

//            if (aux < min)
//                min = aux;
//            if (aux > max)
//                max = aux;

            //System.out.println(i+" Max: "+ max+", Min: "+min);
        }

        System.out.println("Max: "+ max+", Min: "+min);






    }
}
