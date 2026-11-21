package sec6operadores;

public class PrecedenciaOperadores {

    public static void main(String[] args) {
        //Precedencia de operadores en java
        //1. Parentesis y corchetes
        //2. Operadores unarios -, ++, --
        //3. Operadores aritmeticos *, / y %
        //4. Operadores aritméticos + y -
        //5. Relacionales <, <=, >, >=
        //6. Equivalencia == y !=
        //7. Lógicos && y ||
        //8. Asignación =, +=, -=, *=, etc..

        //Expresion
        var a = 12 / 3 + 2 * 3 - 1;
        //Se analizan las expresiones de izquierda a derecha,
        //Se ejecutan los aritmeticos p3 de izquierda a derecha, primero va la division y luego la multiplicación
        //luego los aritmeticos p4 de izquierda a derecha

        //Paso 1 Division 12 / 3 = 4
        //Paso 2 Multiplicación 2 * 3 = 6
        //Paso 3  Suma 4 + 6 = 10
        //Paso 4 Resta 10 - 1 = 9


        System.out.println("a = " + a);
        
        //Esto puede cambiar si agragamos por ejemplo los parentesis porque primero se va a ejecurtar lo que esta entre parentesis
        a = 12 / (3 + 2) * (3 - 1);
        System.out.println("a = " + a);

    }
}
