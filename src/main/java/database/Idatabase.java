package database;

import java.util.List;

import modelos.Contrato;
import modelos.Empleado;



public interface Idatabase {
	//metodos para empleado
		public void addEmpleado(Empleado emp);
		public void updateEmpleado(String dni);
		public void deleteEmpleado(String dni);
		
		
		//metodos para contrato
		public void addContrato(Contrato c);
		public void updateContrato(String dni);
		public void deleteContrato(String dni);
		
		//metodos consultas
		public Empleado consultarEmpleado(String dni);
		public Contrato consultarContrato(String dni);
		public List<Empleado> getAllEmpleados();
		public List<Empleado> getDptoEmpleados(String dpto);
		public List<Contrato> getAllContratos();
		public List<Contrato> getAllDuracion(String duracion);
}
