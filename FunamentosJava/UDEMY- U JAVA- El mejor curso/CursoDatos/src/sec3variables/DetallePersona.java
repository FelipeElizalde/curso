package sec3variables;

public class DetallePersona {
    public static void main(String[] args) {
        //Ejercicio
        String nombre = "Felipe de Jesus Mata Elizalde";
        int edad = 29;
        //double altura = 1.65;
        //Si se define como flotante se grega una F para que se sepa que el vaor es de tipo flotante
        float altura = 1.65F;
        String pais = "México";
        char estadoCivil = 'C'; //C-Casado, S-Soltero

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura);
        System.out.println("Pais de origen: " + pais);
        System.out.println("Estado Civil: " + estadoCivil);

    }
}
