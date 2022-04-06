package com.mitocode.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mitocode.dao.PersonaDAO;
import com.mitocode.model.Persona;

@Service
public class PersonaImpl implements PersonaService{

	@Autowired /*@Autowired es una instancia para realizar la inyección
		Spring busca una instancia para PersonaDAO desde el CC*/
private PersonaDAO dao;
	
	@Override
	public List<Persona> listar() {
		return dao.findAll();
	}

	@Override
	public Persona crear(Persona per) {
		return dao.save(per);
	}

	@Override
	public Persona modificar(Persona per) {
		return dao.save(per);
	}

	@Override
	public void eliminar(Integer id) {
		dao.deleteById(id);
	}

	@Override
	public Persona listarPorId(Integer id) {
		return dao.findById(id).get();
	}
	
	

	/*@Override // cuanso se 	implementa el método aparece el @override
	public String saludar() {
		
		return dao.saludar();
	}*/

	
	
}
