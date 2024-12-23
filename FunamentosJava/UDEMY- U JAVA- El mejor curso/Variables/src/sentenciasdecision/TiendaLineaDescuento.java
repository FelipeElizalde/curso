package sentenciasdecision;

import java.util.Scanner;

public class TiendaLineaDescuento {
    public static void main(String[] args) {

        final var MONTO_COMPRA_DESC = 1000.00;
        var consola = new Scanner(System.in);

        System.out.println("*** Tienda en Linea con Descuentos ***");

        System.out.print("¿Cuál fue el monto de la compra? ");
        var monto = Double.parseDouble(consola.nextLine());

        System.out.print("¿Eres miembro de la tienda (true/false): ");
        var miembro = Boolean.parseBoolean(consola.nextLine());

        if (MONTO_COMPRA_DESC <= monto && miembro){
            var descuento = monto * .10;
            var montoFinal = monto - descuento;
            System.out.printf("""
                    %nFelicidades, has obtenido un descuento del 10%%
                    Monto de la compra:         $%.2f
                    Monto del descuento:        $%.2f
                    Monto final de la 
                    compra con descuento:       $%.2f
                    """,monto, descuento, montoFinal);
        }else if (miembro){
            var descuento = monto * .05;
            var montoFinal = monto - descuento;
            System.out.printf("""
                    %nFelicidades, has obtenido un descuento del 5%%
                    Monto de la compra:         $%.2f
                    Monto del descuento:        $%.2f
                    Monto final de la 
                    compra con descuento:       $%.2f
                    """,monto, descuento, montoFinal);
        }else{
            System.out.printf("""
                    %nNo obtuviste ningún tipo de descuento
                    Te invitamos a hacerte miembro de la tienda
                    Monto final de la compra:    $%.2f
                    """,monto);
        }
    }
}
