package sec3variables;

public class SistemaReserva {
    public static void main(String[] args) {
        System.out.println("*** SISTEMA DE RESERVA DE HOTELES ***");

        System.out.println("CLIENTE 1");
        String nombreCliente = "Juan Pérez";
        var diasEstancia = 3;
        final double TARIFA_DIARIA = 300;
        boolean vistaMar = true;

        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("TARIFA_DIARIA = " + TARIFA_DIARIA);
        System.out.println("vistaMar = " + vistaMar);

        System.out.println();
        System.out.println("CLIENTE 2");
        nombreCliente = "Luis López";
        diasEstancia = 2;
        vistaMar = false;

        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("TARIFA_DIARIA = " + TARIFA_DIARIA);
        System.out.println("vistaMar = " + vistaMar);

    }
}
