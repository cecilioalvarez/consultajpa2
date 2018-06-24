package com.arquitecturajava.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import com.arquitecturajava.jpa.bo.Cliente;

public class Principal010Graph {

	public static void main(String[] args) {
			

		EntityManagerFactory emf;
	
		emf=Persistence.createEntityManagerFactory("jpa");
		
		EntityManager em= emf.createEntityManager();
		TypedQuery<Cliente> consulta=em.createQuery("select c from Cliente c",Cliente.class);
		consulta.setHint("javax.persistence.fetchgraph", em.getEntityGraph("minigrafo1"));
		List<Cliente> lista= consulta.getResultList();
		
		for(Cliente c:lista) {
			
			System.out.printf(" %s %s %n",c.getDni(),c.getNombre());
		

		}
		
		
		em.close();
		

	}

}
