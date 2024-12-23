package leerdatos;
import java.util.Scanner;


public class LeerLinea {
    public static void main(String[] args) {
        var scanner  = new Scanner(System.in); //System permite obtener infomación de la entrada estándar
        System.out.println("Introduce una linea de texto: ");
        var linea = scanner.nextLine(); //next line lee una linea de la consola para obtener el valor de la misma
        System.out.println("linea = " + linea);
        System.out.println("Escribe tu nombre");
        var nombre = scanner.nextLine();
        System.out.println("nombre = " + nombre);



    }
}
