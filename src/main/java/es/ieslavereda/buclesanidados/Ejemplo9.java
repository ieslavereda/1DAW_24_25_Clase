package es.ieslavereda.buclesanidados;

public class Ejemplo9 {
    public static void main(String[] args) {


        int num = 4;

        for(int b=num-1,a=1;b>0;b=b-1,a=a+2){

            dibujarLinea(b,a);


        }

        for(int b=0,a=num*2-1;a>=1;b++,a-=2){
            dibujarLinea(b,a);
        }

    }

    public static void dibujarLinea(int espaciosBlanco, int asteriscos){


        dibujarLinea(espaciosBlanco,' ');

        dibujarLinea(asteriscos,'*');

        System.out.println();
    }



    public static void dibujarLinea(int cantidad,char caracter){
        for(int i=0;i<cantidad;i++)
            System.out.print(caracter);
    }
}
