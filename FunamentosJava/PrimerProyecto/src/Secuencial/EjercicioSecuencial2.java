package Secuencial;
/*algoritmo que reciba como entrada el sueldo de una persona
y sus horas extras trabajadas y luego imprima el Sueldo 
total de esta persona dado que cada hora extra vale $3000.*/

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JESUS
 */
public class EjercicioSecuencial2 {
    public static void main(String[] args) {
        double sueldoBase, cantHorasExtras, sueldoTotal, totalHorasExtras;
        String mensaje;
        
        sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo base"));
        cantHorasExtras = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de horas extras"));
        
        totalHorasExtras = cantHorasExtras * 3000;
        sueldoTotal = sueldoBase + totalHorasExtras;
        
        mensaje = "Sueldo base = " + sueldoBase + "\n";
        mensaje += "Horas extra = " + cantHorasExtras + "\n";
        mensaje += "Costo por hora = 3000 \n";
        mensaje += "Total de horas extras = " + totalHorasExtras + "\n";
        mensaje += "Sueldo total = " + sueldoTotal;
        
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
