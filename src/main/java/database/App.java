package database;

import modelos.Empleado;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataBaseOperations op=new DataBaseOperations();
		Empleado e=op.consultarEmpleado("12345678f");
		System.out.println(e.getDni());
	}

}
