
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author JESUS
 */
public class Principal {
    public static void main(String[] args) {
        String nombre, mensaje;
        int edad; 
        double num1, num2;
        
        nombre = JOptionPane.showInputDialog("Ingrese su nombre"); //Muestra un dialogo de un input de entrada y lo aloja en una variable tipo String
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));//Muestra un dialogo de un input de entrada y lo aloja en una variable convirtiendo el valor a tipo Int
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese num1"));//Muestra un dialogo de un input de entrada y lo aloja en una variable convirtiendo el valor a tipo Double
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese num2"));
        
        double suma = num1 + num2;
        
        mensaje = "Su nombre es: " + nombre + "\n";
        mensaje += "Su edad es: " + edad + "\n";
        mensaje += "Num1 = " + num1 + ", Num2 = " + num2 + "\n";
        mensaje += "La suma es: " + suma + "\n";
        
        JOptionPane.showMessageDialog(null, mensaje);
        
        System.out.println("Su nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
        System.out.println("Num1 = " + num1 + ", Num2 = " + num2);
        System.out.println("La suma es: " + suma);
    }
}
