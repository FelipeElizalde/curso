package operadores;

import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Ticket de Venta ***");
        var consola = new Scanner(System.in);

        System.out.print("Precio leche:     ");
        double precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan:       ");
        double precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga:   ");
        double precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio plátanos:  ");
        double precioPlatano = Double.parseDouble(consola.nextLine());

        System.out.print("Aplicar algún decuento (%)?");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        //Cálculo subtotal (Sin impuestos)
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatano;

        //Aplicar descuento
        var descuento = subtotal * (descuentoPorcentaje / 100.0);

        //Obtener el subtotal con descuento
        var subtotalDescuento = subtotal - descuento;

        //Cálculo impuestos
        var impuesto = subtotalDescuento * 0.16;

        //Cálculo total de la compra con impuestos
        var costoTotal= subtotal + impuesto;

        //Imprimir ticket de venta
        System.out.printf("""
                %n Ticket de Venta
                %n-----------------------
                Subtotal:           $%.2f
                Descuento: (%d%%)    $%.2f
                Impuesto (16%%):     $%.2f
                Total:              $%.2f
                """,subtotal, descuentoPorcentaje, descuento,impuesto,costoTotal);

    }
}
