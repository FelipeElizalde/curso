/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author JESUS
 */
public class Exa {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
       System.out.println("Enter any phrase and I'll repeat it!... ");
      //here we are reading the next line:
       String numeros = scan.nextLine();

        String[] datos = numeros.split(" ");

        int a = Integer.parseInt(datos[0]);
        int b = Integer.parseInt(datos[1]);
        int c = Integer.parseInt(datos[2]);
        double cuadratica = b * b - (4 * a * c);
        double x1 = (-b + Math.sqrt(cuadratica)) / (2 * a);
        double x2 = (-b - Math.sqrt(cuadratica)) / (2 * a);

        System.out.println(x1);
        System.out.println(x2);

    }
}
