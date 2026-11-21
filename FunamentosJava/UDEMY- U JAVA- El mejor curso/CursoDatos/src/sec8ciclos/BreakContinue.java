package sec8ciclos;

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("***  Break y continue   ***");

        //Break: Rompe de manera prematura un ciclo
        System.out.println("Palabra break");
        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0){
                System.out.println(i + " ");
                break;
            }
        }
        
        //Continue
        System.out.println("Palabra continue");
        for (int i = 1; i < 10; i++) {
            if(i % 2 == 1){ //numero impar
                continue; //saltamos a la siguiente iteracion
            }
            System.out.print(i + " ");
        }
    }
}
