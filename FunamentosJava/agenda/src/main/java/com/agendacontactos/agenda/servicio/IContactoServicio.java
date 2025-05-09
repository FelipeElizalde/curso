package com.agendacontactos.agenda.servicio;

import com.agendacontactos.agenda.modelo.Contacto;

import java.util.List;

public interface IContactoServicio {

    public List<Contacto> listarContactos();

    public Contacto buscarContactoById(Integer idContacto);

    //Guarda o actualiza depende si el ID viene o no vacio
    public void guardarContacto(Contacto contacto);

    public void eliminarContacto(Contacto contacto);
}
