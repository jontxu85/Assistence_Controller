package database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import modelos.Contrato;
import modelos.Empleado;



public class DataBaseOperations implements Idatabase {
	private DatabaseConexion op;
	private Connection con;
	
	public DataBaseOperations() {
		op=new DatabaseConexion();
		
	}

	

	public void addEmpleado(Empleado emp) {
		
		// TODO Auto-generated method stub
		
			con= op.getConexion();
			Statement st;
			try {
				st = con.createStatement();
				String Query = "INSERT INTO  empleado (Nombre,Apellidos,Dni,Telefono,e-mail,Fecha Nacimiento,password,departamento)"
						+ " VALUES (emp.getElementById("Nombre"),emp.getElementById("Apellidos"),emp.getElementById("Dni"),"
								+ "emp.getElementById("Telefono"),emp.getElementById("e-mail"),emp.getElementById("Fecha Nacimiento"),"
								+ "emp.getElementById("password"),emp.getElementById("departamento")) ";
                
		         st.executeUpdate(Query);
		         con.close();
		        
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            

	}

	public void updateEmpleado(String dni) {
		// TODO Auto-generated method stub

	}

	public void deleteEmpleado(String dni) {
		// TODO Auto-generated method stub

	}

	public void addContrato(Contrato c) {
		// TODO Auto-generated method stub

	}

	public void updateContrato(String dni) {
		// TODO Auto-generated method stub

	}

	public void deleteContrato(String dni) {
		// TODO Auto-generated method stub

	}

	public Empleado consultarEmpleado(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	public Contrato consultarContrato(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Empleado> getAllEmpleados() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Empleado> getDptoEmpleados(String dpto) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contrato> getAllContratos() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Contrato> getAllDuracion(String duracion) {
		// TODO Auto-generated method stub
		return null;
	}

}


