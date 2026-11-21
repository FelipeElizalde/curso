package sec7sentenciasdecision;

import java.util.Scanner;

public class SaludFitness {
    public static void main(String[] args) {

        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04;

        var consola = new Scanner(System.in);

        System.out.println("*** Aplicaciín de Salud y Fitness ***");

        System.out.print("Nombre del usuario: ");
        var nombre = consola.nextLine();

        System.out.print("Pasos caminados e el día: ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;
        var meta = pasosDiarios >= META_PASOS_DIARIO ? "SI :)" : "No :(";

        System.out.printf("""
                %nUsuario:  %s
                Pasos Dasos Hoy; %d
                Calorias quemadas: %.2f Kcal
                Meta de pasos diario alcanzada: %s
                ------------------------------------
                La meta de pasos diarios es de: %d pasos
                """, nombre, pasosDiarios, caloriasQuemadas, meta, META_PASOS_DIARIO);

    }
}
