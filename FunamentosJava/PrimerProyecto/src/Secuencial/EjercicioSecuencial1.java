package Secuencial;
/*Algoritmo que lea tres notas y 
calcule e imprima el promedio de ellas.*/

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JESUS
 */
public class EjercicioSecuencial1 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, prom;
        String mensaje;
        
        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota1"));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota2"));
        nota3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese nota3"));
                
        prom = (nota1 + nota2 + nota3) / 3;
        
        mensaje = "nota1 = " + nota1 + "\n";
        mensaje += "nota2 = " + nota2 + "\n";
        mensaje += "nota3 = " + nota3 + "\n";
        mensaje += "El promedio es = " + prom;
        System.out.println("El promedio es: " + prom);
        JOptionPane.showMessageDialog(null, mensaje);
           
    }
}
