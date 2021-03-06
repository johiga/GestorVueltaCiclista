package models;
// Generated 13-ene-2017 13:34:48 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Ciclista generated by hbm2java
 */
public class Ciclista implements java.io.Serializable {

	private int dorsal;
	private Equipo equipo;
	private String nombre;
	private Integer edad;
	private Set etapas = new HashSet(0);
	private Set llevas = new HashSet(0);
	private Set puertos = new HashSet(0);

	public Ciclista() {
	}

	public Ciclista(int dorsal, String nombre) {
		this.dorsal = dorsal;
		this.nombre = nombre;
	}

	public Ciclista(int dorsal, String nombre, Equipo equipo, int edad) {

		this.dorsal = dorsal;
		this.equipo = equipo;
		this.nombre = nombre;
		this.edad = edad;
	}

	public Ciclista(int dorsal, Equipo equipo, String nombre, Integer edad, Set etapas, Set llevas, Set puertos) {
		this.dorsal = dorsal;
		this.equipo = equipo;
		this.nombre = nombre;
		this.edad = edad;
		this.etapas = etapas;
		this.llevas = llevas;
		this.puertos = puertos;
	}

	public int getDorsal() {
		return this.dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public Equipo getEquipo() {
		return this.equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return this.edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Set getEtapas() {
		return this.etapas;
	}

	public void setEtapas(Set etapas) {
		this.etapas = etapas;
	}

	public Set getLlevas() {
		return this.llevas;
	}

	public void setLlevas(Set llevas) {
		this.llevas = llevas;
	}

	public Set getPuertos() {
		return this.puertos;
	}

	public void setPuertos(Set puertos) {
		this.puertos = puertos;
	}

}
