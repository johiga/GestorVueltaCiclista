package models;
// Generated 13-ene-2017 13:34:48 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Equipo generated by hbm2java
 */
public class Equipo implements java.io.Serializable {

	private String nomequipo;
	private String director;
	private Set ciclistas = new HashSet(0);

	public Equipo() {
	}

	public Equipo(String nomequipo) {
		this.nomequipo = nomequipo;
	}

	public Equipo(String nomequipo, String director, Set ciclistas) {
		this.nomequipo = nomequipo;
		this.director = director;
		this.ciclistas = ciclistas;
	}

	public String getNomequipo() {
		return this.nomequipo;
	}

	public void setNomequipo(String nomequipo) {
		this.nomequipo = nomequipo;
	}

	public String getDirector() {
		return this.director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Set getCiclistas() {
		return this.ciclistas;
	}

	public void setCiclistas(Set ciclistas) {
		this.ciclistas = ciclistas;
	}

}
