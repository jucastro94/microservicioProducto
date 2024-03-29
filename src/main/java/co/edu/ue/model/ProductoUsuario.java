package co.edu.ue.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;


/**
 * The persistent class for the productousuario database table.
 * 
 */
@Entity
@NamedQuery(name="Productousuario.findAll", query="SELECT p FROM Productousuario p")
public class Productousuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idProductoUsuario")
	private int idProductoUsuario;

	@Column(name="FK_producto")
	private int FK_producto;

	@Column(name="FK_usuario")
	private int FK_usuario;

	public Productousuario() {
	}

	public int getIdProductoUsuario() {
		return this.idProductoUsuario;
	}

	public void setIdProductoUsuario(int idProductoUsuario) {
		this.idProductoUsuario = idProductoUsuario;
	}

	public int getFK_producto() {
		return this.FK_producto;
	}

	public void setFK_producto(int FK_producto) {
		this.FK_producto = FK_producto;
	}

	public int getFK_usuario() {
		return this.FK_usuario;
	}

	public void setFK_usuario(int FK_usuario) {
		this.FK_usuario = FK_usuario;
	}

}