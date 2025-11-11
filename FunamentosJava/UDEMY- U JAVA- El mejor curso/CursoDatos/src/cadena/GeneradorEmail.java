package cadena;

import java.nio.Buffer;

public class GeneradorEmail
{
    public static void main(String[] args) {
        //Generador de emails
        var nombre = "Felipe de Jesus Mata Elizalde";
        var nombreEmpresa = "udemy";
        var extensionDominio = ".com.mx";

        var nombreUsuario = nombre.replace(" ", ".").toLowerCase();
        System.out.println("nombreUsuario = " + nombreUsuario);

        var emailNormalizaldo = new StringBuilder().append("@").append(nombreEmpresa).append(extensionDominio);
        System.out.println("emailNormalizaldo = " + emailNormalizaldo.toString());

        var emailFinal = new StringBuffer().append(nombreUsuario).append(emailNormalizaldo);
        System.out.println("emailFinal = " + emailFinal);

    }
}
