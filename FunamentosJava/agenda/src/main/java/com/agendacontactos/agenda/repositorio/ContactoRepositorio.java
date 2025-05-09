package com.agendacontactos.agenda.repositorio;

import com.agendacontactos.agenda.modelo.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepositorio extends JpaRepository<Contacto, Integer> {


}
