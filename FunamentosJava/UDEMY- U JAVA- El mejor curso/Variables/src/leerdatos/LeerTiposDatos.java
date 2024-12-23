package leerdatos;

import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //Leer distintos tipos de datos
        //Int
        var consola = new Scanner(System.in);
        System.out.println("Ingresa tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());
        //var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        //Double
        System.out.println("Ingresa tu altura: ");
        //var altura = consola.nextDouble();
        var altura = Double.parseDouble(consola.nextLine());
        System.out.println("altura = " + altura);

        //Consumimos el caracter de salto de linea ya que nexint y nextdouble detectan el salto de linea que da nextLine
        consola.nextLine();
        //String
        System.out.println("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

//Conversion de datos
    System.out.println("Conversion de datos");

        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);

        System.out.println("entero = " + entero);

        //Tipo flotante
        System.out.println("Proporciona un valorflotante");
        var flotsnte= Float.parseFloat(consola.nextLine());

    }
}
