package sec8ciclos;

import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;
        var saldo = 1000.0;
        var retiro = 0;
        var abono = 0;
        var opcion = 0;

        while (!salir) {
            System.out.print("""
                    *** Aplicación de Cajero Automático ***
                    Operaciones que puedes realizar:
                    1. Consultar saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoje una opción:\s""");
            opcion = consola.nextInt();
            switch (opcion) {
                case 1 -> System.out.printf("Tu saldo actual es de: $%.2f%n%n", saldo);
                case 2 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    retiro = consola.nextInt();
                    if (saldo < retiro) {
                        System.out.printf("No cuentas con el saldo suficiente. El saldo actual es de: $%.2f%n%n", saldo);
                    } else {
                        saldo -= retiro;
                        System.out.printf("Tu nuevo saldo es $%.2f%n%n", saldo);
                    }
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a depositar: ");

                    abono = consola.nextInt();
                    saldo += abono;
                    System.out.printf("Tu nuevo saldo es $%.2f%n%n", saldo);
                }
                case 4 -> {
                    salir = true;
                    System.out.println("Saliendo del cajero automático. Hasta pronto!");
                }
                default -> System.out.println("Opción inválida. Selecciona otra opción");
            }
        }


    }
}
