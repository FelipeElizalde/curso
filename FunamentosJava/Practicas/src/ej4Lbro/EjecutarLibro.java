package ej4Lbro;

import java.util.Scanner;

public class EjecutarLibro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String titulo, autor;
        int ejemplares;

        //se crea el objeto libro1 utilizando el constructor con parámetros
        Libro libro1 = new Libro("El quijote", "Cervantes", 1, 0);
        //se crea el objeto libro2 utilizando el constructor por defecto
        Libro libro2 = new Libro();

        System.out.print("Introduce titulo: ");
        titulo = sc.nextLine();
        System.out.print("Introduce autor: ");
        autor = sc.nextLine();
        System.out.print("Numero de ejemplares: ");
        ejemplares = sc.nextInt();

        //se asigna a libro2 los datos pedidos por teclado.
        //para ello se utilizan los métodos setters
        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setNumeroEjemplares(ejemplares);

        //se muestran por pantalla los datos del objeto libro1
        //se utilizan los métodos getters para acceder al valor de los atributos
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getNumeroEjemplares());
        System.out.println("Prestados: " + libro1.getEjemplaresPrestados());
        System.out.println();

        libro2.Prestar(libro2.Prestamo(),libro2.getTitulo());
        libro2.Devolver(libro2.Devolucion(),libro2.getTitulo());
        libro1.Prestar(libro1.Prestamo(),libro1.getTitulo());
        libro1.Devolver(libro1.Devolucion(),libro1.getTitulo());

        //se realiza un préstamo de libro1. El método devuelve true si se ha podido
        //realizar el préstamo y false en caso contrario
        /*if (libro1.Prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }*/

        //se realiza una devolución de libro1. El método devuelve true si se ha podido
        //realizar la devolución y false en caso contrario

        /*if (libro1.Devolucion()) {
            System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
        }*/

        //se realiza otro préstamo de libro1
        if (libro1.Prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }

        //se realiza otro préstamo de libro1. En este caso no se podrá realizar ya que
        //solo hay un ejemplar de este libro y ya está prestado. Se mostrará por
        //pantalla el mensaje No quedan ejemplares del libro…
        if (libro1.Prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }
        //mostrar los datos del objeto libro1
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getNumeroEjemplares());
        System.out.println("Prestados: " + libro1.getEjemplaresPrestados());
        System.out.println();

        //mostrar los datos del objeto libro2
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Ejemplares: " + libro2.getNumeroEjemplares());
        System.out.println("Prestados: " + libro2.getEjemplaresPrestados());
        System.out.println();
    }


}
