public class PruebaAritmetica {
    public static void main(String [] args){
        int operandoa=6;
        int operandob=2;

        Aritmetica objeto1= new Aritmetica(operandoa,operandob);
        System.out.println("operandoa = "+operandoa);
        System.out.println("operandob = "+operandob);

        System.out.println("\nSuma = "+objeto1.sumar());
        System.out.println("Restar = "+objeto1.restar());
        System.out.println("Multiplicar = "+objeto1.multiplicar());
        System.out.println("Dividir = "+objeto1.dividir());
    }


}
