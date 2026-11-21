package sec5datosporconsola;

import java.util.Scanner;

public class RecetaCocina {
    public static void main(String[] args) {
        System.out.println("*** Recetas de cocina ***");

        var console = new Scanner(System.in);

        System.out.print("Ingresa el nombre: ");
        var nombre = console.nextLine();

        System.out.print("Ingresa los ingredientes: ");
        var ingredientes = console.nextLine();

        System.out.print("Ingresa el tiempo de preparación: ");
        var tiempoPrep = Integer.parseInt(console.nextLine());

        System.out.print(" Ingresa la dificultad (Fácil, Medio, Dificil): ");
        var dificultad = console.nextLine();


        System.out.println("\n--- Receta de cocina ---");
        System.out.println("Nombre receta: " + nombre);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparación: " + tiempoPrep + " minutos");
        System.out.println("Dificultad: " + dificultad);

    }
}
