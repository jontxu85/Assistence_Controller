package modelos;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the asistencia database table.
 * 
 */
@Embeddable
public class AsistenciaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int idAsistencia;

	@Column(insertable=false, updatable=false)
	private String dniAsist;

	public AsistenciaPK() {
	}
	public int getIdAsistencia() {
		return this.idAsistencia;
	}
	public void setIdAsistencia(int idAsistencia) {
		this.idAsistencia = idAsistencia;
	}
	public String getDniAsist() {
		return this.dniAsist;
	}
	public void setDniAsist(String dniAsist) {
		this.dniAsist = dniAsist;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AsistenciaPK)) {
			return false;
		}
		AsistenciaPK castOther = (AsistenciaPK)other;
		return 
			(this.idAsistencia == castOther.idAsistencia)
			&& this.dniAsist.equals(castOther.dniAsist);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idAsistencia;
		hash = hash * prime + this.dniAsist.hashCode();
		
		return hash;
	}
}