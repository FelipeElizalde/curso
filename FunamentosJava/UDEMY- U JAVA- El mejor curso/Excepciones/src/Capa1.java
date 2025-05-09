public class Capa1 {

    public static int division1(int numerador, int denominador) throws OperacionExcepcion2 {
        try {
            return Aritmetica.division(numerador,denominador);
        } catch (Exception e) {
            throw new OperacionExcepcion2(e.getMessage());
            //System.out.println("ERROOOOOOOOOOOOOOOOOOOR");
            //return 0;
        }
    }


}
