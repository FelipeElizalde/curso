/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclo;

import javax.swing.JOptionPane;

/* Algoritmo que imprima los 1n primeros números usando el ciclo while, 
 * repita el proceso hasta que el usuario decida
 */
/**
 *
 * @author JESUS
 */
public class Ejercicio1WhileAnidado {

    public static void main(String[] args) {
        int i = 0, suma = 0, cant = 0;
        String respuesta = "";

       
        do {
             cant = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de numeros a sumar"));
             i = 0;
             suma = 0;
            while (i <= cant) {

                suma = suma + i;
                System.out.println(suma);
                i++;
            }
            
             System.out.println("La suma de los " + cant + "números es: " + suma);

            respuesta = JOptionPane.showInputDialog("Ingresa si,si desea continuar");
        } while (respuesta.equalsIgnoreCase("si")); //Compara string ignorando si es mayuscula o minuscula

       
    }
}
