package co.edu.ue.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

/**
 * The persistent class for the existencias database table.
 * 
 */
@Entity
@Table(name="existencias")
@NamedQuery(name="Existencia.findAll", query="SELECT e FROM Existencia e")
public class Existencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idExistencias")
	private int idExistencias;

	@Column(name="existencias")
	private int existencias;

	@Column(name="FK_disponibilidad")
	private int FK_disponibilidad;

	@Column(name="FK_producto")
	private int FK_producto;

	public Existencia() {
	}

	public int getIdExistencias() {
		return this.idExistencias;
	}

	public void setIdExistencias(int idExistencias) {
		this.idExistencias = idExistencias;
	}

	public int getExistencias() {
		return this.existencias;
	}

	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}

	public int getFK_disponibilidad() {
		return this.FK_disponibilidad;
	}

	public void setFK_disponibilidad(int FK_disponibilidad) {
		this.FK_disponibilidad = FK_disponibilidad;
	}

	public int getFK_producto() {
		return this.FK_producto;
	}

	public void setFK_producto(int FK_producto) {
		this.FK_producto = FK_producto;
	}

}