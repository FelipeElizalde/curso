package com.gm.rh.controlador;

import com.gm.rh.excepcion.RecursoNoEncontradoExcepcion;
import com.gm.rh.modelo.Empleado;
import com.gm.rh.servicio.EmpleadoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
//http://localhost:8080/rh-app/url
@RequestMapping("rh-app")//Implementación de la URL a nivel de clase
@CrossOrigin(value = "http://localhost:3000")
//Vamos a hacer peticiones desde nuestro front-end, para que spring pueda recibirpeticiones desde otro puerto
public class EmpleadoControlador {

    private static final Logger logger = LoggerFactory.getLogger(EmpleadoControlador.class);

    @Autowired
    private EmpleadoServicio empleadoServicio;

    //http://localhost:8080/rh-app/empleados
    @GetMapping("/empleados")
    public List<Empleado> obtnerEmpleados() {
        var empleados = empleadoServicio.listarEmpleados();

        empleados.forEach((empleado -> logger.info(empleado.toString())));

        return empleados;
    }

    @PostMapping("/empleados")
    public Empleado agregarEmpleado(@RequestBody Empleado empleado) {
        logger.info("Empleado a agregar: " + empleado);
        return empleadoServicio.guardarEmpleado(empleado);
    }

    @GetMapping("/empleados/{id}")
    public ResponseEntity<Empleado> obtenerEmpleado(@PathVariable Long id) {
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);

        if (empleado == null) {
            throw new RecursoNoEncontradoExcepcion("No se Encontro el id: " + id);
        }
        return ResponseEntity.ok(empleado);
    }

    @PutMapping("/empleados/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Long id,
                                                       @RequestBody Empleado empleadoRecibido) {
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if (empleado == null)throw  new RecursoNoEncontradoExcepcion("El id recibido no existe: " + id);

        empleado.setNombre(empleadoRecibido.getNombre());
        empleado.setDepartamento(empleadoRecibido.getDepartamento());
        empleado.setSueldo(empleadoRecibido.getSueldo());

        empleadoServicio.guardarEmpleado(empleado);

        return ResponseEntity.ok(empleado);
    }

    @DeleteMapping("/empleados/{id}")
    public ResponseEntity<Map<String, Boolean>>eliminarEmpleado(@PathVariable Long id){
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);

        if(empleado == null){
            throw new RecursoNoEncontradoExcepcion("El id recibido no existe: " + id);
        }
        empleadoServicio.eliminarEmpleado(empleado);

        //Respuesta JSON {"eliminado": true}

        Map<String , Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminado", true);

        return ResponseEntity.ok(respuesta);

    }
}
