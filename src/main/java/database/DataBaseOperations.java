package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import modelos.Contrato;
import modelos.Empleado;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class DataBaseOperations implements Idatabase {
	public DataBaseOperations() {
		new DatabaseConexion();
		
	}

	

	public void addEmpleado(Empleado emp) {
		
		// TODO Auto-generated method stub
		
			
			
			 EntityManagerFactory emf = Persistence.createEntityManagerFactory("Empleado");
			 EntityManager em = emf.createEntityManager();
			 try {
			 em.getTransaction().begin();
			 em.persist(emp);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 
			 e.printStackTrace();
			 }finally {
			 em.close();
			 
			 }
			 
			 }

	



	public void updateEmpleado(Empleado emp) {
		// TODO Auto-generated method stub
		
	}



	public void deleteEmpleado(String dni) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Empleado");
		 EntityManager em = emf.createEntityManager();
		Empleado e=em.find( Empleado.class, dni );
	      em.remove( e );
	      em.getTransaction( ).commit( );
	      em.close( );
	      emf.close( );
	}



	public void addContrato(Contrato c) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Contrato");
		 EntityManager em = emf.createEntityManager();
		 try {
		 em.getTransaction().begin();
		 em.persist(c);
		 em.getTransaction().commit();
		 } catch (Exception e) {
		 
		 e.printStackTrace();
		 }finally {
		 em.close();
		 
		 }
		 
		 }
		
	

	public void updateContrato(Contrato c) {
		// TODO Auto-generated method stub
		
	}



	public void deleteContrato(String dni) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Contrato");
		 EntityManager em = emf.createEntityManager();
		Contrato c=em.find( Contrato.class, dni );
	      em.remove( c );
	      em.getTransaction( ).commit( );
	      em.close( );
	      emf.close( );
	}



	public Empleado consultarEmpleado(String dni) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "Empleado" );
	      EntityManager em = emf.createEntityManager();
	      
	      Empleado e = em.find( Empleado.class, dni );
	      em.close();
	      return e;
	 
	      
		
	}
	public Contrato consultarContrato(String dni) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory( "Contrato" );
	      EntityManager em = emf.createEntityManager();
	      
	      //Between
	      
	      Contrato c=em.find(Contrato.class, dni);
	      em.close();
	      return c;
		
	}



	public List<Empleado> getAllEmpleados() {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Empleado" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	      
	      //Between
	      Query query = entitymanager.createQuery( "Select e " + "from Empleado e " + "ORDER BY e.Dni ASC" );
	      List<Empleado> list=(List<Empleado>)query.getResultList();
	      return list;
	}



	public List<Empleado> getDptoEmpleados(String dpto) {
		// TODO Auto-generated method stub
		return null;
	}



	public List<Contrato> getAllContratos() {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Contrato" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	      
	      //Between
	      Query query = entitymanager.createQuery( "Select c " + "from Contrato c " + "ORDER BY c.dniCont ASC" );
	      List<Contrato> list=(List<Contrato>)query.getResultList();
	      return list;
	}



	public List<Contrato> getAllDuracion(String duracion) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "Contrato" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	      
	      //Between
	      Query query = entitymanager.createQuery( "Select c " + "from Contrato c " + "ORDER BY c.dniCont ASC" );
	      List<Contrato> list=(List<Contrato>)query.getResultList();
	      return list;
	}

}