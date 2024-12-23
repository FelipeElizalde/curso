package sentenciasdecision;

import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("*** Identifica la Estación del Año ***");

        System.out.print("Proporciona el valor de un mes: ");
        var mes = Integer.parseInt(consola.nextLine());

        if (mes == 1 || mes == 2 || mes == 12){
            System.out.println("Invierno");
        }else if (mes == 3 || mes == 4 || mes == 5){
            System.out.println("Primavera");
        }else if (mes == 6 || mes == 7 || mes == 8 ){
            System.out.println("Verano");
        }else if (mes == 9 || mes == 10 || mes == 11){
            System.out.println("Otoño");
        }else{
            System.out.println("Estación Desconocida");
        }
    }
}
