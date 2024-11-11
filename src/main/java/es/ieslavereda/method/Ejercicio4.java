package es.ieslavereda.method;

public class Ejercicio4 {

    public static void main(String[] args) {

        System.out.println(sustituye("0is","Luis","Carlos"));

    }



    public static String sustituye(String texto,String target,String word){

        String resultado="";
        // TO DO
        int pos=0;
        String aux;

        while (pos<texto.length()-3) {

            aux = texto.substring(pos, pos + target.length());
            if (aux.equalsIgnoreCase(target)) {
                resultado = resultado + word;
                pos += target.length();
            } else {
                resultado += texto.charAt(pos);
                pos++;
            }
        }

        return resultado+texto.substring(pos,texto.length());
    }



}
