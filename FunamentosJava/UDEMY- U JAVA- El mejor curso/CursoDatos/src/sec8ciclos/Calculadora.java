package sec8ciclos;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        boolean salir = false;
        var opcion = 0;
        double valor1 = 0, valor2 = 0, resultado;
        var entrada = new Scanner(System.in);
        while (!salir){
            System.out.print("""
                    *** Calculador en JAVA ***
                    Operaciones que puedes realizar:
                    1. Suma
                    2. Resta
                    3. Multiplicacion
                    4. Division
                    5. Salir
                    Escoge una opción:\s""");
            System.out.print("");
            opcion = entrada.nextInt();
            if(opcion >= 1 && opcion <=4) {
                System.out.print("Dame el valor 1: ");
                valor1 = entrada.nextDouble();
                System.out.print("Dame el valor 2: ");
                valor2 = entrada.nextDouble();
            }
            switch (opcion){
                case 1 -> System.out.printf("El resultado de la suma es %.2f%n%n",(valor1 + valor2));
                case 2 -> System.out.printf("El resultado de la resta es %.2f%n%n",(valor1 - valor2));
                case 3 -> System.out.printf("El resultado de la multiplicacion es %.2f%n%n",(valor1 * valor2));
                case 4 -> {
                    if(valor2 == 0){
                        System.out.println("Error: división entre cero\n");
                    }else {
                        System.out.printf("El resultado de la division es %.2f%n%n", (valor1 / valor2));
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo de la calculadora. Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida. Selecciona otra opción\n");
            }
        }
    }
}
