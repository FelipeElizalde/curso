package sec7sentenciasdecision;

import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("*** Sistema de Calificaciones ***");

        System.out.print("Ingresa la calificación: ");
        var calificacionNumerica = Double.parseDouble(consola.nextLine());

        var calificacionLetra = "";

        //Validacion de rangos
        if(calificacionNumerica < 10 && calificacionNumerica >= 9)
            calificacionLetra = "A";
        else if (calificacionNumerica < 9 && calificacionNumerica >= 8)
            calificacionLetra = "B";
        else if (calificacionNumerica < 8 && calificacionNumerica >= 7)
            calificacionLetra = "C";
        else if (calificacionNumerica < 7 && calificacionNumerica >= 6)
            calificacionLetra = "D";
        else if (calificacionNumerica < 6 && calificacionNumerica >= 0)
            calificacionLetra = "F";
        else
            calificacionLetra = "Valor Desconocido";


        System.out.println("Calificación en letra: " + calificacionLetra);
    }
}
