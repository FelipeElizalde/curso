package cadena;

public class ComparacionCadenas {
    public static void main(String[] args) {
        //Comparacion de cadenas
        var cadena1 = "Java";
        var cadena2 = "Java";
        String cadena3 = new String("Java");

        //Comparar con operador ==, compara la referencia en memoria
        System.out.print("cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);

        //Al comparar con cadena 3 es falso ya que la referencia no es igual ya que se está utilizando un objeto de tipo String
        System.out.print("cadena1 es igual en referencia a cadena3: ");
        System.out.println(cadena1 == cadena3);

        // Para comparar ambas cadenas y que nos de como resultado true ya que es el mismo texto utilizamos un método
        // en este caso equals
        System.out.print("cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));


    }
}
