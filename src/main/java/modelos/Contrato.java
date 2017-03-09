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
	@Column(name="id_contrato")
	private int idContrato;

	private int base;

	private int bonus;

	@Temporal(TemporalType.DATE)
	private Date fechaIncio;

	public Contrato() {
	}

	public int getIdContrato() {
		return this.idContrato;
	}

	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
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

	public Date getFechaIncio() {
		return this.fechaIncio;
	}

	public void setFechaIncio(Date fechaIncio) {
		this.fechaIncio = fechaIncio;
	}

}