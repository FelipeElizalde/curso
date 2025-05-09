package com.agendacontactos.agenda.controlador;

import com.agendacontactos.agenda.modelo.Contacto;
import com.agendacontactos.agenda.servicio.ContactoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ContactoControlador {

    private static final Logger logger = LoggerFactory.getLogger(ContactoControlador.class);

    @Autowired private ContactoServicio contactoServicio;

    @GetMapping("/")
    public String iniciar(ModelMap model){
        //Este metodo nos va a procesar la peticion y vamos a recibir un objeto que será el modelo
        List<Contacto> contactos = contactoServicio.listarContactos();

        //Mandamos a imprimir en consola cada contacto
        contactos.forEach((contacto) -> logger.info(contacto.toString()));

        model.put("contactos", contactos);
        return "index";
    }

    @GetMapping("/agregar")
    public String mostrarAgregar(){
        return "agregar";
    }

    @PostMapping("/agregar")
    public String agregar(@ModelAttribute("contactoForm") Contacto contacto){
        logger.info("Contacto a agregar: " + contacto);
        contactoServicio.guardarContacto(contacto);
        return "redirect:/"; //Redirigimos al path "/"
    }

    @GetMapping("/editar/{id}")
    public String mostrarEditar(ModelMap modelo, @PathVariable(value = "id") int idContacto){
        Contacto contacto = contactoServicio.buscarContactoById(idContacto);
        logger.info("Contacto a editar" + contacto);

        modelo.put("contacto", contacto);

        return "editar";
    }

    @PostMapping("/editar")
    public String editar(@ModelAttribute("contacto") Contacto contacto){
        logger.info("Contacto a actualizar: " + contacto);
        contactoServicio.guardarContacto(contacto);
        return "redirect:/"; //Redirigimos al path "/"
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") int idContacto){
        logger.info("Contacto a actualizar: " + idContacto);
        Contacto contacto = contactoServicio.buscarContactoById(idContacto);
        contactoServicio.eliminarContacto(contacto);
        return "redirect:/"; //Redirigimos al path "/"
    }

    /*
        Integración con VUE
     */
    @GetMapping("/vue")
    public String iniciarVue(Model model){
        //Este metodo nos va a procesar la peticion y vamos a recibir un objeto que será el modelo
        List<Contacto> contactos = contactoServicio.listarContactos();

        //Mandamos a imprimir en consola cada contacto
        contactos.forEach((contacto) -> logger.info(contacto.toString()));

        model.addAttribute("contactos", contactos);
        model.addAttribute("message", "Hola mundo desde Java");
        return "index_vue";
    }

    @GetMapping("/vue_thym")
    public String iniciarVueThym(Model model){
        //Este metodo nos va a procesar la peticion y vamos a recibir un objeto que será el modelo
        List<Contacto> contactos = contactoServicio.listarContactos();

        //Mandamos a imprimir en consola cada contacto
        contactos.forEach((contacto) -> logger.info(contacto.toString()));

        model.addAttribute("todos", contactos);
        model.addAttribute("message", "Hola mundo desde Java y vue");
        return "index_vue_tymeleaf";
    }

    @RequestMapping(value = "/new_vue", method = RequestMethod.GET)
    public String index(Model model) {
        // this attribute will be available in the view index.html as a thymeleaf variable
        model.addAttribute("eventName", "FIFA 2018");
        // this just means render index.html from static/ area
        return "index_vue_3";
    }
}
