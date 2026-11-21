package sec7sentenciasdecision;

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");
        //Sintaxis
        //Condicion ? exp1 : exp2

        //Determinar si un numero es par o no
        var numero = 4;
        var resultado = (numero % 2 == 0) ? "Par" : "Impar";

        System.out.println("El numero " + numero + " es " + resultado);

        //Calcular si es mayor de edad
        var edad = 17;
        var mensaje = edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad";

        System.out.println("\nTienes " + edad + ", " + mensaje);

        //Valor positivo, negativo o cero
        numero = 0;
        resultado = numero > 0 ? "Positivo" : numero < 0 ? "Negativo" : "Cero";

        System.out.println("\nNumero " + numero + ", es " + resultado);
    }
}
