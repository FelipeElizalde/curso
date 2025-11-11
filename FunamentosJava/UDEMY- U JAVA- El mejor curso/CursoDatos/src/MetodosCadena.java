public class MetodosCadena {
    public static void main(String[] args) {

        var cadena1 = "Hola Mundo";

        //Obtener la longitud
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        //Reemplazar caracteres
        var nuevaCadena = cadena1.replace("o","a");
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

        //Concatenación con concat
        var cadena1Conc = "Hola";
        var cadena2Conc = "Mundo";
        var cadena3Conc = cadena1Conc + " " + cadena2Conc; //Concatenación con operador +

        cadena3Conc = cadena1Conc.concat(" ").concat(cadena2Conc);
        System.out.println("cadena3Conc = " + cadena3Conc);

        // String Builder - Clase mas eficiente para realizar concatenciones mas repetitivas
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1Conc);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2Conc);
        var resultado = constructorCadenas.toString();

        System.out.println("String Builder = " + resultado);

        //String Buffer - Similar a StringBuilder, pero es más seguro al trabajar con varios hilos
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1Conc).append(" ").append(cadena2Conc);
        resultado = stringBuffer.toString();
        System.out.println("String Buffer " + resultado);

        //join - se utiliza para unir dos o más cadenas
        resultado = String.join(" ", cadena1Conc, cadena2); //Para concatenar se coloca el delimitador en el primer espacio
        System.out.println("resultado join " + resultado);

    }
}
