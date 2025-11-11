package com.gm.rh.repositorio;

import com.gm.rh.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepo extends JpaRepository<Empleado, Long> {
}
