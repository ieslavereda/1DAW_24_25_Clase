package es.ieslavereda.bucles;

public class While {


    public static void main(String[] args) {



        String texto = "En un lugar de la mancha de cuyo nombre no quiero acordarme";

        texto= texto.replace(" ","");

        boolean encontrado=false;
        int i=0;

        do{

            if(texto.toUpperCase().charAt(i) == texto.charAt(i)){
              encontrado=true;
            }

            i++;
        }while(i<texto.length() && !encontrado);


        System.out.println(encontrado);

    }
}
