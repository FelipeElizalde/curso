package ej5Fracciones;

public class Fracciones {
    private int numerador;
    private int denominador;

    public Fracciones(){
        this.numerador = 0;
        this.denominador = 1;
    }
    public Fracciones(int numerador, int denominador){
        this.numerador = numerador;
        if (denominador == 0){
            denominador=1;
        }
        this.denominador = denominador;

    }
    public Fracciones(int numerador){
        this.numerador = numerador;
        this.denominador = 1;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    private int mcd(){
        int u=Math.abs(numerador);
        int v=Math.abs(denominador);
        if(v==0){
            return u;
        }
        int r;
        while(v!=0){
            r=u%v;
            u=v;
            v=r;
        }
        return u;
    }

    private void simplificar() {
        int n = mcd(); //se calcula el mcd de la fracción
        numerador = numerador / n;
        denominador = denominador / n;
    }

    public Fracciones Sumar (Fracciones f){
        Fracciones frac= new Fracciones();
        frac.numerador = this.numerador * f.denominador + this.denominador * f.numerador;
        frac.denominador = this.denominador * f.denominador;
        frac.simplificar();
        return frac;

    }

    public Fracciones Restar (Fracciones f){
        Fracciones frac = new Fracciones();
        frac.numerador = this.numerador * f.denominador - this.denominador *f.numerador;
        frac.denominador = this.denominador * f.denominador;
        frac.simplificar();
        return frac;
    }

    public Fracciones Multiplicar (Fracciones f){
        Fracciones frac = new Fracciones();
        frac.numerador = this.numerador* f.numerador;
        frac.denominador = this.denominador * f.denominador;
        frac.simplificar();
        return frac;
    }

    public Fracciones Dividir (Fracciones f){
        Fracciones frac = new Fracciones();
        frac.numerador = this.numerador* f.denominador;
        frac.denominador = this.denominador * f.numerador;
        frac.simplificar();
        return frac;
    }

    @Override
    public String toString() {
        return numerador +
                "/" + denominador;
    }
}
