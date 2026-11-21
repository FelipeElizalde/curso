package sec8ciclos;

import java.util.Scanner;

public class MenuIterativo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        var salir = false;

        //Iteración del menu
        while (!salir){
            System.out.print("""
                    Sistema de administración de cuentas
                    Menú:
                    1. Crear cuenta
                    2. Eliminar cuenta
                    3. Salir
                    Escoje una opcion:\s"""); //\s Agrega espacio en blanco en un string multilinea
            var opcion = consola.nextInt();
            switch (opcion){
                case 1 -> System.out.println("Creando tu cucenta...\n");
                case 2 -> System.out.println("Eliminando tu cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hasta pronto");
                    salir = true;
                }
                default -> System.out.println("Opción inválida...\n");
            }
        }
        System.out.println("Fin del sistema de administración de cuentas");

    }
}
