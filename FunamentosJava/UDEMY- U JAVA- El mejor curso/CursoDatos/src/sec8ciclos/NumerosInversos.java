package sec8ciclos;

public class NumerosInversos {
    public static void main(String[] args) {
        System.out.println("*** Numeros Inversos ***");

        var contador = 10;

        System.out.print("""
                Do While
                """);
        do{
            System.out.print(contador--+ " ");
        }while(contador>0);

        System.out.print("""
                
                While
                """);
        contador = 10;

        while (contador > 0) {
            System.out.print(contador-- + " ");
        }
    }
}
