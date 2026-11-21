package sec6operadores;

import java.util.Scanner;

public class TiendaDescuento {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Descuentos VIP****");
        final var NO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        System.out.print("¿Cuántos productos ompraste hoy? ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("¿Tienes la menbresia de la tienda (true / false)? ");
        var tieneMembresia = Boolean.parseBoolean(consola.nextLine());

        var elgibleDescuentoVip = cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tieneMembresia;

        System.out.println("¿Tienes acceso a descuento VIP? " + elgibleDescuentoVip);
    }
}
