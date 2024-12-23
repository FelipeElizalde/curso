import java.util.Scanner;

public class Tienda_Libros {
    public static void main(String[] args ){
        Scanner valor=new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        String nombre = valor.nextLine();
        System.out.println("Proporciona el id: ");
        int id = valor.nextInt();
        System.out.println("Proporciona el precio: ");
        double precio = valor.nextDouble();
        System.out.println("Proporciona el simbolo: ");
        char simbolo = valor.next().charAt(0);
        System.out.println("Proporciona el envio gratuito ");
        boolean envioGratuito = Boolean.parseBoolean(valor.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);


    }
}
