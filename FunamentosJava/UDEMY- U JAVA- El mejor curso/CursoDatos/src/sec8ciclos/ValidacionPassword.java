package sec8ciclos;

import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        System.out.println("*** Validación de pasword***");
        boolean valido = false;
        var consola = new Scanner(System.in);
        var pssw = "";
        System.out.print("Ingresa un password (de al menos 6 caracteres): ");
        pssw = consola.nextLine();
        while (pssw.length() < 6) {
            System.out.println("El password no cumple con los requisitos. Debe tener al menos 6 caracteres");
            System.out.print    ("Ingresa un nuevo valor de password: ");
            pssw = consola.nextLine();
        }
        System.out.println("Password valido: " + pssw);
    }
}