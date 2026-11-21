package sec8ciclos;

public class SumaAcumulativa {
    public static void main(String[] args) {
        System.out.println("*** Suma acumulativa ***");

        final var VALOR_MAXIMO = 5;
        var acumuladorSuma = 0;

        //Iterar los valores
        var numero = 1;
        while (numero <= VALOR_MAXIMO){
            acumuladorSuma += numero; //acumuladorSuma = acumuladorSuma + numero
            numero++;
        }
        System.out.println("Suma de los primeros " + VALOR_MAXIMO + " es: " + acumuladorSuma);
    }
}
