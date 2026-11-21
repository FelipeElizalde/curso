package sec7sentenciasdecision;

import java.util.Scanner;

public class CasaEspejo {
    public static void main(String[] args) {
        System.out.println("*** Bienvenidos a la casa de los espejos ***");

        var console = new Scanner(System.in);

        System.out.print("¿Cuál es tu edad? ");
        var edad = Integer.parseInt(console.nextLine());

        System.out.print("¿Tienes miedo a la oscuridad (true/false)? ");
        var tienesMiedoOscuridad = Boolean.parseBoolean(console.nextLine());

         //Verificacion
        if(!tienesMiedoOscuridad && edad >= 10){
            System.out.println("Puedes entrar a la casa de los espejos");
        }else {
            System.out.println("Lo siento, la casa de los espejos podría darte miedo");
        }
    }
}
