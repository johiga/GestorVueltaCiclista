package models;
// Generated 13-ene-2017 13:34:48 by Hibernate Tools 4.3.1.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Maillot generated by hbm2java
 */
public class Maillot implements java.io.Serializable {

	private String codigo;
	private String tipo;
	private String color;
	private Integer premio;
	private Set llevas = new HashSet(0);

	public Maillot() {
	}

	public Maillot(String codigo) {
		this.codigo = codigo;
	}

	public Maillot(String codigo, String tipo, String color, Integer premio, Set llevas) {
		this.codigo = codigo;
		this.tipo = tipo;
		this.color = color;
		this.premio = premio;
		this.llevas = llevas;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getPremio() {
		return this.premio;
	}

	public void setPremio(Integer premio) {
		this.premio = premio;
	}

	public Set getLlevas() {
		return this.llevas;
	}

	public void setLlevas(Set llevas) {
		this.llevas = llevas;
	}

}