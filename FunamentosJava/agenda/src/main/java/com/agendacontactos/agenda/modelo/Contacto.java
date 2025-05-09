package com.agendacontactos.agenda.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity //Clase de tipo entidad
@Data //Se genera automáticamente los métodos get y set de los argumentos que metamos
//@NoArgsConstructor //Agrega el constructor vacio
@AllArgsConstructor //Agrega el constructor con todos los argumentos (Variables)
@ToString //Agrega el metodo toString
@RequiredArgsConstructor
public class Contacto {

    @Id //Notacion que indica que es un id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Aplicamos la estrategia de la generación de este dato
    Integer idContacto;

    String nombre;
    String celular;
    String email;
}
