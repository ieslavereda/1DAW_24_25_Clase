package es.ieslavereda.recursividad;

public class Fibo {

    public static void main(String[] args) {


        System.out.println(fib(8));
    }


    public static int fib(int num){

        // caso base
        if(num==0) return 0;
        if(num==1) return 1;

        // caso recursivo;
        return fib(num-1)+fib(num-2);


    }
}
