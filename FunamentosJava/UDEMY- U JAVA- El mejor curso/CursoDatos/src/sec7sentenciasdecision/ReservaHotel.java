package sec7sentenciasdecision;

import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {

        final var CUARTO_VISTA_MAR = 190.5;
        final var CUARTO_SIN_VISTA_MAR = 150.5;

        var consola = new Scanner(System.in);

        System.out.println("*** Sistema Reserva Hotel ***");

        System.out.print("Nombre del cliente: ");
        var nombre = consola.nextLine();

        System.out.print("Dias de estadía en el Hotel: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());

        System.out.print("Cuarto con vista al mar (true/false) ");
        var isCuartoVistaMar = Boolean.parseBoolean(consola.nextLine());

        var total = isCuartoVistaMar ? CUARTO_VISTA_MAR * diasEstadia : CUARTO_SIN_VISTA_MAR * diasEstadia;
        var vistaMar = isCuartoVistaMar ? "SI :)" : "NO :(";

        System.out.printf("""
                %n--------- Detalles de la Reservación -------
                Cliente: %s
                Días de estadia:%d
                Costo Total:$%.2f
                Habitación con Vista al Mar: %s
                """, nombre, diasEstadia, total, vistaMar);



    }
}
