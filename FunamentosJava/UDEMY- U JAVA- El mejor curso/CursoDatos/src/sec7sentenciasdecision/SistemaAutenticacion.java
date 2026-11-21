package sec7sentenciasdecision;

import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        final var USUARIO = "Juan";
        final var PASSWORD = "123";

        var consola = new Scanner(System.in);

        System.out.println("*** Sistema de Autenticación ***");

        System.out.print("Ingresa tu usuario: ");
        var usuarioIn = consola.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        var passwordIn = consola.nextLine();

        //Implementacion con if-else
        if (USUARIO.equals(usuarioIn) && PASSWORD.equals(passwordIn)) {
            System.out.println("¡Bienvenido al Sistema!");
        } else if (!USUARIO.equals(usuarioIn) && PASSWORD.equals(passwordIn)) {
            System.out.println("Usuario incorrecto, favor de corregirlo");
        } else if (USUARIO.equals(usuarioIn) && !PASSWORD.equals(passwordIn)) {
            System.out.println("Password incorrecto, favor de corregirlo");
        } else {
            System.out.println("Usuario y password incorrectos, favor de corregirlos");
        }

        //Implementacion con switch
        var mensajeAutenticacion = switch (usuarioIn){
            case USUARIO -> {
                if (PASSWORD.equals(passwordIn))
                    yield "¡Bienvenido al Sistema!";
                else
                    yield "Password incorrecto, favor de corregirlo";
            }
            default -> {
                if (PASSWORD.equals(passwordIn))
                    yield "Usuario incorrecto, favor de corregirlo";
                else
                    yield "Usuario y password incorrectos, favor de corregirlos";
            }

        };

        System.out.println(mensajeAutenticacion);


    }
}
