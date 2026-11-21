package sec5datosporconsola;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {

        System.out.println("*** Números Aleatorios ***");

        Random random = new Random();

        //Generar un número entero aleatorio entre 0 y 9
        var numeroEntero0y9 = random.nextInt(10);
        System.out.println("Número aleatorio entre 0 y 9: " + numeroEntero0y9);

        //Generar un número aleatorio entre 1 y 10
        var numeroEntre1y10 = random.nextInt(10) + 1;
        System.out.println("Número Aleatorio Entre 1 y 10: " + numeroEntre1y10);

        //Generar un número aleatorio entre 1 y 10
        var numeroDoubEntre1y10 = random.nextDouble(10) + 1;
        System.out.println("Número Double Aleatorio Entre 1 y 10: " + numeroDoubEntre1y10);

        //Generar un número flotante aleatorio entre 0.0 y 1.0
        var numeroFloat = random.nextFloat();
        System.out.println("Número Flotante Aleatorio: " + numeroFloat);

        //Generar un número flotante aleatorio entre 0.0 y 2.0
        var numeroFloatA2 = random.nextFloat(2);
        System.out.println("Número Flotante Aleatorio Entre 0.0 y 2.0: " + numeroFloatA2);

        //Simular el lanzamiento de un dado
        var dado = random.nextInt(6) + 1;
        System.out.println("Resultado del lanzamiento de un dado: " + dado);
    }
}
