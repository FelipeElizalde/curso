package ej4Lbro;

public class Libro {
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int ejemplaresPrestados;

    public Libro(){

    }

    public Libro(String titulo, String autor, int numeroEjemplares, int ejemplaresPrestados){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.ejemplaresPrestados = ejemplaresPrestados;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getEjemplaresPrestados() {
        return ejemplaresPrestados;
    }

    public void setEjemplaresPrestados(int ejemplaresPrestados) {
        this.ejemplaresPrestados = ejemplaresPrestados;
    }

    public boolean Prestamo(){
        this.ejemplaresPrestados++;
        this.numeroEjemplares--;
        if (numeroEjemplares<=0){
            return true;
        }else{
            return false;
        }
    }

    public boolean Devolucion(){
        this.numeroEjemplares++;
        this.ejemplaresPrestados--;
        if (ejemplaresPrestados<=0){
            return true;
        }else
            return false;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroEjemplares=" + numeroEjemplares +
                ", ejemplaresPrestados=" + ejemplaresPrestados +
                '}';
    }

    public void Prestar( boolean o, String a){
        if (true == o) {
            System.out.println("Se ha prestado el libro " + a );
        } else {
            System.out.println("No quedan ejemplares del libro " + a + " para prestar");
        }
    }

    public void Devolver(boolean libro, String titulo){
        if (true == libro) {
            System.out.println("Se ha devuelto el libro " + titulo);
        } else {
            System.out.println("No hay ejemplares del libro " + titulo + " prestados");
        }
    }
}
