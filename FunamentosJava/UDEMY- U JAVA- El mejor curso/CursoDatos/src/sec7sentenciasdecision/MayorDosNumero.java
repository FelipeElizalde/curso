package sec7sentenciasdecision;

import java.util.Scanner;

public class MayorDosNumero {

    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("**** El mayor de 2 números ***");

        System.out.print("Ingresa el primer número: ");
        var numero1 = Integer.parseInt(consola.nextLine());

        System.out.print("Ingresa el segundo número: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        if (numero1 > numero2){
            System.out.println("El número mayor es: " + numero1);
        }else if (numero1 < numero2){
            System.out.println("El numero mayor es: " + numero2);
        }else {
            System.out.println("Son números Iguales");
        }
    }

}
