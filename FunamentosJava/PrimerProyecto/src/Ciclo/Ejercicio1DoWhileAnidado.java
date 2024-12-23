/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ciclo;

import javax.swing.JOptionPane;

/*Algoritmo que imprima la suma de los primeros n numeros usando el ciclo do-while, repita esto las veces que el usuario requiera*/
/**
 *
 * @author JESUS
 */
public class Ejercicio1DoWhileAnidado {

    public static void main(String[] args) {
        int i = 0, j = 0, suma = 0, cant = 0, n = 0;

        n = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de veces a repetir"));
        do {
            JOptionPane.showMessageDialog(null, "Inicia la Sumatoria");
            cant = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de numeros a sumar"));

            do {

                suma = suma + i;
                System.out.println(suma);
                i++;
            } while (i <= cant);

            System.out.println("La suma de los " + cant + "números es: " + suma);
            j++;
        } while (j < n);

    }
}
