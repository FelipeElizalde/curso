package org.curso.udemy.dao;

import org.curso.udemy.manejo.Conexion;
import org.curso.udemy.model.Contacto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContactoDAO {
    private static final String SQL_SELECT = "SELECT id_contacto, nombre, numero, email FROM contacto";

    public List<Contacto> findAll() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        Contacto contacto = null;
        List<Contacto> contactoList = new ArrayList<>();

        try {
            con = Conexion.getConnection();
            ps = con.prepareStatement(SQL_SELECT);
            rs = ps.executeQuery();

            while (rs.next()) {
                contacto = new Contacto();
                contacto.setIdContacto(rs.getInt("id_contacto"));
                contacto.setNombre(rs.getString("nombre"));
                contacto.setCelular(rs.getString("celular"));
                contacto.setEmail(rs.getString("email"));

                contactoList.add(contacto);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(ps);
                Conexion.close(con);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        return contactoList;
    }
}
