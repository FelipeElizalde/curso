/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclo;

/*Algoritmo que imprima la suma de los 10 primeros numeros usando el ciclo do-while*/

/**
 *
 * @author JESUS
 */
public class Ejercicio1DoWhile {
    public static void main(String[] args) {
        int i = 0, suma = 0;
        
        do {
            
            suma = suma + i;
            System.out.println(suma);
            i++;
        } while (i <= 10);
    }
}
