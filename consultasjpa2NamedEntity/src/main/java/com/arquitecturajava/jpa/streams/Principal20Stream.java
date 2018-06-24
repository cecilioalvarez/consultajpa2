//package com.arquitecturajava.jpa.streams;
//
//import java.util.stream.Stream;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//import javax.persistence.TypedQuery;
//
//import com.arquitecturajava.jpa.bo.Cliente;
//
//public class Principal20Stream {
//
//	public static void main(String[] args) {
//			
//
//		EntityManagerFactory emf;
//	
//		emf=Persistence.createEntityManagerFactory("jpa");
//		
//		EntityManager em= emf.createEntityManager();
//		TypedQuery<Cliente> consulta=em.createNamedQuery("seleccionar.clientes",Cliente.class);
//		
//		Stream<Cliente> miStream= consulta.getResultStream();
//		
//		
//		miStream.filter((c)->c.getNombre().startsWith("m")).map((c)->c.getApellidos()).forEach(System.out::println);
//
//		
//		em.close();
//		
//
//	}
//
//}
