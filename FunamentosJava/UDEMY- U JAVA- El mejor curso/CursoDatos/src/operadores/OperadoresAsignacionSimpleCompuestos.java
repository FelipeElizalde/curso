package operadores;

public class OperadoresAsignacionSimpleCompuestos {
    public static void main(String[] args) {
        /**
         * Asignar valor a variable
         * = Asignacion Simple
         * += Suma y asignación
         * -= Resta y asignación
         * *= Multiplicaión y asignación
         * /= División y asignación
         * %= Módulo y asignación
         */

        System.out.println("**** Operadores de asignación  ***");
        //Asignación simple '='
        var numero = 10; //Asignamos el valor a la variable desde su declaración
        int numero2; // Se crea la variable y después se asigna
        numero2 = 15;

        // Operadores de asignación compuesto
        // +=
        numero += 5; //Sintaxis completa numero = numero + 5
        System.out.println("numero = " + numero);

        // -=, *=, /= y %=
        numero *= 2; //equivalente numero = numero *2
        System.out.println("numero = " + numero);

        //Asignación de variables multiples
        int a = 10, b = 15, c = 20;
        System.out.printf("a = %d, b = %d, c = %d",a, b, c);


    }
}
