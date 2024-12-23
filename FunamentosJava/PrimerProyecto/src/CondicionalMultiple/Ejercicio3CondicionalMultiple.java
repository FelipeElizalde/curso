/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CondicionalMultiple;

import javax.swing.JOptionPane;

/*Algoritmo que basado en la siguiente tabla realice los procesos correspondientes
1. Ejercicio 1 Secuencial Simple
2. Ejercicio 1 Condicional Simple
3. Ejercicio 1 Condicional Doble
4. Ejercicio 1 Condicional Multiple conCondicion Anidada
5. Ejercicio 2 Condicional Anidada
 */
/**
 *
 * @author JESUS
 */
public class Ejercicio3CondicionalMultiple {

    public static void main(String[] args) {
        int codigo = 0;
        String menu = "MENU DE OPCIONES\n\n";
        String mensaje = "";
        double nota1,
                nota2,
                nota3,
                prom;
        double valorCompra = 0, descuento = 0, valorFinal = 0; //Se recomienda inicializar las variables
        int numero = 0;
        double sueldo = 0,
                aumento = 0;
        int antiguedad = 0;
        String mensaje2 = "MENU\n\n";

        menu += "1. Ejercicio 1 Secuencial Simple\n";
        menu += "2. Ejercicio 1 Condicional Simple\n";
        menu += "3. Ejercicio 1 Condicional Doble\n";
        menu += "4. Ejercicio 1 Condicional Multiple conCondicion Anidada\n";
        menu += "5. Ejercicio 2 Condicional Anidada\n";
        menu += "Igrese una opción\n";

        codigo = Integer.parseInt(JOptionPane.showInputDialog(menu + "\n Ingrese el código "));

        switch (codigo) {
            case 1:

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
                break;
            case 2:
                valorCompra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la Compra"));

                if (valorCompra >= 100000) {
                    descuento = valorCompra * 0.5;
                    valorCompra = valorCompra - descuento;
                    System.out.println("Se realió un descuento del 50% equivalente a: " + descuento);
                }

                System.out.println("El valor a pagar es: " + valorCompra);
                break;
            case 3:

                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

                if (numero >= 0) {
                    System.out.println("El número es positivo");
                } else {
                    System.out.println("El número es negativo");
                }

                int num1 = 0,
                 num2 = 0;

                num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número1"));
                num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número2"));

                if (num1 > num2) {
                    System.out.println("El número 1 es mayor");
                } else {
                    System.out.println("El número 2 es mayor");
                }
                break;
            case 4:

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
                break;
            case 5:

                mensaje2 += "1. Lunes\n";
                mensaje2 += "2. Martes\n";
                mensaje2 += "3. Miercoles\n";
                mensaje2 += "4. Jueves\n";
                mensaje2 += "5. Viernes\n";
                mensaje2 += "6. Sabado\n";
                mensaje2 += "7. Domingo\n";

                codigo = Integer.parseInt(JOptionPane.showInputDialog(mensaje2 + "\n Ingrese el código "));

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
                break;
            default:
                System.out.println("Él código no es válido");
                break;
        }
    }
}
