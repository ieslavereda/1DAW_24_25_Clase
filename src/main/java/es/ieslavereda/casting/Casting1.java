package es.ieslavereda.casting;

public class Casting1 {

    public static void main(String[] args) {


        float decimal = 15.6f;

        double decimal2 = decimal; // Casting implicito

        decimal = (float) decimal2;        // Casting explicito

        char letra = 'a';

        short numero = (short)letra;


        System.out.println( letra + 1 );
        System.out.println( (char)(letra + 1) );

        System.out.println((char)(letra + ('Z'-'z')));

        int n=2;
        int m=5;

        System.out.println((float)m/n);


        float decimal3 = 0.4621686f;

        int num4 = (int)decimal3;

        System.out.println(num4);



        String numero2 = "2";

        System.out.println(Integer.parseInt(numero2)+1);

        String numero3 = "3.0";

        System.out.println(Float.parseFloat(numero3)+1);


        System.out.println(String.valueOf(6) + 7);






    }

}
