package co.edu.ue.service;

import java.util.List;

import co.edu.ue.model.Productousuario;

public interface ProductoUsuarioServiceI {
	List<Productousuario> buscarxUsuario(int cedula);
	List<Productousuario> buscarxProducto(int idProducto);
	Productousuario addProductoUsuario(Productousuario productoUsuario, int usu);

}
