public class PruebaCaja {
    public static void main (String[] args){
        int ancho=3;
        int alto=2;
        int profundo=6;
        Caja objeto1 = new Caja(alto,alto,profundo);
        System.out.println("Volumen de caja = "+objeto1.volumen());
    }

}
