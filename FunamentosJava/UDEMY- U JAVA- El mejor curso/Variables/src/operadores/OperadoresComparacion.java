package operadores;

public class OperadoresComparacion {
    public static void main(String[] args) {
        /**
         * Operadores lógicos
         *
         * == igual a - Compara si dos valores son iguales
         * != Distinto a - Compara si dos valores son distintos
         * > Mayor que - Compara si un valor es mayor a otro
         * >= Mayor o igual a que - Compara si un valor es mayor o igual a otro
         * < Menor que - Compara si un valor es menor que otro
         * <= Menor o igual que - Compara si un valor es menor o igualque otro
         */

        System.out.println("*** Operadores de omparación ***");

         int a = 3, b = 2;

         //Igualdad ==
        var resultado = a == b; // S ecompara el valor de tipo primitivo pero con objetos apunta a la referencia de memoria
        System.out.println("== - resultado = " + resultado);

        //Distinto a !=
        resultado = a != b;
        System.out.println("!= - resultado = " + resultado);

        //Mayor que >
        resultado = a > b;
        System.out.println("> - resultado = " + resultado);

        //Mayor o igual a que
        resultado = a >= b;
        System.out.println(">= - resultado = " + resultado);

        //Menor que <
        resultado = a < b;
        System.out.println("< - resultado = " + resultado);

        //Menor o igual a que <=
        resultado = a <= b;
        System.out.println("<= - resultado = " + resultado);



    }
}
