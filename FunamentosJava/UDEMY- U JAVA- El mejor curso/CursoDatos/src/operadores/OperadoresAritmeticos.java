package operadores;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        /**
         * Suma +
         * Resta -
         * Multiplicación *
         * División /
         * Módulo % (Residuo de división)
         */

        System.out.println("**** Operadores Aritméticos ***");

        //SUMA
        int a = 5, b = 3, resultado;
        resultado = a + b;

        System.out.println("Resultado de la suma = " + resultado);

        //RESTA
        resultado = a - b;
        System.out.println("Resultado de la resta = " + resultado);

        //MULTIPLICACION
        resultado = a * b;
        System.out.println("Resultado de la multiplicación = " + resultado);

        //DIVISIÓN
        resultado = a / b;
        System.out.println("Resultado de la División = " + resultado);

        //MÓDULO (RESIDUO DE LA DIVISIÓN)
        resultado = a % b;
        System.out.println("Resultado de módlo = " + resultado);
    }
}
