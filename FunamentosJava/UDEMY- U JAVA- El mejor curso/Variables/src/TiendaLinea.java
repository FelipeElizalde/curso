public class TiendaLinea {
    public static void main(String[] args) {
        System.out.println("DETALLE PRODUCTO 1");

        String nombreProducto = "Caja";
        double precio = 75.7D;
        int cantidadDisponible = 3;
        boolean disponibleVenta = true;

        System.out.println("Producto: " + nombreProducto );
        System.out.println("Precio: " + precio );
        System.out.println("Disponibles: " + cantidadDisponible );
        System.out.println("Disponible para venta: " + disponibleVenta );

        System.out.println();
        System.out.println("DETALLE PRODUCTO 2");

        nombreProducto = "Cinta";
        precio = 25.56D;
        cantidadDisponible = 0;
        disponibleVenta = false;

        System.out.println("Producto: " + nombreProducto );
        System.out.println("Precio: " + precio );
        System.out.println("Disponibles: " + cantidadDisponible );
        System.out.println("Disponible para venta: " + disponibleVenta );

    }
}
