package es.fjjt3.Hola.Spring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ControladorInicio {

    @GetMapping
    public String inicio(){
        log.info("ejecutando el controlador rest");
        log.debug("mas detalle del controlador");
        return "Hallo Welt mit Spring Boot";
    }
}
