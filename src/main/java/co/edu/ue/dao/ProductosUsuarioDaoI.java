package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.model.Productousuario;

public interface ProductosUsuarioDaoI {
	List<Productousuario> buscarxUsuario(int cedula);
	List<Productousuario> buscarxProducto(int idProducto);
	Productousuario addProductoUsuario(Productousuario productoUsuario);
}
