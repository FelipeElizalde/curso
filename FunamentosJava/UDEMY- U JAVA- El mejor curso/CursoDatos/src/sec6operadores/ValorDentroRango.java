package sec6operadores;

import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        System.out.println("**** Valor dentro rango ***");
        final var MINIMO = 0;
        final var MAXIMO = 5;

        System.out.print("Proporciona un valor entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        //Verificar si el dato esta dentro de rango
        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("¿Está dento de rango? = " + estaDentroRango);
    }
}
