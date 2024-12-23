package operadores;

import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("*** Cálculo Área y Perímetro de un Rectángulo ***");

        System.out.print("Ingresa el valor de la base: ");
        var base = Double.parseDouble(consola.nextLine());

        System.out.print("Ingresa el valos de la altura: ");
        var altura = Double.parseDouble(consola.nextLine());

        //Calculo de la área
        var area = base * altura;

        //Calculo del perimetro
        var perimetro = 2 * (base + altura);

        System.out.printf("""
                %n Resultado
                Área del rectángulo: %.2f
                Perímetro del rectángulo: %.2f
                """,area, perimetro);
    }
}
