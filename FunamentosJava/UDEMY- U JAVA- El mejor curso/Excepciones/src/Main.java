

public class Main {
    public static void main(String[] args) {

        //Manejo de Excepciones con try catch controlamos una excepxion y no nos bloquea
        // el flujo sin embargo envía las excepciones genericas
        int resultado = 0;
        int resultado2 = 0;
        try {
            //resultado = 100 / 0;
            //resultado = Aritmetica.division(100 ,0);
            resultado = Capa1.division1(100,0);
        }catch (Exception e){
            e.printStackTrace(); //mandamos el error completo
            System.out.println(e.getMessage());//Enviamos solo el mensaje
        }

        System.out.println("Runtime");
        //El compilador no nos obliga a procesar la Exception pero lo termina de manera abrupta
        //resultado2 = Aritmetica.divisionRuntime(100,0);


        System.out.println("resultado = " + resultado);
        System.out.println("resultado2 = " + resultado2);
    }
}