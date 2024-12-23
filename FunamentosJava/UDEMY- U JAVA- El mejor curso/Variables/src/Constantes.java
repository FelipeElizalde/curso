public class Constantes {
    public static void main(String[] args) {
        //Sintaxis
        // final tipo nombreConstante = valor;  final indica que es una constante

        System.out.println("*** CONSTANTES EN JAVA ***");

        final int DIAS_EN_SEMANA = 7;
        final double PI = 3.14159;
        final String MENSAJE_BIENVENIDA = "Bienvenido a la Universidad Java";

        System.out.println("DIAS_EN_SEMANA = " + DIAS_EN_SEMANA);
        System.out.println("PI = " + PI);
        System.out.println("MENSAJE_BIENVENIDA = " + MENSAJE_BIENVENIDA);

        // Constantes ya definidas en Java
        // Pi desde la clase Math
        System.out.println("Math.PI = " + Math.PI);

        final var SEGUNDOS_POR_MINUTO = 60;
        System.out.println(SEGUNDOS_POR_MINUTO);
    }
}
