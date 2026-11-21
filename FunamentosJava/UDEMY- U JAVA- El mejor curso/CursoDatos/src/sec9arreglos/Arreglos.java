package sec9arreglos;

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        //Arreglos
        //1. Declaramos el arreglo
        int[] enteros;
        //2. Inicializar el arreglo
        enteros = new int[3];
        //Declarar e inicializar un arreglo
        //int[] numeros = new int[2];
        var numeros = new int[2]; //Al hacerlo con var se debe declarar el tipo de dato que va a almacenar el arreglo


        //MODIFICAR VALORES
        int[] numEnteros = new int[5];
        numEnteros[0] = 13;
        numEnteros[1] = 21;
        numEnteros[4] = 64;

        //LECTURA DE VALORES
        System.out.println("Valor 1 " + numEnteros[0]);
        System.out.println("Valor 2 " + numEnteros[1]);
        System.out.println("Valor 5 " + numEnteros[4]);

        //SINTAXIS SIMPLIFICADA
        //int[] enterosSimplificado = {100, 200, 300, 400, 500};
        var enterosSimplificadoVar = new int[]{100, 200, 300, 400, 500};
        System.out.println("Valor 1 " + enterosSimplificadoVar[0]);
        System.out.println("Valor 2 " + enterosSimplificadoVar[1]);
        System.out.println("Valor 3 " + enterosSimplificadoVar[2]);
        System.out.println("Valor 4 " + enterosSimplificadoVar[3]);
        System.out.println("Valor 5 " + enterosSimplificadoVar[4]);
        System.out.println(enterosSimplificadoVar); //imprime la refernecia de memoria no la lista

        //ITERACION CON ARREGLOS
        for (int i = 0; i < enterosSimplificadoVar.length; i++) {
            System.out.println("del indice " + i + ": " + enterosSimplificadoVar[i]);
        }

        //INTRODUCIR VALORES DE FORMA DINAMICA
        var consola = new Scanner(System.in);
        //definir tamaño del arreglo
        var size = consola.nextInt();

        var arreglo = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Proporciona el valor entero [" + i + "] = ");
            arreglo[i] = consola.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("arreglo["+ i +"] = " + arreglo[i]);
        }
    }
}
