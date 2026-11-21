package sec8ciclos;

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        System.out.println("*** Juego de Adivinanzas***");
        var consola = new Scanner(System.in);
        //Se genera el numero aletorio entre 1 y 50 tambien puede ser asi nextInt(50) + 1
        var numero = new Random().nextInt(1, 51);
        var valorPosible = 0;
        var contador = 1;
        final int INTENTOS_MAXIMOS = 4;

        while (valorPosible != numero && contador < INTENTOS_MAXIMOS) {
            System.out.print("Adivina el número secreto: ");
            valorPosible = consola.nextInt();
            if (valorPosible < numero) {
                System.out.println("El número es mayor.");
            } else if (valorPosible > numero) {
                System.out.println("El número es menor.");
            }
            contador++;


        }
        if (valorPosible == numero) {
            System.out.printf("""
                    Felicidades!!!!!
                    Encontraste el número secreto: %d
                    Intentos realizados: %d%n """, numero, contador);
        } else {
            System.out.printf("""
                    Numero de intentos permitidos agotado
                    El numero secreto era: %d%n""", valorPosible);
        }
    }
}
