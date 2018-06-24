package com.arquitecturajava.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.arquitecturajava.jpa.bo.Cliente;

public class Principal001NamedQueries {

	public static void main(String[] args) {
			

		EntityManagerFactory emf;
	
		emf=Persistence.createEntityManagerFactory("jpa");
		
		EntityManager em= emf.createEntityManager();
		TypedQuery<Cliente> consulta=em.createNamedQuery("seleccionar.clientes",Cliente.class);
		
		List<Cliente> lista= consulta.getResultList();
		
		for(Cliente c:lista) {
			
			System.out.printf(" %s %s %s %s %n",c.getDni(),c.getNombre(),c.getApellidos(),c.getEdad());
		

		}
		
		System.out.println("************************");
		
		
		
		TypedQuery<Cliente> consulta2=em.createNamedQuery("seleccionar.clientes.ordenados",Cliente.class);
		
		List<Cliente> lista2= consulta.getResultList();
		
		for(Cliente c:lista2) {
			
			System.out.printf(" %s %s %s %s %n",c.getDni(),c.getNombre(),c.getApellidos(),c.getEdad());
		

		}
		
		em.close();
		

	}

}
