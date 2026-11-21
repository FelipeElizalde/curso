package sec5datosporconsola;

public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de cadenas ***");

        var nombre = "Luis";
        var edad = 35;
        var salario = 21000.50;

        //String.format
        //con %s indicamos que se va sustituir una cadena
        //con %d indicamos que se va sustituir un decimal(Entero)
        //con %.2f indicamos que se va sustituir un flotantecon 2 decimales
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        //Método printf con salto de linea %n
        System.out.printf("Nombre: %s, Edad: %d, Salario: $%.2f%n", nombre, edad, salario);


        // Formateo utlizando un text block

        var numeroEmpleado = 12;
        // \s Agrega un espacio en blanco en un bloque de texto
        // %04d Si el numero es menor a 4 digitos rellena con ceros
        mensaje = """
                %nDetalle Persona:\s
                --------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: $%.2f
                """.formatted(nombre,numeroEmpleado,edad,salario);

        System.out.println(mensaje);

        // Formateo utlizando un text block y printf directamente

        System.out.printf("""
                %nDetalle Persona:\s
                --------------------
                \tNombre: %s
                \tNo. Empleado: %04d
                \tEdad: %d
                \tSalario: $%.2f
                """,nombre,numeroEmpleado,edad,salario);
    }
}
