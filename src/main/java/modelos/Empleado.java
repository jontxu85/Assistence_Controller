package modelos;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the empleado database table.
 * 
 */
@Entity
@NamedQuery(name="Empleado.findAll", query="SELECT e FROM Empleado e")
public class Empleado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String dni;

	private String apellidos;

	private String departamento;

	@Column(name="`e-mail`")
	private String e_mail;

	@Temporal(TemporalType.DATE)
	@Column(name="`Fecha Nacimiento`")
	private Date fecha_Nacimiento;

	private String nombre;

	private String password;

	private int telefono;

	//bi-directional many-to-one association to Asistencia
	@OneToMany(mappedBy="empleado")
	private List<Asistencia> asistencias;

	//bi-directional one-to-one association to Contrato
	@OneToOne(mappedBy="empleado")
	private Contrato contrato;

	//bi-directional many-to-one association to Jefe
	@OneToMany(mappedBy="empleado1")
	private List<Jefe> jefes1;

	//bi-directional many-to-one association to Jefe
	@OneToMany(mappedBy="empleado2")
	private List<Jefe> jefes2;

	public Empleado() {
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getApellidos() {
		return this.apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getE_mail() {
		return this.e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public Date getFecha_Nacimiento() {
		return this.fecha_Nacimiento;
	}

	public void setFecha_Nacimiento(Date fecha_Nacimiento) {
		this.fecha_Nacimiento = fecha_Nacimiento;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public List<Asistencia> getAsistencias() {
		return this.asistencias;
	}

	public void setAsistencias(List<Asistencia> asistencias) {
		this.asistencias = asistencias;
	}

	public Asistencia addAsistencia(Asistencia asistencia) {
		getAsistencias().add(asistencia);
		asistencia.setEmpleado(this);

		return asistencia;
	}

	public Asistencia removeAsistencia(Asistencia asistencia) {
		getAsistencias().remove(asistencia);
		asistencia.setEmpleado(null);

		return asistencia;
	}

	public Contrato getContrato() {
		return this.contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public List<Jefe> getJefes1() {
		return this.jefes1;
	}

	public void setJefes1(List<Jefe> jefes1) {
		this.jefes1 = jefes1;
	}

	public Jefe addJefes1(Jefe jefes1) {
		getJefes1().add(jefes1);
		jefes1.setEmpleado1(this);

		return jefes1;
	}

	public Jefe removeJefes1(Jefe jefes1) {
		getJefes1().remove(jefes1);
		jefes1.setEmpleado1(null);

		return jefes1;
	}

	public List<Jefe> getJefes2() {
		return this.jefes2;
	}

	public void setJefes2(List<Jefe> jefes2) {
		this.jefes2 = jefes2;
	}

	public Jefe addJefes2(Jefe jefes2) {
		getJefes2().add(jefes2);
		jefes2.setEmpleado2(this);

		return jefes2;
	}

	public Jefe removeJefes2(Jefe jefes2) {
		getJefes2().remove(jefes2);
		jefes2.setEmpleado2(null);

		return jefes2;
	}

}