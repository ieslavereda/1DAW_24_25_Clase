package es.ieslavereda.cuaderno.bloque2;

import es.ieslavereda.Entrada;

public class E4 {

    public static void main(String[] args) {

        int oculto = (int)(Math.random()*100)+1;
        int intentos = 3;
        int aux;

        System.out.println(oculto);

        do {
            System.out.println("Introduce un numero:");
            aux = Entrada.getEntero();
            intentos--;

            if (aux > oculto)
                System.out.println("Mayor");
            else if (aux < oculto)
                System.out.println("Menor");

        }while (aux!=oculto && intentos>0);

        if(aux==oculto) System.out.println("Ganastes");
        else System.out.println("Looooser");

    }
}
