/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicional;

import javax.swing.JOptionPane;

/*Algoritmo que solicite un numero y nos indique si es positivo o negativo
Leer 2 numeros y determinar cual es el mayor*/
/**
 *
 * @author JESUS
 */
public class Ejercicio1CondicionalDoble {
    public static void main(String[] args) {
        int numero = 0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        
        if (numero >= 0) {
            System.out.println("El número es positivo");
        } else {
            System.out.println("El número es negativo");
        }
        
        int num1 = 0, num2 = 0;
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número1"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número2"));
        
        if (num1 > num2) {
            System.out.println("El número 1 es mayor");
        } else {
            System.out.println("El número 2 es mayor");
        }
    }
}
