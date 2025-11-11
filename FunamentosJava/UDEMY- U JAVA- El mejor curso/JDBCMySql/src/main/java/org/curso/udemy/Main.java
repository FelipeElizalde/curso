package org.curso.udemy;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Conectando a MySQL 8");

        String url = "jdbc:mysql://localhost:3306/contactos_db?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        //Especificamos la clase con la que vamos a estar trabajando, utilizado principalmente en aplicaaciones web en local no tedria porque haber problema, de lo contrario se puede poner
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Creamos la conexión
            Connection conexion = DriverManager.getConnection(url, "root", "Server2025.");
            //Objeto que permite ejecutar sentencias sobre nuestras tablas en BD
            Statement instruccion = conexion.createStatement();
            //Creamos la query a ejecutar
            var sql = "SELECT id_contacto, nombre, email, celular FROM contacto";
            //ejecutamos la instrucción y guardamos el resultado en el ResultSet
            ResultSet resultado = instruccion.executeQuery(sql);

            //Procesamos la variable de resultado, Iteramos el resultado ya que puede traer mas de un resultado
            while (resultado.next()) {
                System.out.println("id Persona: " + resultado.getInt("id_contacto"));
                System.out.println("nombre: " + resultado.getString("nombre"));
                System.out.println("email: " + resultado.getString("email"));
                System.out.println("celular: " + resultado.getString("celular"));
            }

            resultado.close();
            instruccion.close();
            conexion.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
            throw new RuntimeException(e);
        }


    }
}