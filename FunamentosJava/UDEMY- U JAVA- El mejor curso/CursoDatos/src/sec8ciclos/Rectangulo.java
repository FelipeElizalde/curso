package sec8ciclos;

import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un rectángulo***");
        var consola = new Scanner(System.in);

        System.out.print("Proporciona el numero de filas: ");
        var numeroFilas = consola.nextInt();
        for (int fila = 1; fila <= numeroFilas; fila++) {
            var espaciosBlanco = " ".repeat(numeroFilas - fila);
            var asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espaciosBlanco + asteriscos);
        }
    }
}
