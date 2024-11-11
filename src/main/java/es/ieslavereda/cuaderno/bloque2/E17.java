package es.ieslavereda.cuaderno.bloque2;

import es.ieslavereda.Entrada;

public class E17 {

    /*
        Una empresa que se dedica a la venta de desinfectantes
        necesita un programa para gestionar las facturas.
        En cada factura figura: el código del artículo,
        la cantidad vendida en litros y el precio por litro.
        Se pide de 5 facturas introducidas:
        - Facturación total,
        - cantidad en litros vendidos del artículo 1
        - cuantas facturas se emitieron de más de 600 €.
    */

    public static void main(String[] args) {

        float totalFacturas = 0;
        float litrosArticulo1 = 0;
        int cantidadFacturas = 0;

        int articulo;
        float cantidad;
        float precioLitro;


        for(int i=0;i<5;i++) {
            System.out.println("Introduce el codigo para la factura " + 1);
            articulo = Entrada.getEntero();
            System.out.println("Introduce la cantidad de litros en la factura " + 1);
            cantidad = Entrada.getDecimal();
            System.out.println("Precio del litro para el articulo ");
            precioLitro = Entrada.getDecimal();

            totalFacturas = totalFacturas + (cantidad * precioLitro);

            if (cantidad * precioLitro > 600)
                cantidadFacturas++;

            if (articulo == 1)
                litrosArticulo1 = litrosArticulo1 + cantidad;
        }


        System.out.println("Total facturas: " +totalFacturas);
        System.out.println("Litros del articulo 1: "+ litrosArticulo1);
        System.out.println("Facturas superiores a 600: " + cantidadFacturas);

        

    }
}
