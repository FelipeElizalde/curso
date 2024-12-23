package cadena;

public class Cadenas {
    public static void main(String[] args) {
        System.out.println("**** CADENAS ****");
        var cadena1 = "Hola"; //Sintaxis básica como variable
        System.out.println("cadena1 = " + cadena1);

        var cadena2 = new String("mundo"); //Stintaxis como tipo Objeto
        System.out.println("cadena2 = " + cadena2);

        //Las cadenas son inmutables o sea no se pueden modificar

        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);

        //Cadena de multiples líneas (text block), para crear se necesita 3 comillas y un enter para escribir dentro de ella
        var cadena4 = """ 
                Este es un texto
                multilinea
                mas
                lineas
                """;
        System.out.println("cadena4 = " + cadena4);

        System.out.println("** Manejo de índices en cadenas **");

        // Recuperar primer caracter
        var cadena = "Hola mundo";
        char primerCaracter = cadena.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);
        // Recuperar el último caracter en la posicion 9
        char ultimoCaracter = cadena.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        //Recuperar la letra m
        char letraM = cadena.charAt(5);
        System.out.println("letraM = " + letraM);

        System.out.println("** Inmutabilidad en cadenas **");
        var cadenaInm = "Hola";
        System.out.println("cadenaInm = " + cadenaInm);
        cadenaInm = "Adios";  //Al hacer esto, lo que se hace es crear un nuevo objeto en memoria y el anerior se elimina de memoria, y esta apunta a un nuevo objeto

        var cadenaImp2 = cadenaInm; // Esta variable referencia al objeto de la primer variable y evita que se elimine de memoria
        cadenaInm = "Adios";
        System.out.println("cadenaInm modificado = " + cadenaInm);
        System.out.println("cadenaImp2 = " + cadenaImp2);


    }
}
