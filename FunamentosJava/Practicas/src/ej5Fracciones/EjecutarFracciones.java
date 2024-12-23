package ej5Fracciones;

public class EjecutarFracciones {
    public static void main(String[] args) {
        Fracciones f1 = new Fracciones(1, 4); // Fracción 1/4
        Fracciones f2 = new Fracciones(1, 2); // Fracción 1/2
        Fracciones f3 = new Fracciones(); // Fracción 0/1
        Fracciones f4 = new Fracciones(4); // Fracción 4/1
        // operaciones aritméticas con esas fracciones
        Fracciones suma = f1.Sumar(f2);
        Fracciones resta = f1.Restar(f3);
        Fracciones producto = f1.Multiplicar(f4);
        Fracciones cociente = f1.Dividir(f2);
        //mostrar resultados
        System.out.println(f1 + " + " + f2 + " = " + suma);
        System.out.println(f1 + " - " + f3 + " = " + resta);
        System.out.println(f1 + " * " + f4 + " = " + producto);
        System.out.println(f1 + " / " + f2 + " = " + cociente);
    }
}
