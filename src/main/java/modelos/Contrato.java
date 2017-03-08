package modelos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the contrato database table.
 * 
 */
@Entity
@NamedQuery(name="Contrato.findAll", query="SELECT c FROM Contrato c")
public class Contrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String dniCont;

	private int base;

	private int bonus;

	private String departamento;

	@Temporal(TemporalType.DATE)
	private Date fechaInicio;

	//bi-directional one-to-one association to Empleado
	@OneToOne
	@JoinColumn(name="DniCont")
	private Empleado empleado;

	public Contrato() {
	}

	public String getDniCont() {
		return this.dniCont;
	}

	public void setDniCont(String dniCont) {
		this.dniCont = dniCont;
	}

	public int getBase() {
		return this.base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getBonus() {
		return this.bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

}