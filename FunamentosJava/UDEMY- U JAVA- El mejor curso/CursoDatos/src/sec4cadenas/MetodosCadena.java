package sec4cadenas;

public class MetodosCadena {
    public static void main(String[] args) {

        var cadena1 = "Hola Mundo";

        //Obtener la longitud
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        //Reemplazar caracteres
        var nuevaCadena = cadena1.replace("o", "a");
        System.out.println("nuevaCadena = " + nuevaCadena);

        //Convertir a mayuscula
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);

        //convertir a minusculas
        System.out.println("minusculas = " + cadena1.toLowerCase());

        //Eliminar escacios al inicio y al final
        var cadena2 = " Leo Reyes    ";
        System.out.println("cadena2 con espacios = " + cadena2);
        System.out.println("cadena2 sin espacios = " + cadena2.trim());

    }
}
