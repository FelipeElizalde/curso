package sec3variables;

public class Variables {
    public static void main(String[] args) {
        //sec1variables.Variables
        int edad = 31;
        double precio = 300.40;
        boolean disponible = true; //true ó false
        char genero; //definicion de variable sin valor- char solo acepta un caracter
        genero = 'M';//M-Masculino, F-Femenino

        //Accede a alas variables
        System.out.println(edad);
        //Modificar el valor
        edad = 35;
        System.out.println(edad);

        //Imprimir variables
        System.out.println(precio);
        System.out.println(disponible);
        System.out.println(genero);

        //Concatenar cadenas
        var nombre = "Jesus";
        var apellido = "López";

        var nombreCompleto = nombre + " " + apellido;
        System.out.println(nombreCompleto);

    }
}
