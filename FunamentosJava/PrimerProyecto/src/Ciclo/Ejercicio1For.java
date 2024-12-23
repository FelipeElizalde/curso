/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclo;

import javax.swing.JOptionPane;

/*Algoritmo que imprima la suma de los primeros n numeros usando el ciclo for*/

/**
 *
 * @author JESUS
 */
public class Ejercicio1For {
    public static void main(String[] args) {
        int suma = 0, cant = 0;
        
        cant = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de numeros a sumar con for"));
        
        for (int i = 0; i <= cant; i++) {
            suma = suma + i;
            System.out.println(suma);
        } 
        
        System.out.println("La suma de los " + cant + "números es: " + suma);
    }
}
