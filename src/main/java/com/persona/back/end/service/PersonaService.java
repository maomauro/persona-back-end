package com.persona.back.end.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persona.back.end.model.Persona;
import com.persona.back.end.repository.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaRepository personaRepository;
	
	public List<Persona> getPersonas(){
		return personaRepository.findAll();
	}

	public Optional<Persona> getPersona(Long id){
		return personaRepository.findById(id);
	}
	
	public void saveOrUpdate(Persona persona) {
		personaRepository.save(persona);		
	}
	
	public void delete(Long id) {
		personaRepository.deleteById(id);		
	}
	
}
