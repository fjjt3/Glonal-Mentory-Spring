package es.fjjt3.web;

import es.fjjt3.servicio.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
@Slf4j
public class ControladorInicio {

    @Autowired // brings interface PersonaDao
    private PersonaService personaService;
    @GetMapping("/")
    public String inicio(Model model){
        var personas = personaService.listarPersonas();

        log.info("ejecutando el controlador Spring MVC");
        model.addAttribute("personas", personas);
        return "index";
    }
}
