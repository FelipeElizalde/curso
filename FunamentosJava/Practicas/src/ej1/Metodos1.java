package ej1;

import java.util.Scanner;

public class Metodos1 {
    private int a;
    private int b;
    private String l;
    private int c;
    String j="a";
    Scanner s = new Scanner(System.in);

    public Metodos1(){
         Numeros();
         IntroducirNombre();
         IncrementoNumero();
    }

    public void Numeros(){
        System.out.println("Introduce dos numeros ");
        System.out.print("Numero 1" );
        this.a = Recibir();
        System.out.print("Numero 2" );
        this.b= Recibir();
        System.out.print("Cambia numero 2");
        setB(s.nextInt());
    }
    public void IntroducirNombre(){
        System.out.print("Introduce un nombre: ");
        this.l=Recibir1();
    }

    public void IncrementoNumero(){
        System.out.println("Introduce el numero a incremetar");
        this.c = s.nextInt();
    }

    public int Recibir(){
        return s.nextInt();
    }

    public String Recibir1(){return s.next();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getL() {
        return l;
    }

    public void setL(String l) {
        this.l = l;
    }

    @Override
    public String toString() {

            return "Numero 1: " + a +
                    "\nNumero 2: " + b +
                    "\nNombre: " + l +
                    "\nNumero " + c + "incrementado x2 "+ c*2 +
                    "\nNumero " + c + "incrementado x3 "+ c*3
                    ;

    }
}
