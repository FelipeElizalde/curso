/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CondicionalMultiple;

import javax.swing.JOptionPane;

/*Algoritmo que solicite un codigo y basado en este imprima el dia correspondiente
* 1. Lunes  2. Martes   3. Miercoles    4. Jueves
* 5.Viernes 6. Sabado   7. Domingo
 */
/**
 *
 * @author JESUS
 */
public class Ejercicio2CondicionalMultiple {

    public static void main(String[] args) {
        int codigo = 0;
        String mensaje = "MENU\n\n";

        mensaje += "1. Lunes\n";
        mensaje += "2. Martes\n";
        mensaje += "3. Miercoles\n";
        mensaje += "4. Jueves\n";
        mensaje += "5. Viernes\n";
        mensaje += "6. Sabado\n";
        mensaje += "7. Domingo\n";

        codigo = Integer.parseInt(JOptionPane.showInputDialog(mensaje + "\n Ingrese el código "));

        switch (codigo) {
            case 1:
                System.out.println("El día es Lunes");
                break;
            case 2:
                System.out.println("El día es Martes");
                break;
            case 3:
                System.out.println("El día es Miercoles");
                break;
            case 4:
                System.out.println("El día es Jueves");
                break;
            case 5:
                System.out.println("El día es Viernes");
                break;
            case 6:
                System.out.println("El día es Sabado");
                break;
            case 7:
                System.out.println("El día es Domingo");
                break;
            default:
                System.out.println("Él código no es válido");
                break;
        }

    }
}
