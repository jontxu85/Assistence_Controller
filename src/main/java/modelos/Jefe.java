package modelos;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the jefe database table.
 * 
 */
@Entity
@NamedQuery(name="Jefe.findAll", query="SELECT j FROM Jefe j")
public class Jefe implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private JefePK id;

	private String departamento;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="JefeDni")
	private Empleado empleado1;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="EmpleadoDni")
	private Empleado empleado2;

	public Jefe() {
	}

	public JefePK getId() {
		return this.id;
	}

	public void setId(JefePK id) {
		this.id = id;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Empleado getEmpleado1() {
		return this.empleado1;
	}

	public void setEmpleado1(Empleado empleado1) {
		this.empleado1 = empleado1;
	}

	public Empleado getEmpleado2() {
		return this.empleado2;
	}

	public void setEmpleado2(Empleado empleado2) {
		this.empleado2 = empleado2;
	}

}