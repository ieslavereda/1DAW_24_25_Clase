package es.ieslavereda.arrays;

public class Ejemplo5 {


    public static void main(String[] args) {

        int a = 0;

        int[] b= new  int[]{0};

        incrementa(a);
        incrementa(b);

        System.out.println(a);
        System.out.println(b[0]);
    }

    private static void incrementa(long a) {
        a+=1;
    }

    private static void incrementa(int a) {
        a+=1;
    }

    private static void incrementa(int[] c) {
        c[0]+=1;
    }
    private static void incrementa(long[] c) {
        c[0]+=1;
    }

}
