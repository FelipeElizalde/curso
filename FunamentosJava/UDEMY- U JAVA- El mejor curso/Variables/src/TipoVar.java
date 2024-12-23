public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** TIPO VAR ***");

        // Debe ser usada exclusivamente para definir variables dentro de clases o métodos
        // Debe ser inicializada al declararse
        // Debe ser inferible (no se puede inicializar en null ya que no estaría apuntando a un valor)
        // Ya no se puede modificar el tipo de valor una vez declarado

        //Sin var
        String nombre = "Luis";
        System.out.println("nombre = " + nombre);

        var nombre2 = "Carlos";
        System.out.println("nombre2 = " + nombre2);

        //nombre2 = 3; Error, no se puede cambiar el tipo de dato

        var edad = 23L; // Se infiere que es de tipo Long
        System.out.println("edad = " + edad);

        var sueldo = 5000.7F; // Se infiere que es de tipo Flotante
        System.out.println("sueldo = " + sueldo);

        var esCasado = true; // Se infiere el tipo boolean
        esCasado = false;
        System.out.println("esCasado = " + esCasado);

    }
}
