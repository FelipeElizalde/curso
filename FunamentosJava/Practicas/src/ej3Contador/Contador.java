package ej3Contador;

public class Contador {
    private int cont;
    public Contador(){

    }
    public Contador(int cont){
        if (cont<0){
            this.cont=0;
        }else{
            this.cont = cont;
        }
    }

    public Contador (final Contador c){
        cont = c.cont;
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        if (cont < 0) {
            this.cont = 0;
        } else {
            this.cont = cont;
        }
    }

    public void Incrementar(){
        this.cont++;
    }

    public void Decrementar(){
       this.cont--;
        if (this.cont<=0) {
            this.cont = 0;
        }
    }
}
