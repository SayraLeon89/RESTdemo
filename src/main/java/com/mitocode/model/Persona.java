package com.mitocode.model;

//import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//abstracción de independencia de código//
@Entity // representa una entidad de java que representa una tabla de la base de datos
@Table (name = "persona")
public class Persona {
	
	@Id //es una llave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //Se genera automáticamente la clave
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "edad")
	private int edad;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
