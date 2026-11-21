package sec6operadores;

import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.print("Proporciona un dato entero: ");
        var dato = Integer.parseInt(consola.nextLine());

        //Revisamos si está dentro de rango (entre 1 y 10)
        var dentroRango = dato >= 1 && dato <= 10;
        System.out.println("Variable dentro de Rango (1 y 10) = " + dentroRango);

        //Revisar lógica inversa
        var fueraRango = !(dato >= 1 && dato <= 10);
        System.out.println("Variable fuera de Rango (1 y 10) = " + fueraRango);

    }
}
