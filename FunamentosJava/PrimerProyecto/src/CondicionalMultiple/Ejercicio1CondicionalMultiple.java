/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CondicionalMultiple;

import javax.swing.JOptionPane;

/*De un operario se conoce su sueldo y los años de antigüedad. Se pide crear un programa que lea 
los datos de entrada e informe:
	•Si el sueldo es inferior a 500 y su antigüedad es igual o superior a 10 años, 
	 otorgarle un aumento del 20 %, mostrar el sueldo a pagar.
	•Si el sueldo es inferior a 500 pero su antigüedad es menor a 10 años, otorgarle un aumento de 5 %.
	•Si el sueldo es mayor o igual a 500 mostrar el sueldo en pantalla sin cambios.*/

/**
 *
 * @author JESUS
 */
public class Ejercicio1CondicionalMultiple {
    public static void main(String[] args) {
        double sueldo = 0, aumento = 0;
        int antiguedad = 0;
        String mensaje = "";
        
        sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Sueldo"));
        antiguedad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los años de antiguedad"));
        
        if (sueldo < 500 && antiguedad >= 10) {
            aumento = sueldo * 0.2;
            sueldo = sueldo + aumento;
            mensaje = "Usted tiene un aumento del 20%, su nuevo sueldo es: " + sueldo;
        } else {
            if (sueldo < 500 && antiguedad < 10) {
                aumento = sueldo * 0.05;
            sueldo = sueldo + aumento;
            mensaje = "Usted tiene un aumento del 5%, su nuevo sueldo es: " + sueldo;
            } else {
                if (sueldo >= 500) {
                    mensaje = "Usted no tiene un aumento, su nuevo sueldo es: " + sueldo;
                } else {
                }
            }
        }
        
        System.out.println(mensaje);
    }
}
