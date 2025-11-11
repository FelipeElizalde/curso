package com.gm.rh.servicio;

import com.gm.rh.modelo.Empleado;
import com.gm.rh.repositorio.EmpleadoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServicio implements IEmpleadoServicio {

    @Autowired
    private EmpleadoRepo empleadoRepo;

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepo.findAll();
    }

    @Override
    public Empleado buscarEmpleadoPorId(Long idEmpleado) {
        return empleadoRepo.findById(idEmpleado).orElse(null);
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {

        return empleadoRepo.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleadoRepo.delete(empleado);
    }
}
