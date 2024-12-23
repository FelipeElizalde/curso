public class PersonaPrueba {
    public static void main (String[] args){
        Persona persona1 = new Persona();

        System.out.println("Valores por default del objeto persona");
        persona1.desplegarNombre();
        persona1.nombre="Juan";
        persona1.apellidoPaterno="Esparza";
        persona1.apellidoMaterno="Lara";
        persona1.desplegarNombre();

        System.out.println("Nuevos valores del objeto persona 2");
        Persona persona2 = new Persona();
        persona2.desplegarNombre();
        System.out.println("Creacion de nuevo objeto");
        persona2.nombre="carlos";
        persona2.desplegarNombre();
    }
}
