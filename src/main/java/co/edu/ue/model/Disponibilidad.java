package co.edu.ue.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;


/**
 * The persistent class for the disponibilidad database table.
 * 
 */
@Entity
@NamedQuery(name="Disponibilidad.findAll", query="SELECT d FROM Disponibilidad d")
public class Disponibilidad implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idDisponibilidad")
	private int idDisponibilidad;
	
	@Column(name="disponibilidad")
	private String disponibilidad;

	public Disponibilidad() {
	}

	public int getIdDisponibilidad() {
		return this.idDisponibilidad;
	}

	public void setIdDisponibilidad(int idDisponibilidad) {
		this.idDisponibilidad = idDisponibilidad;
	}

	public String getDisponibilidad() {
		return this.disponibilidad;
	}

	public void setDisponibilidad(String disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

}