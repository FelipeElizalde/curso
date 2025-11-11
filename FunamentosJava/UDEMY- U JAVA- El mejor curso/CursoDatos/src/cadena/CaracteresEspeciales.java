package cadena;

public class CaracteresEspeciales {
    public static void main(String[] args) {
        //Caracteres especiales

        //\n - imprimir un salto de linea
        var cadena1 = "Hola\nMundo";
        System.out.println("Cadena con salto de linea " + cadena1);

        // '\t' - tabulador
        var cadena2 = "\tHola\tMundo";
        System.out.println("Cadena con tabuladores = " + cadena2);

        // \' - Comilla Simple
        var cadena3 = "Hola \' Mundo";
        System.out.println("Comilla simple = " + cadena3);

        // \" - Comilla doble
        var cadena4 = "Hola \" Mundo";
        System.out.println("Comilla doble = " + cadena4);

        // \\ - Coloca una barra invertida
        var cadena5 = "Hola \\ Mundo";
        System.out.println("Barra invertida = " + cadena5);
    }
}
