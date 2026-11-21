package sec3variables;

public class DetalleLibro {
    public static void main(String[] args) {
        //Detalle de un Libro
        //Se crea un objeto de tipo String
        String tituloLibro = "El señor de los anillos";

        //Creamos variables de tipo primitivo
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        System.out.println("Titulo: " + tituloLibro);
        System.out.println("Año: " + anioPublicacion);
        System.out.println("Disponible: " + libroDisponible);
        System.out.println("Precio: " + precio);

        //Modificar variables
        tituloLibro = "El Señor de los Anillos";
        System.out.println(tituloLibro);
    }
}
