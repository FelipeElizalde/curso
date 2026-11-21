package sec4cadenas;

public class Subcadenas {
    public static void main(String[] args) {
        //cadena.Subcadenas

        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        //Subcadena "Hola"
        var subcadena1 = cadena1.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);

        //Subcadena "Mundo"
        var subcadena2 = cadena1.substring(5,10);
        System.out.println("subcadena2 = " + subcadena2);

        //Busqueda de subcadens
        // Utilizamos la función index of - devuelve le índice de la primera aparición de la subcadena

        //Buscamos la subcadena "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        // lastIndexOf - devuelve el índice de la última aparición de la subcadena
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);

        // Subcadena no encontrada devuelve -1, sin importar el método
        var indice3 = cadena1.indexOf("Java");
        System.out.println("indice3 = " + indice3);

        // Reemplazar "Mundo" por "a todos"
        var nuevaCadena = cadena1.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Reemplazar "Hola" por "Saludos"
        var nuevaCadena2 = cadena1.replace("Hola", "Saludos");
        System.out.println("nuevaCadena2 = " + nuevaCadena2);





    }
}
