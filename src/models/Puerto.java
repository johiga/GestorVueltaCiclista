package models;
// Generated 13-ene-2017 13:34:48 by Hibernate Tools 4.3.1.Final

import java.math.BigDecimal;

/**
 * Puerto generated by hbm2java
 */
public class Puerto implements java.io.Serializable {

	private String nompuerto;
	private Ciclista ciclista;
	private Etapa etapa;
	private Integer altura;
	private Character categoria;
	private BigDecimal pendiente;

	public Puerto() {
	}

	public Puerto(String nompuerto, Etapa etapa) {
		this.nompuerto = nompuerto;
		this.etapa = etapa;
	}

	public Puerto(String nompuerto, Ciclista ciclista, Etapa etapa, Integer altura, Character categoria,
			BigDecimal pendiente) {
		this.nompuerto = nompuerto;
		this.ciclista = ciclista;
		this.etapa = etapa;
		this.altura = altura;
		this.categoria = categoria;
		this.pendiente = pendiente;
	}

	public String getNompuerto() {
		return this.nompuerto;
	}

	public void setNompuerto(String nompuerto) {
		this.nompuerto = nompuerto;
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

	public Integer getAltura() {
		return this.altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}

	public Character getCategoria() {
		return this.categoria;
	}

	public void setCategoria(Character categoria) {
		this.categoria = categoria;
	}

	public BigDecimal getPendiente() {
		return this.pendiente;
	}

	public void setPendiente(BigDecimal pendiente) {
		this.pendiente = pendiente;
	}

}
