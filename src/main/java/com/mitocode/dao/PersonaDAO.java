package com.mitocode.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mitocode.model.Persona;

public interface PersonaDAO extends JpaRepository <Persona, Integer> {//ay que pasar el modelo oar el que va a trabajar y el tipo de la clave primaria 

	
}
