/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Condicional;

import javax.swing.JOptionPane;

/*Algoritmo que solicite un numero, si este es negativo entonces lo convierta en positivo*/

/**
 *
 * @author JESUS
 */
public class Ejercicio2CondicionalSimple {
    public static void main(String[] args) {
        int num = 0;
        
        num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        
        if (num < 0) {
            System.out.println("El número es negativo");
            num = num * -1;
            
        }
        System.out.println("El numero ingresado es: " + num);
    }
    
}
