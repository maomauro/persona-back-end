package com.persona.back.end.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persona.back.end.model.Persona;
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
