package models;
// Generated 13-ene-2017 13:34:48 by Hibernate Tools 4.3.1.Final

/**
 * Lleva generated by hbm2java
 */
public class Lleva implements java.io.Serializable {

	private LlevaId id;
	private Ciclista ciclista;
	private Etapa etapa;
	private Maillot maillot;

	public Lleva() {
	}

	public Lleva(LlevaId id, Ciclista ciclista, Etapa etapa, Maillot maillot) {
		this.id = id;
		this.ciclista = ciclista;
		this.etapa = etapa;
		this.maillot = maillot;
	}

	public LlevaId getId() {
		return this.id;
	}

	public void setId(LlevaId id) {
		this.id = id;
	}

	public Ciclista getCiclista() {
		return this.ciclista;
	}

	public void setCiclista(Ciclista ciclista) {
		this.ciclista = ciclista;
	}

	public Etapa getEtapa() {
		return this.etapa;
	}

	public void setEtapa(Etapa etapa) {
		this.etapa = etapa;
	}

	public Maillot getMaillot() {
		return this.maillot;
	}

	public void setMaillot(Maillot maillot) {
		this.maillot = maillot;
	}

}
