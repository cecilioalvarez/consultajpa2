package com.arquitecturajava.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.arquitecturajava.jpa.bo.Cliente;

public class Principal002NativeQuery {

	public static void main(String[] args) {
			

		EntityManagerFactory emf;
	
		emf=Persistence.createEntityManagerFactory("jpa");
		
		EntityManager em= emf.createEntityManager();
		Query consulta=em.createNativeQuery("select * from Clientes",Cliente.class);
		
		List<Cliente> lista= consulta.getResultList();
		
		for(Cliente c:lista) {
			
			System.out.printf(" %s %s %s %s %n",c.getDni(),c.getNombre(),c.getApellidos(),c.getEdad());
		

		}
		
		
		
		Query consulta2=em.createNamedQuery("seleccionar.clientes.nativo", Cliente.class);
		
		List<Cliente> lista2= consulta2.getResultList();
		
		for(Cliente c:lista) {
			
			System.out.printf(" %s %s %s %s %n",c.getDni(),c.getNombre(),c.getApellidos(),c.getEdad());
		

		}
	
		em.close();
		

	}

}
