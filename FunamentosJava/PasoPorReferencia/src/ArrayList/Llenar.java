package ArrayList;

import java.util.ArrayList;

public class Llenar {
    public ArrayList<String> lista (){
        ArrayList<String> lista1= new ArrayList<>();
        for (int x=1;x<=10;x++)
            lista1.add("numero "+ x);
        return lista1;
    }

}
