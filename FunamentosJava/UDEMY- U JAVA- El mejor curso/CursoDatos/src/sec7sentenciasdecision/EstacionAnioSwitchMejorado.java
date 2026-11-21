package sec7sentenciasdecision;

import java.util.Scanner;

public class EstacionAnioSwitchMejorado {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Ingresa el mes ");
        var mes = Integer.parseInt(consola.nextLine());

        var estacion = switch (mes){
            case 1, 2, 12 -> "Invierno";
            case 3, 4, 5 -> "Primavera";
            case 6, 7, 8 -> "Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "Inválido";
        };

        System.out.println("El mes " + mes + " corresponde a la estación: " + estacion);
    }
}
