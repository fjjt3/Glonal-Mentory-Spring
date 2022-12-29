package es.fjjt3.Hola.Spring;

import es.fjjt3.domain.Persona;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;


@Controller
@Slf4j
public class ControladorInicio {
    @Value("${index.saludo}")
    private String saludo;
    @GetMapping("/")
    public String inicio(Model model){
        var mensaje = "Mensaje con Thymeleaf";

        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@mail.com");
        persona.setTelefono("33333333");

        var persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Gómez");
        persona2.setEmail("kgomez@mail.com");
        persona2.setTelefono("13333333");

        var personas = Arrays.asList(persona, persona2);
        // var personas = new ArrayList();

        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("mensaje",mensaje);
        model.addAttribute("saludo", saludo);
        //model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }
}
