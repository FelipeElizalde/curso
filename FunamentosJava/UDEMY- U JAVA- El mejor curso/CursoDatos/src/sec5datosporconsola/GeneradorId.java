package sec5datosporconsola;

import java.util.Random;
import java.util.Scanner;

public class GeneradorId {
    public static void main(String[] args) {
        System.out.println("***** Generador de Id único *****");

        var consola = new Scanner(System.in);
        System.out.print("¿Cuál es tu nombre?");
        var nombre = consola.nextLine();

        System.out.print("¿Cuál es tu apellido?");
        var apellido = consola.nextLine();

        System.out.print("¿Cuál es tu año de nacimiento");
        var añoNacimiento = Integer.parseInt(consola.nextLine());

        var random = new Random();
        var numeroAleatorio = "%04d".formatted(random.nextInt(1, 9999));

        var numeroIdentificador = nombre.trim().substring(0,2).toUpperCase()
                .concat(apellido.trim().substring(0,2).toUpperCase())
                .concat(String.valueOf(añoNacimiento).substring(2,4))
                .concat(numeroAleatorio);

        System.out.printf("""
                Hola Juan
                \tTu nuevo número de identificació (ID) generado por el sistema es
                \t%s
                \tFelicidades
                """, numeroIdentificador);

    }
}
