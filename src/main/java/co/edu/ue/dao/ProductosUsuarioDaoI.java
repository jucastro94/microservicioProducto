package co.edu.ue.dao;

import java.util.List;

import co.edu.ue.model.ProductoUsuario;

public interface ProductosUsuarioDaoI {
	List<ProductoUsuario> buscarxUsuario(int cedula);
	List<ProductoUsuario> buscarxProducto(int idProducto);
	ProductoUsuario addProductoUsuario(ProductoUsuario productoUsuario);
}
