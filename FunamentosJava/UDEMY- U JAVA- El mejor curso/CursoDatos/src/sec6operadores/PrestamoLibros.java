package sec6operadores;

import java.util.Scanner;

public class PrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema para Préstamo de Libros **");

        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("¿Cuentas con credencial de estudiante (true/false)? ");
        var cuentaCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("¿A cuántos kilómetros vives de la biblioteca? ");
        var distanciaBibliotecaKm = Integer.parseInt(consola.nextLine());

        var elegiblePrestamo = cuentaCredencial || distanciaBibliotecaKm <= DISTANCIA_PERMITIDA_KM;
        System.out.println("¿Es elegible para préstamo? " + elegiblePrestamo);

    }
}
