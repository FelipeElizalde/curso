package org.curso.udemy.model;

public class Contacto {
    private int idContacto;
    private String nombre;
    private String email;
    private String celular;

    public Contacto() {

    }

    public Contacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public Contacto(String nombre, String email, String celular) {
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
    }

    public Contacto(int idContacto, String nombre, String email, String celular) {
        this.idContacto = idContacto;
        this.nombre = nombre;
        this.email = email;
        this.celular = celular;
    }

    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "idContacto=" + idContacto +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                '}';
    }
}
