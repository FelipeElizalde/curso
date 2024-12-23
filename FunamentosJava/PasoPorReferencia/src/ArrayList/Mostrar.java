package ArrayList;

import java.util.ArrayList;

public class Mostrar {
    public static void main(String[] args) {
        Llenar llenar = new Llenar();
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Numeros");
        for (String a: llenar.lista()){
            lista.add(a);
        }

        System.out.println(lista.toString());


    }


}
