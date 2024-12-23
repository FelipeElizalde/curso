public class EjemploArreglos {
    public static void main(String[] args) {

       int edades [];
       edades = new int[3];

       edades[0] = 30;
       edades[1] = 15;
       edades[2] = 20;

        System.out.println("Arreglo enteros indice 0: " + edades[0]);
        System.out.println("Arreglo enteros indice 1: " + edades[1]);
        System.out.println("Arreglo enteros indice 2: " + edades[2]);

        Persona personas[];
         personas = new Persona[4];

         personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");

        System.out.println("Arreglo personas indice 0: " + personas[0]);
        System.out.println("Arreglo personas indice 1: " + personas[1]);
        System.out.println("Arreglo personas indice 2: " + personas[2]);
        System.out.println("Arreglo personas indice 3: " + personas[3]);

        String nombres[] = {"Sara", "Laura", "Carlos", "Carmen"};

        for (int i = 0; i<nombres.length; i++){
            System.out.println("Arreglo String indice " + i + ": " + nombres[i]);
        }























        /*//1. Declaremos un arreglo de enteros
        int edades[];
        //2. Instanciar el arreglo de enteros
        edades = new int[3];
        //3. Inicializamos los valores del arreglo de enteros
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;

        //Imprimimos los valores del arreglo a la salida estandar
        //4. leemos cada valor del arreglo
        System.out.println("Arreglo enteros indice 0: " + edades[0]);
        System.out.println("Arreglo enteros indice 1: " + edades[1]);
        System.out.println("Arreglo enteros indice 2: " + edades[2]);

        //1.Declarar un arreglo de tipo object
        Persona personas[];
        //2. Instanciar el arreglo de tipo object
        personas = new Persona[4];
        //3. Inicializar los valores del arreglo
        personas[0] = new Persona("Juan");
        personas[1] = new Persona("Karla");

        //4. imprimir los valores del arreglo
        System.out.println("Arreglo personas indice 0: " + personas[0]);
        System.out.println("Arreglo personas indice 1: " + personas[1]);
        System.out.println("Arreglo personas indice 2: " + personas[2]);
        System.out.println("Arreglo personas indice 3: " + personas[3]);

        //Arreglo utilizando notacion simplificada
        String nombres[] = {"Sara", "Laura", "Carlos", "Carmen"};
        //imprimir los elementos de un arreglo
        for(int i=0; i < nombres.length ; i++){
            System.out.println("Arreglo String indice " + i + ": " + nombres[i]);
        }*/

    }
}
