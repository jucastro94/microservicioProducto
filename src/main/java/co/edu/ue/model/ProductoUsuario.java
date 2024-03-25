package co.edu.ue.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name="ProductoUsuario.findAll", query="SELECT pu FROM Categoria pu")
public class ProductoUsuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idProductoUsuario")
	private int idCategoria;

	@Column(name="FK_producto")
	private int FK_producto;
	
	@Column(name="FK_usuario")
	private int FK_usuario;
	
	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public int getFK_producto() {
		return FK_producto;
	}

	public void setFK_producto(int fK_producto) {
		FK_producto = fK_producto;
	}

	public int getFK_usuario() {
		return FK_usuario;
	}

	public void setFK_usuario(int fK_usuario) {
		FK_usuario = fK_usuario;
	}

	
}
