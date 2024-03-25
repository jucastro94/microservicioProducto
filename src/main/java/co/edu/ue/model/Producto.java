package co.edu.ue.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idProducto")
	private int idProducto;

	@Column(name="FK_idCategoria")
	private int FK_idCategoria;

	@Column(name="IVA")
	private double iva;

	@Column(name="nombre")
	private String nombre;

	@Column(name="precioUnitario")
	private int precioUnitario;

	public Producto() {
	}

	public int getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getFK_idCategoria() {
		return this.FK_idCategoria;
	}

	public void setFK_idCategoria(int FK_idCategoria) {
		this.FK_idCategoria = FK_idCategoria;
	}

	public double getIva() {
		return this.iva;
	}

	public void setIva(double iva) {
		this.iva = iva;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecioUnitario() {
		return this.precioUnitario;
	}

	public void setPrecioUnitario(int precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

}