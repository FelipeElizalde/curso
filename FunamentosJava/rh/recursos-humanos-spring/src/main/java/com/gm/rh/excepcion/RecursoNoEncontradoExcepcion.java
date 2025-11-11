package com.gm.rh.excepcion;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RecursoNoEncontradoExcepcion extends RuntimeException{
    public RecursoNoEncontradoExcepcion(String mensaje){
        super(mensaje);//Llamamos el constructor de la clase padre y le mandamos el mensaje
    }
}
