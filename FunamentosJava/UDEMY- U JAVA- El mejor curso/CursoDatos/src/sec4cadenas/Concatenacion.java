package sec4cadenas;

public class Concatenacion {
    public static void main(String[] args) {
        //Concatenación con concat
        var cadena2 = " Leo Reyes    ";
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

        var stringBuilderEjercicio = new StringBuilder();
        stringBuilderEjercicio.append("""
                Metiendo cadenas con saltos
                de linea 
                como ejemplo
                """);
        stringBuilderEjercicio.append("String simple");

        System.out.println(stringBuilderEjercicio);

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
