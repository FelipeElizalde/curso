package sec6operadores;

public class OperadoresLogicos {
    public static void main(String[] args) {
        /**
         * Operadores lógicos
         * && and - Regresa verdadero si ambos operandos son verdaderos
         * || or - Regresa verdadeso si cualquier operando es verdadero
         * ! negación - Invierte el valor lógico sólo usa un operando
         */

        System.out.println("*** Operadores lógicos ***");
        System.out.println("AND");

        boolean a = true, b = false;

        //and
        var resultado = a && b;
        System.out.println("&& - resultado = " + resultado);

        //or
        resultado = a || b;
        System.out.println("|| - resultado = " + resultado);

        //negacion
        resultado = !a;
        System.out.println("! - resultado = " + resultado);


    }
}
