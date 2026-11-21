package sec9arreglos;

import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        System.out.println("*** PROMEDIO DE CALIFICACIONES ***");

        var consola = new Scanner(System.in);
        System.out.print("¿Cuantas calificaciones deseas agregar?");
        var cantidad = consola.nextInt();
        var calificaciones = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Calificacion[" + i + "]");
            calificaciones[i] = consola.nextInt();
        }
        var suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma += calificaciones[i];
        }
        var promedio = suma / cantidad;

        System.out.println("Promedio de las calificaciones: " + promedio);
    }
}
