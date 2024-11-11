package es.ieslavereda.arrays;

import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
        char[] secret;
        boolean acertado;
        String text;
        int vidas=3;
        char letra;

        text = getSecretWord();
        secret = new char[text.length()];

        fill(secret,text);

        do{
            show(secret);

            letra = getChar("Introduce una letra:");
            acertado=check(secret,text,letra);

            if(acertado){
                System.out.println("Bien!!!!");
            }else{
                vidas--;
                System.out.println("Fallo !!!!. Te quedan "+ vidas +" vidas");
            }


        }while (vidas>0 && count(secret)>0);

        if(vidas>0) System.out.println("Tu ganas!!");
        else System.out.println("Pringaoo!!!");
    }

    // Obtener del usuario el texto a adivinar
    private static String getSecretWord() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    // Comprobar si la letra pasada por parametro se encuentra en el texto.
    // En caso afirmativo se pone la letra del texto en el array, y se devuelve true.
    // En caso negativo se devuelve false.
    private static boolean check(char[] secret,String text,char letra) {

        boolean acierto = false;


        for(int i=0;i< secret.length;i++){


            if(String.valueOf(text.charAt(i)).equalsIgnoreCase(String.valueOf(letra))){
                acierto=true;
                secret[i]=text.charAt(i);
            }


        }

        return acierto;
    }

    // Se rellena el array con '_' en la posicion de cada letra,
    // y ' ' en los espacios en blanco
    private static void fill(char[] secret, String text){

        for(int i=0;i<secret.length;i++){

            if(text.charAt(i)==' ')
                secret[i]=' ';
            else
                secret[i]='_';
        }

    }

    // Contar la cantidad de '_' en un array;
    private static int count(char[] secret){
        int cantidad = 0;

        for(char caracter  : secret)
            if(caracter=='_') cantidad++;

        return cantidad;
    }

    // Muestra el array de caracteres. Cada caracter se muestra seguido de un espacio en blanco
    private static void show(char[] text){

        for(char letra : text)
            System.out.print(letra+" ");

        System.out.println();
    }

    // Se muestra el texto y se obtiene un caracter por parte del usuario.
    private static char getChar(String text){
        Scanner scanner = new Scanner(System.in);
        System.out.println(text);
        return scanner.nextLine().charAt(0);
    }
}
