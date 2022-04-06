package com.mitocode.service;

import java.util.List;

import com.mitocode.model.Persona;

public interface PersonaService { //creación de crud
	List<Persona> listar();
	Persona listarPorId(Integer id);
	Persona crear (Persona per);
	Persona modificar(Persona per);
	void eliminar(Integer id);

}
