package es.ieslavereda.buclesanidados;

public class Ejemplo10 {


    public static void main(String[] args) {

        for (int m = 0; m <= 9; m++)
        for (int c = 0; c <= 9; c++)
            for (int d = 0; d <= 9; d++)
                for (int u = 0; u <= 9; u++) {
                    String texto="";

                    if(u==3)
                        texto+="E";
                    else
                        texto+=u;

//                    if(d==3)
//                        texto="E"+texto;
//                    else
//                        texto=d+texto;

                    texto = ((d==3)?"E":d) + texto;

                    if(c==3)
                        texto="E"+texto;
                    else
                        texto=c+texto;

                    if(m==3)
                        texto="E"+texto;
                    else
                        texto=m+texto;

                    System.out.println(texto);

                }

    }


}
