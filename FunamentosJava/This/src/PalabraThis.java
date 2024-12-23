public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan");
        Punto p = new Punto(1,2);



    }
}

class Persona{
    String nombre;

    Persona(String nombre){
        this.nombre = nombre; //this apunta a un objeto de tipo Persona

        //imprimir el objeto persona
        Imprimir imprimir = new Imprimir();
        imprimir.imprimir(this);//this contiene una referencia al objeto Persona
    }
}

class Imprimir{
    public void imprimir(Persona p){
        System.out.println("impresion argumento: " + p);//valor del objeto persona
        System.out.println("impresion objeto actual (this)" + this);//this apunta a un objeto de tipo imprimir
    }
}

 class Punto{
     int x;
     int y;

     Punto (int a,int b){

         this.x=a;
         this.y=b;
    Imp i=new Imp();
    i.imp(a, b);
     }
     class Imp{
         public void imp(int x, int y ){
             System.out.println(x +""+y);
             System.out.println(this);

         }
     }
}

