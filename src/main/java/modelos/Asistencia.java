package modelos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the asistencia database table.
 * 
 */
@Entity
@NamedQuery(name="Asistencia.findAll", query="SELECT a FROM Asistencia a")
public class Asistencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AsistenciaPK id;

	@Temporal(TemporalType.DATE)
	@Column(name="`Fecha Entrada`")
	private Date fecha_Entrada;

	@Temporal(TemporalType.DATE)
	@Column(name="`Fecha Salida`")
	private Date fecha_Salida;

	//bi-directional many-to-one association to Empleado
	@ManyToOne
	@JoinColumn(name="DniAsist")
	private Empleado empleado;

	public Asistencia() {
	}

	public AsistenciaPK getId() {
		return this.id;
	}

	public void setId(AsistenciaPK id) {
		this.id = id;
	}

	public Date getFecha_Entrada() {
		return this.fecha_Entrada;
	}

	public void setFecha_Entrada(Date fecha_Entrada) {
		this.fecha_Entrada = fecha_Entrada;
	}

	public Date getFecha_Salida() {
		return this.fecha_Salida;
	}

	public void setFecha_Salida(Date fecha_Salida) {
		this.fecha_Salida = fecha_Salida;
	}

	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

}