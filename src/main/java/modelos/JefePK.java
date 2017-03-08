package modelos;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the jefe database table.
 * 
 */
@Embeddable
public class JefePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String jefeDni;

	@Column(insertable=false, updatable=false)
	private String empleadoDni;

	public JefePK() {
	}
	public String getJefeDni() {
		return this.jefeDni;
	}
	public void setJefeDni(String jefeDni) {
		this.jefeDni = jefeDni;
	}
	public String getEmpleadoDni() {
		return this.empleadoDni;
	}
	public void setEmpleadoDni(String empleadoDni) {
		this.empleadoDni = empleadoDni;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof JefePK)) {
			return false;
		}
		JefePK castOther = (JefePK)other;
		return 
			this.jefeDni.equals(castOther.jefeDni)
			&& this.empleadoDni.equals(castOther.empleadoDni);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.jefeDni.hashCode();
		hash = hash * prime + this.empleadoDni.hashCode();
		
		return hash;
	}
}