package es.ieslavereda.arrays;

public class Ejemplo7 {


    public static void main(String[] args) {

        int[] numeros = new int[]{1,2,3,3,3,4,5,6,7,3,0};


        int[] posiciones = findAll(3,numeros);

        Ejemplo6.show(posiciones);



    }

    public static int[] findAll(int numero,int[] array){


        int cantidad = contar(numero,array);
        int[] posiciones = new int[cantidad];
       // int j=0;
        int pos=0;

        for(int i=0;i<posiciones.length;i++) {

            posiciones[i]=find(3,array,pos);
            pos=posiciones[i]+1;


//            do{
//                j++;
//            }while (numero!=array[j]);
//
//            posiciones[i]=j;


        }



        return posiciones;
    }


    public static int contar(int numero,int[] array){

        int cantidad=0;

        for(int i=0;i<array.length;i++)
            if(numero==array[i]) cantidad++;

        return cantidad;

    }


    public static int find(int numero, int[] array, int inicio) {

        if (array == null || array.length == 0) return -1;

        int posicion = inicio;
        boolean encontrado = false;

        do {

            if (array[posicion] == numero)
                encontrado = true;
            else
                posicion++;

        } while (!encontrado && posicion < array.length);

        if (encontrado)
            return posicion;
        else
            return -1;

    }

}
