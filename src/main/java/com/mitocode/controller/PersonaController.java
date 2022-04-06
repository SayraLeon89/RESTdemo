package com.mitocode.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mitocode.model.Persona;
import com.mitocode.service.PersonaService;

@RequestMapping("/personas")
@RestController //RestController porque se va a crear un servicio rest
public class PersonaController { //esta clase la va a gestionar spring pero se necesita acceder a la capa Service

	@Autowired
	private PersonaService service;
	
		@GetMapping // expone el recurso en una petición get
		//operaciones del REST 
		
		public List <Persona>listar() {
			return service.listar();
		}
		
		@GetMapping(value = "/{id}") //localhost:9098/personas/1
		public  Persona listarPorId(@PathVariable("id")Integer id) { 
			return service.listarPorId(id);
		}
		
		@PostMapping (consumes="application/json", produces="application/json")
		public Persona register(@RequestBody Persona per) { //@RequestBody permite la transformación de json a objeto llava y veceversa
			return service.crear(per);
		}
		
		@PutMapping (consumes="application/json", produces="application/json")
		public Persona modificar(@RequestBody Persona per) { //@RequestBody permite la transformación de json a objeto llava y veceversa
			return service.modificar(per);
		}
		
		@DeleteMapping(value = "/{id}") 
		public  void eliminar (@PathVariable("id")Integer id) { 
			service.eliminar(id);
		}
}
