/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bonus;

import javax.swing.JOptionPane;

/**
 *
 * @author JESUS
 */
public class Bonus {

    public static void main(String[] args) {
        String menuVerdura, menuTomate, menuPapa, menuCebolla;
        int codigoVerdura, codigoTipo, valorSemilla = 0, numeroSemilla, costoSemilla;
        String verdura = "", tipo = "", resp = "";
        boolean error = false;

        do {
            error = false;
            
            menuVerdura = "MENÚ VERDURA\n\n";
            menuVerdura += "1. Tomate\n";
            menuVerdura += "2. Repollo\n";
            menuVerdura += "3. Papa\n";
            menuVerdura += "4. Cebolla\n";

            menuTomate = "TIPO TOMATE\n\n";
            menuTomate += "1. Chonto\n";
            menuTomate += "2. Ensalada\n";

            menuPapa = "TIPO PAPA\n\n";
            menuPapa += "1. Criolla\n";
            menuPapa += "2. Pastusa\n";
            menuPapa += "3. Salentuna\n";

            menuCebolla = "TIPO CEBOLLA\n\n";
            menuCebolla += "1. Larga\n";
            menuCebolla += "2. De Huevo\n";

            codigoVerdura = Integer.parseInt(JOptionPane.showInputDialog(menuVerdura + "Ingrese el código de la verdura"));

            switch (codigoVerdura) {
                case 1:
                    verdura = "Tomate";
                    codigoTipo = Integer.parseInt(JOptionPane.showInputDialog(menuTomate + "Ingrese el tipo de tomate"));
                    switch (codigoTipo) {
                        case 1:
                            tipo = "Chonto";
                            valorSemilla = 15;
                            //System.out.println(tipo);
                            break;
                        case 2:
                            tipo = "Ensalada";
                            valorSemilla = 20;
                            //System.out.println(tipo);
                            break;
                        default:
                            System.out.println("El tipo ingresado no existe!!!");
                            error = true;
                            break;
                    }
                    break;
                case 2:
                    verdura = "Repollo";
                    tipo = "Normal";
                    valorSemilla = 10;
                    //System.out.println(tipo);
                    break;
                case 3:
                    verdura = "Papa";
                    codigoTipo = Integer.parseInt(JOptionPane.showInputDialog(menuPapa + "Ingrese el tipo de papa"));
                    switch (codigoTipo) {
                        case 1:
                            tipo = "Criolla";
                            valorSemilla = 8;
                            //System.out.println(tipo);
                            break;
                        case 2:
                            tipo = "Pastusa";
                            valorSemilla = 9;
                            //System.out.println(tipo);
                            break;
                        case 3:
                            tipo = "Salentuna";
                            valorSemilla = 11;
                            //System.out.println(tipo);
                            break;
                        default:
                            System.out.println("El tipo ingresado no existe!!!");
                            error = true;
                            break;
                    }
                    break;
                case 4:
                    verdura = "Cebolla";
                    codigoTipo = Integer.parseInt(JOptionPane.showInputDialog(menuCebolla + "Ingrese el tipo de cebolla"));
                    switch (codigoTipo) {
                        case 1:
                            tipo = "Larga";
                            valorSemilla = 15;
                            //System.out.println(tipo);
                            break;
                        case 2:
                            tipo = "De Huevo";
                            valorSemilla = 13;
                            //System.out.println(tipo);
                            break;
                        default:
                            System.out.println("El tipo ingresado no existe!!!");
                            error = true;
                            break;
                    }
                    break;
                default:
                    System.out.println("El tipo de verdura ingresado no existe!!!");
                    error = true;
                    break;
            }

            if (error == false) {
                numeroSemilla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de semillas"));
                costoSemilla = numeroSemilla * valorSemilla;

                System.out.println("Verdura: " + verdura + " de tipo " + tipo);
                System.out.println("Valor semilla: " + valorSemilla);
                System.out.println("Cant. semillas: " + numeroSemilla);
                System.out.println("Costo semilla: " + costoSemilla);
            }else{
                System.out.println("Error en el ingreso de datos");
            }

            System.out.println("***************************");

            resp = JOptionPane.showInputDialog("Ingrese si, si desea continuar");
        } while (resp.equalsIgnoreCase("si"));

    }
}
