package sentenciasdecision;

import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        //Revisar si un número es positivo

        var consola = new Scanner(System.in);

        System.out.print("Proporciona un número: ");
        var numero = Integer.parseInt(consola.nextLine());

        if (numero > 0){
            System.out.println("Numero Positivo");
        }
        else if (numero < 0){
            System.out.println("Número Negativo");
        }
        else {
            System.out.println("El numero es cero");
        }
    }
}
