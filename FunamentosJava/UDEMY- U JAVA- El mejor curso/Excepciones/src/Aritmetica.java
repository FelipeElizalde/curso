public class Aritmetica{

    //Le indicamos que posiblemente este metodo arroja una excepcion con throws
    public static int division(int numerador, int denominador) throws OperacionExcepcion{
        if (denominador == 0){
            throw new OperacionExcepcion("Division entre Ceross"); //1utilizamos nuestra clase personalizada
        }

        return numerador/denominador;
    }

    public static int divisionRuntime(int numerador, int denominador) {
        if (denominador == 0){
            throw new RuntimeOperacionException("Division entre Cero2"); //1utilizamos nuestra clase personalizada
        }

        return numerador/denominador;
    }
}
