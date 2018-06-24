package com.arquitecturajava.jpa.bo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Clientes")

@NamedQuery(name="seleccionar.clientes", query="select c from Cliente c")
@NamedQuery(name="seleccionar.clientes.ordenados", query="select c from Cliente c order by c.nombre" )

@NamedNativeQuery(name="seleccionar.clientes.nativo",query="select * from Clientes")

@NamedEntityGraph(name="minigrafo1",attributeNodes= {
		@NamedAttributeNode("dni"),
		@NamedAttributeNode("nombre")
		
})



public class Cliente {
	
	@Id
	private String dni;
	private String nombre;
	private String apellidos;
	private int edad;
	private int telefono;
	@OneToMany(mappedBy="cliente")
	private List<Factura> listaFacturas= new ArrayList<Factura>();
	
	public List<Factura> getListaFacturas() {
		return listaFacturas;
	}


	public void setListaFacturas(List<Factura> listaFacturas) {
		this.listaFacturas = listaFacturas;
	}


	public Cliente(String dni, String nombre, String apellidos, int edad, int telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.telefono = telefono;
	}
	
	
	public Cliente(String dni) {
		super();
		this.dni = dni;
	}


	public Cliente() {
		super();
	}


	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
}
