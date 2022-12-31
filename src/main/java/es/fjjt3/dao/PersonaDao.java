package es.fjjt3.dao;
// this is an interface

import es.fjjt3.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
