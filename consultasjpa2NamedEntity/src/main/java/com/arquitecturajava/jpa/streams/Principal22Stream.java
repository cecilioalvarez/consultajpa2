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
//public class Principal22Stream {
//
//	public static void main(String[] args) {
//			
//
//		EntityManagerFactory emf;
//	
//		emf=Persistence.createEntityManagerFactory("jpa");
//		
//		EntityManager em= emf.createEntityManager();
//		TypedQuery<Cliente> consulta=em.createQuery("select c from Cliente c",Cliente.class);
//		
//		Stream<Cliente> miStream= consulta.getResultStream();
//		
//		
//		miStream.parallel().sorted((c1,c2)->c1.getApellidos().compareTo(c2.getApellidos())).forEach((c)-> {
//			
//			System.out.printf(" %s %s %s %s %n", c.getDni(), c.getNombre(), c.getApellidos(), c.getEdad());
//
//		});
//
//		
//		em.close();
//		
//
//	}
//
//}
