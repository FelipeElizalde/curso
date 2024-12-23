/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclo;

import javax.swing.JOptionPane;

/* Algoritmo que imprim las tablas de multiplicar,
 * la cantidad de tablas son definidas por el usuario
 * así como la cantidad de números a multiplicar
 */
/**
 *
 * @author JESUS
 */
public class Ejercicio1ForAnidado {

    public static void main(String[] args) {
        int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de tablas"));

        for (int j = 1; j <= cant; j++) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i + " * " + j + " = " + (i * 2));
            }
            System.out.println("*******************");
        }
    }

}
