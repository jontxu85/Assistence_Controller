package service;

import database.DataBaseOperations;

public class EmpleadoService {
	
	DataBaseOperations dbo= new DataBaseOperations();
	
	public String hacerLogin(String dni, String pass){
		String logueado= dbo.hacerLogin(dni,pass);
		
		return logueado;
		
	}

}
