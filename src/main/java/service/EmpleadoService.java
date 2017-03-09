package service;

import database.DataBaseOperations;

public class EmpleadoService {
	
	DataBaseOperations dbo= new DataBaseOperations();
	
	public boolean hacerLogin(String dni, String pass){
		boolean logueado= dbo.hacerLogin(dni,pass);
		
		return logueado;
		
	}

}
