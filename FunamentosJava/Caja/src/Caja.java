public class Caja {
    int ancho;
    int alto;
    int profundo;

    public Caja(){

    }

    public Caja(int arg1, int arg2, int arg3){
        ancho=arg1;
        alto=arg2;
        profundo=arg3;
    }

    public int volumen(){
        return ancho*alto*profundo;
    }


}
