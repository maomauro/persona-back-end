package com.persona.back.end.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persona.back.end.model.Persona;
import com.persona.back.end.service.PersonaService;


@RestController
@RequestMapping(path = "api/persona")
public class PersonaRest {
	@Autowired
	private PersonaService personaService;

	@GetMapping
	public List<Persona> getAll(){
		return personaService.getPersonas();
	}

	@GetMapping("/{personaId}")
	public Optional<Persona> getById(@PathVariable("personaId") Long personaId){
		return personaService.getPersona(personaId);
	}

	@PostMapping
	public Persona saveOrUpdate(@RequestBody Persona persona){
		personaService.saveOrUpdate(persona);
		return persona;
	}
	
	@DeleteMapping("/{personaId}")
	public void delete(@PathVariable("personaId") Long personaId){
		personaService.delete(personaId);
	}
	
}
