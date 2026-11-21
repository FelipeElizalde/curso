package sec6operadores;

public class OperadoresUnarios {
    public static void main(String[] args) {
        /**
         * Operador unario positivo +
         * Operador unario negativo -
         * Operador unario de incremento ++
         * Operador unario de decremento --
         */

        System.out.println("*** Operadores Unarios ***");
        int a = 3, b = -2, resultado;
        var c = true;

        //Operador unario +
        resultado = +a; //Solo va a indicar y/o modificar un valor a positivo, no es necesario ponerlo
        System.out.println("resultado +a = " + resultado);

        //Operador unario -
        resultado = -a; //Solo va a indicar y/o modificar un valor a negativo, no es necesario ponerlo
        System.out.println("resultado -a = " + resultado);

        //Operador unario incremento/decremento
        a = 3;
        //pre-incremento
        resultado = ++a; //primero se incrementa el valor
        System.out.println("pre - resultado ++a = " + resultado);
        System.out.println("a ya se incremento = " + a);

        a = 3;
        //pos-incremento
        resultado = a++; //primero se usa el valor y despues se incrementa
        System.out.println("post - resultado ++a = " + resultado);
        System.out.println("a en este momento se incrementa = " + a); //se increment hasta que se vuelva a utilizar


        //pre-decremento
        resultado = --b; //primero se incrementa el valor
        System.out.println("pre - resultado --b = " + resultado);
        System.out.println("b ya se decremento = " + b);

        b = -2;
        //pos-decremento
        resultado = b--; //primero se usa el valor y despues se decrementa
        System.out.println("post - resultado b-- = " + resultado);
        System.out.println("b en este momento se decrementa = " + b); //se decrementa hasta que se vuelva a utilizar



    }
}
