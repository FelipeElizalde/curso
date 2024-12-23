public class PasoPorReferencia {

    public static void main(String[] args) {
        Persona persona= new Persona();
        persona.cambiatrNombre("Juan");
        imprimirNombre(persona);
        modificarPersona(persona);

    }

    public static void imprimirNombre(Persona persona){
        System.out.println("Valor recibido "+ persona.obtenerNombre());
    }

    public static void modificarPersona(Persona persona){
        persona.cambiatrNombre("Carlos");

    }





    /*public static void main(String[] args) {
        Persona p= new Persona();
        p.cambiarNombre("Juan");
        imprimirNombre(p);
        modificarPersona(p);
        imprimirNombre(p);
    }

    public static void imprimirNombre(Persona p1){
        System.out.println("valor recibido "+p1.obtenerNombre());
    }

    public static void modificarPersona(Persona arg){
        arg.cambiarNombre("Carlos");
    }*/
}
