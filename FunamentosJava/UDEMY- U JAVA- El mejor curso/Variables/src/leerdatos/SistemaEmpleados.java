package leerdatos;

import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Systema de empleados");

        var consola = new Scanner(System.in);

        //Nombre del empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        //Edad del empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        //Salario del empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        //Es jefe de departamento
        System.out.print("Es jefe de departamento (true/false)? ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        //Imprimir valores
        System.out.println("\nDatos del Empleado: ");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado + " años");
        //System.out.println("\tSalario: " + salarioEmpleado);
        //System.out.println("\tSalario: $%.2f".formatted(salarioEmpleado)); //con %.2f le damos 2 digitos a un numero
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado); //de esta forma se reemplaza el formated de la linea anterior y se inserta con %n un salto de linea
        System.out.println("\tEs jefe de departamento? " + esJefeDepartamento);
    }
}
