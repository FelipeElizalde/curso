package sentenciasdecision;

import java.util.Scanner;

public class SistemaEnvio {
    public static void main(String[] args) {

        final var TARIFA_NACIONAL = 10;
        final var TARIFA_INTERNACIONAL = 20;

        var consola = new Scanner(System.in);

        System.out.println("*** Sistema de Envíos ***");

        System.out.print("Ingresa el destino del paquete (nacional/internacional) ");
        var destino = consola.nextLine().strip().toLowerCase();
        //Strip tambien quita espacios en blanco como trim pero consider mas opciones
        // ya que es una funcion mas reciente

        System.out.print("Ingresa el peso del paquete (en Kg) ");
        var peso = Double.parseDouble(consola.nextLine());

        Double costo = switch (destino) {
            case "nacional" -> peso * TARIFA_NACIONAL;
            case "internacional" -> peso * TARIFA_INTERNACIONAL;
            default -> {
                System.out.println("Destino inválido. Ingresa nacional/internacional");
                yield null;
            }
        };

        if (costo != null)
            System.out.printf("El costo del envío del paquete es : $%.2f",costo);


    }
}
