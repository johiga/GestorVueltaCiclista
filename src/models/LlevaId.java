package models;
// Generated 13-ene-2017 13:34:48 by Hibernate Tools 4.3.1.Final

/**
 * LlevaId generated by hbm2java
 */
public class LlevaId implements java.io.Serializable {

	private int numetapa;
	private String codigo;

	public LlevaId() {
	}

	public LlevaId(int numetapa, String codigo) {
		this.numetapa = numetapa;
		this.codigo = codigo;
	}

	public int getNumetapa() {
		return this.numetapa;
	}

	public void setNumetapa(int numetapa) {
		this.numetapa = numetapa;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof LlevaId))
			return false;
		LlevaId castOther = (LlevaId) other;

		return (this.getNumetapa() == castOther.getNumetapa())
				&& ((this.getCodigo() == castOther.getCodigo()) || (this.getCodigo() != null
						&& castOther.getCodigo() != null && this.getCodigo().equals(castOther.getCodigo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNumetapa();
		result = 37 * result + (getCodigo() == null ? 0 : this.getCodigo().hashCode());
		return result;
	}

}