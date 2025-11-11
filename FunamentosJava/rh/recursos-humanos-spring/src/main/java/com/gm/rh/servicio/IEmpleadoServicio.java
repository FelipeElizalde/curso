package com.gm.rh.servicio;

import com.gm.rh.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {

    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPorId(Long idEmpleado);

    public Empleado guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);
}
