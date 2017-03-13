package database;


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
		
			
			
			 EntityManagerFactory emf = Persistence.createEntityManagerFactory("enterpriseManager");
			 EntityManager em = emf.createEntityManager();
			 try {
			 em.getTransaction().begin();
			 em.persist(emp);
			 em.getTransaction().commit();
			 } catch (Exception e) {
			 
			 e.printStackTrace();
			 }finally {
			 em.close();
			 emf.close();
			 }
			 
			 }

	



	public void updatePassword(String dni,String password) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("enterpriseManager");
		 EntityManager em = emf.createEntityManager();
		 em.getTransaction().begin();
		Empleado e=em.find( Empleado.class, dni );
		 //before update
	      System.out.println( e);
	      e.setPassword(password);
	      em.getTransaction( ).commit( );
	      
	      //after update
	      System.out.println( e );
	      em.close();
	      emf.close();
	}



	public void deleteEmpleado(String dni) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("enterpriseManager");
		 EntityManager em = emf.createEntityManager();
		Empleado e=em.find( Empleado.class, dni );
	      em.remove( e );
	      em.getTransaction( ).commit( );
	      em.close( );
	      emf.close( );
	}



	public void addContrato(Contrato c) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("enterpriseManager");
		 EntityManager em = emf.createEntityManager();
		 try {
		 em.getTransaction().begin();
		 em.persist(c);
		 em.getTransaction().commit();
		 } catch (Exception e) {
		 
		 e.printStackTrace();
		 }finally {
		 em.close();
		 emf.close();
		 }
		 
		 }
		
	

	public void updateContrato(Contrato c2,String dni) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("enterpriseManager");
		 EntityManager em = emf.createEntityManager();
		 em.getTransaction().begin();
		 Contrato c=consultarContrato(dni);
		 
		 //before update
	      
	      c.setBase(c2.getBase());
	      c.setBonus(c2.getBonus());
	      c.setFechaIncio(c2.getFechaIncio());
	      
	      em.getTransaction( ).commit( );
	      
	      //after update
	      System.out.println( c2 );
	      em.close();
	      emf.close();
	}



	public void deleteContrato(String dni) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("enterpriseManager");
		 EntityManager em = emf.createEntityManager();
		Contrato c=em.find( Contrato.class, dni );
	      em.remove( c );
	      em.getTransaction( ).commit( );
	      em.close( );
	      emf.close( );
	}



	public Empleado consultarEmpleado(String dni) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "enterpriseManager" );
	      EntityManager em = emf.createEntityManager();
	      
	      Empleado e = em.find( Empleado.class, dni );
	      em.close();
	      emf.close();
	      return e;
	 
	      
		
	}
	public Contrato consultarContrato(String dni) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf= Persistence.createEntityManagerFactory( "enterpriseManager" );
	      EntityManager em = emf.createEntityManager();
	      
	      //Between
	      
	      Contrato c=em.find(Contrato.class, dni);
	      em.close();
	      emf.close();
	      return c;
		
	}



	public List<Empleado> getAllEmpleados() {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory( "enterpriseManager" );
	      EntityManager em = emf.createEntityManager();
	      
	      //Between
	      Query query = em.createQuery( "Select e " + "from Empleado e " + "ORDER BY e.Dni ASC" );
	      List<Empleado> list=(List<Empleado>)query.getResultList();
	      em.close();
	      emf.close();
	      return list;
	}



	public List<Empleado> getDptoEmpleados(String dpto) {
		// TODO Auto-generated method stub
		return null;
	}



	public List<Contrato> getAllContratos() {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "enterpriseManager" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	      
	      //Between
	      Query query = entitymanager.createQuery( "Select c " + "from Contrato c " + "ORDER BY c.dniCont ASC" );
	      List<Contrato> list=(List<Contrato>)query.getResultList();
	      return list;
	}



	public List<Contrato> getAllDuracion(String duracion) {
		// TODO Auto-generated method stub
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "enterpriseManager" );
	      EntityManager entitymanager = emfactory.createEntityManager();
	      
	      //Between
	      Query query = entitymanager.createQuery( "Select c " + "from Contrato c " + "ORDER BY c.dniCont ASC" );
	      List<Contrato> list=(List<Contrato>)query.getResultList();
	      return list;
	}

}