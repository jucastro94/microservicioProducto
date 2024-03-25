package co.edu.ue.service;

import java.util.List;

import co.edu.ue.model.ProductoUsuario;

public interface ProductoUsuarioServiceI {
	List<ProductoUsuario> buscarxUsuario(int cedula);
	List<ProductoUsuario> buscarxProducto(int idProducto);
	ProductoUsuario addProductoUsuario(ProductoUsuario productoUsuario);

}
