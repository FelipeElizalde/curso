package ej1;

import java.util.Scanner;

public class Metodos2 {
    private double a;
    private double b;
    private double c;
    Scanner s = new Scanner(System.in);
    public Metodos2(){

    }
    public void Conversion(){
        System.out.print("introduce los grados celcius: ");
        this.a=s.nextDouble();
        System.out.println("Grados Celcius " + a + "° Grados Fahrenheit " + (32 + (9 * a / 5)) + "°");
    }

    public void Area(){
        System.out.println("Introduce radio de la circunferencia:");
        this.a = s.nextDouble();
        this.b = 2 * Math.PI * a;
        c = Math.PI * Math.pow(a, 2);
        System.out.println("Longitud de la circunferencia -> " + b);
        System.out.println("Area de la circunferencia -> " + c);
    }

    public void Velocidad(){
        System.out.println("Introduzca velocidad en Km/h: ");
        this.a = s.nextDouble();
        System.out.println(a + " Km/h -> " + a*1000/3600 + " m/s");
    }

    public void LongitudHipotenusa(){
        System.out.print("Introduzca longitud del primer cateto: ");
        this.a = s.nextDouble();
        System.out.print("Introduzca longitud del segundo cateto: ");
        this.b = s.nextDouble();
        System.out.println("Hipotenusa -> " +  Math.sqrt(Math.pow(a,2)+ Math.pow(b, 2)));
    }





}
