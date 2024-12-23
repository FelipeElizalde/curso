package operadores;

import java.util.Scanner;

public class SistemaAutenticacion {

    public static void main(String[] args) {
        final var USUARIO = "Juan";
        final var PASSWORD = "abcD1";

        var consola = new Scanner(System.in);

        System.out.println("*** Sistema de Autenticación ***");
        System.out.print("¿Cuál es tu Usuario? ");
        var usuarioIn = consola.nextLine();

        System.out.print("¿Cual es tu password?");
        var passwordIn = consola.nextLine();

        var datosCorrectos = false;

        if (!usuarioIn.isBlank() || !usuarioIn.isEmpty() || !passwordIn.isBlank() || !passwordIn.isEmpty()){
            datosCorrectos = USUARIO.equals(usuarioIn) && PASSWORD.equals(passwordIn);
        }

        System.out.println("¿Datos son correctos? " + datosCorrectos);

    }
}
